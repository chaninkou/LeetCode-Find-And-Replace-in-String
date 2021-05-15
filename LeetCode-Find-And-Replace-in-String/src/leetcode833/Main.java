package leetcode833;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String S = "abcd";
		int[] indexes = {0,2};
		String[] sources = {"a","cd"};
		String[] targets = {"eee","ffff"};
		
		System.out.println("S: " + S + " indexes: " + Arrays.toString(indexes) + " sources: " + Arrays.toString(sources) + " targets " + Arrays.toString(targets));
		
		System.out.println("Solution: " + findReplaceString(S, indexes, sources, targets));
		
		
	}

	public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
		StringBuilder sb = new StringBuilder(S);

		int len = S.length();

		int[] indexValInvert = new int[len];

		Arrays.fill(indexValInvert, -1);

		for (int i = 0; i < indexes.length; ++i) {

			indexValInvert[indexes[i]] = i;
		}

		for (int i = len - 1; i >= 0; --i) {
			int j = indexValInvert[i];

			if (j < 0) {
				continue;
			}

			if (S.substring(indexes[j]).startsWith(sources[j])) {

				sb.replace(indexes[j], indexes[j] + sources[j].length(), targets[j]);
			}
		}

		return sb.toString();
	}
}
