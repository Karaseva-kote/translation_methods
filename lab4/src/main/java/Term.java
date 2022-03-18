import java.util.regex.Pattern;

public class Term extends LexicalElement {
	public Pattern pattern;

	public Term(String name, Pattern pattern) {
		super(name);
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return name + "{" +
				"pattern=" + pattern +
				'}';
	}
}
