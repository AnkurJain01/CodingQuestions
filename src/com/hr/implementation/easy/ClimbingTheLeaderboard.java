package com.hr.implementation.easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimbingTheLeaderboard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];

		List<Integer> distinctSortedScores = new ArrayList<Integer>();

		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}

		for (int scores_i = 0; scores_i < n; scores_i++) {
			if (scores_i == 0 || distinctSortedScores.get(distinctSortedScores.size() - 1) != scores[scores_i])
				distinctSortedScores.add(scores[scores_i]);
		}

		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		// Write Your Code Here
		in.close();
		findRank(distinctSortedScores, alice);

	}

	private static void findRank(List<Integer> distinctSortedScores, int[] alice) {

		for (int i = 0; i < alice.length; i++) {
			int marks = alice[i];
			int end = distinctSortedScores.size();
			int start = 0;
			while (end >= start) {
				int mid = start + (end - start) / 2;

				if (distinctSortedScores.get(mid) == marks) {
					System.out.println(mid + 1);
					break;
				}

				if (mid <= 0 && marks > distinctSortedScores.get(0)) {
					System.out.println("1");
					break;
				} else if (mid >= distinctSortedScores.size() - 1
						&& marks < distinctSortedScores.get(distinctSortedScores.size() - 1)) {
					System.out.println(distinctSortedScores.size() + 1);
					break;
				} else if (marks < distinctSortedScores.get(mid) && marks > distinctSortedScores.get(mid + 1)) {
					System.out.println(mid + 2);
					break;
				} else if (distinctSortedScores.get(mid) > marks) {
					start = mid;
				} else if (distinctSortedScores.get(mid) < marks) {
					end = mid;
				}
			}
		}
	}
}
