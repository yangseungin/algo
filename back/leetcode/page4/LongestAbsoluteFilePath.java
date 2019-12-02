package page4;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePath {
	public static void main(String[] args) {
		System.out.println(lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
	}

	public static int lengthLongestPath(String input) {
		System.out.println(input);
		Map<Integer, Integer> depths = new HashMap<>();
		int result = 0;
		String[] lines = input.split("\n");
		for (String line : lines) {
			int depth = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '\t') {
					depth++;
				}
			}
			depths.put(depth, line.length() - depth + depths.getOrDefault(depth - 1, 0));
			if (line.indexOf('.') >= 0) {
				result = Math.max(result, depths.get(depth) + depth);
			}
		}
		return result;
	}

}
