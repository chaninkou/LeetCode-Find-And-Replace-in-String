package leetcode833;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String S = "abcd";
		int[] indexes = {0,2};
		String[] sources = {"a","cd"};
		String[] targets = {"eee","ffff"};
		
		System.out.println("S: " + S + " indexes: " + Arrays.toString(indexes) + " sources: " + Arrays.toString(sources) + " targets " + Arrays.toString(targets));
		
		FindAndReplaceString solution = new FindAndReplaceString();
		
		System.out.println("Solution: " + solution.findReplaceString(S, indexes, sources, targets));
		
		
	}
}
