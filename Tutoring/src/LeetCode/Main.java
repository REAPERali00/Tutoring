package LeetCode;

import java.util.List;

public class Main {
	private static Interview solution = new Interview();

	public static void main(String[] args) {
		List<String> res = new TextJustify().fullJustify(
				new String[] { "This", "is", "an", "example", "of", "text", "justification." },
				16);
		System.out.println(res);
	}

}
