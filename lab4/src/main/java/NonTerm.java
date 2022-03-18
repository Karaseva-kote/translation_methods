import java.util.List;

public class NonTerm extends LexicalElement {
	public String args;
	public String returnType;
	public List<Rule> list;

	public NonTerm(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return name + "{" +
				"list=" + list +
				'}';
	}
}
