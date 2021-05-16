package leetcode833;

import java.util.Arrays;

public class FindAndReplaceString {
	public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
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
