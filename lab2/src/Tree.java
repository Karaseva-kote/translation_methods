import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    String node;
    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
    }

    public String toString() {
        if (children == null) {
            return node;
        }
        if (children.size() == 1) {
            return "(" + node + " " + children.get(0) + ")";
        }
        return "(" + children.get(0) + " " + node + " " + children.get(1) + ")" ;
    }

    public String toDot(String test) {
        return "digraph Grammar {\n" +
                "\"" + node + 0 + "\"[label=\"" + node + "\"]\n" +
                toDot(0).getKey() +
                "\nlabel=\"test: " + test + "\"\n}";
    }

    private Pair<String, Integer> toDot(int i) {
        if (children == null || children.isEmpty()) {
            return new Pair<>("\"" + node + i + "\"", i+1);
        }
        int m_i = i;
        i++;

        List<String> childrenString = new ArrayList<String>();
        List<String> initChildren = new ArrayList<String>();

        for(Tree it : children) {
            Pair<String, Integer> p = it.toDot(i);
            childrenString.add(p.getKey());
            initChildren.add("\"" + it.node + i + "\"[label=" + "\"" + it.node + "\"]");
            i = p.getValue();

        }

        return new Pair<>("\"" + node + m_i + "\"->" + String.join("\n\"" + node + m_i + "\"->", childrenString) + "\n" + String.join("\n", initChildren), i+1);
    }

    private class Pair<T,U> {
        private final T key;
        private final U value;

        public Pair(T key, U value) {
            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return this.key;
        }

        public U getValue() {
            return this.value;
        }
    }
}

