import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Grammar {
	public String name;
	public List<Term> term;
	public List<NonTerm> nonterm;
	public Map<String, Set<String>> first;
	public Map<String, Set<String>> follow;

	public Grammar() {
		this.term = new ArrayList<>();
		this.nonterm = new ArrayList<>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isNonterm(String element) {
		return nonterm.stream().anyMatch(nt -> nt.name.equals(element));
	}

	public String getType(String element) {
		return nonterm.stream().filter(nt -> nt.name.equals(element))
				.map(nt -> nt.returnType.equals("void")? "" : nt.returnType + " val_" + element + " = ")
				.findFirst().orElseThrow();
	}

	public void makeFirst() {
		first = new TreeMap<>();
		nonterm.forEach(nt -> first.put(nt.name, new HashSet<>()));
		term.forEach(t -> first.put(t.name, Set.of(t.name)));
		boolean change = true;
		while (change) {
			change = false;
			for(NonTerm nt : nonterm) {
				for(Rule p : nt.list) {
					for(int i = 0; i < p.lexElems.size(); i++) {
						String s = p.lexElems.get(i).name;
						change = change || first.get(nt.name).addAll(first.get(s));
						if (first.get(s).contains("EPS")) {
							if (i == p.lexElems.size() - 1) {
								change = change || first.get(nt.name).add("EPS");
							}
						} else {
							break;
						}
					}
				}
			}
		}
	}

	public void makeFollow() {
		follow = new TreeMap<>();
		nonterm.forEach(nt -> follow.put(nt.name, new HashSet<>()));
		term.forEach(t -> follow.put(t.name, new HashSet<>()));
		follow.get(nonterm.get(0).name).add("EOF");
		boolean change = true;
		while (change) {
			change = false;
			for(NonTerm nt : nonterm) {
				boolean eps = true;
				for(Rule p : nt.list) {
					for(int i = p.lexElems.size() - 1; i >= 0; i--) {
						String s = p.lexElems.get(i).name;
						if (i == p.lexElems.size() - 1) {
							change = change || follow.get(s).addAll(follow.get(nt.name));
							continue;
						}
						String next = p.lexElems.get(i + 1).name;
						eps = eps && first.get(next).contains("EPS");
						if (eps) {
							change = change || follow.get(s).addAll(follow.get(nt.name));
							change = change || follow.get(s).addAll(first.get(next).stream().filter(x -> !x.equals("EPS"))
									.collect(Collectors.toSet()));
						} else {
							change = change || follow.get(s).addAll(first.get(next));
						}
					}
				}
			}
		}
	}

	public void generate(String path) throws IOException {
		this.makeFirst();
		this.makeFollow();
		this.checkLL1();
		File file = new File(path + "\\" + name.toLowerCase());
		file.mkdir();
		path = path + "\\" + name.toLowerCase();
		(new GeneratorToken(this, path)).generate("Token");
		(new GeneratorLexer(this, path)).generate("Lexer");
		(new GeneratorParser(this, path)).generate("Parser");
		(new GeneratorRun(this, path)).generate("Run");
	}

	public boolean checkLL1() {
		for (NonTerm nt : nonterm) {
			for (int i = 0; i < nt.list.size(); i++) {
				Set<String> firstA = getFirst(nt.list.get(i));
				// A→α, A→β,A∈N ⇒ FIRST(α)∩FIRST(β)=∅
				for (int j = i + 1; j < nt.list.size(); j++) {
					Set<String> firstB = getFirst(nt.list.get(j));
					firstB.retainAll(firstA);
					if(firstB.size() > 0) {
						return false;
					}
				}
				// A→α, A→β,A∈N, ε∈FIRST(α) ⇒ FOLLOW(A)∩FIRST(β)=∅
				if (firstA.contains("EPS")) {
					for (int j = 0; j < nt.list.size(); j++) {
						Set<String> firstB = getFirst(nt.list.get(j));
						firstB.retainAll(follow.get(nt.name));
						if(firstB.size() > 0) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	private Set<String> getFirst(Rule rule) {
		Set<String> res = new HashSet<>();
		for(int i = 0; i < rule.lexElems.size(); i++) {
			String element = rule.lexElems.get(i).name;
			if(first.get(element).contains("EPS")) {
				if (i < rule.lexElems.size() - 1) {
					res.addAll(first.get(element).stream().filter(x -> !x.equals("EPS")).collect(Collectors.toSet()));
					continue;
				}
			}
			res.addAll(first.get(element));
			break;
		}
		return res;
	}
}
