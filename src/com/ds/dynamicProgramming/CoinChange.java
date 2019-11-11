package com.ds.dynamicProgs;

public class CoinChange {

	public static void main(String[] args) {

		int arr[] = {1,2,3}; 
		int m = arr.length;
		int n = 4; 
		System.out.println("Count: " + count(arr, m, n)); 
	}

	/**
	 * @param coins
	 * @param coinsCount
	 * @param sum
	 * @return
	 */
	private static int count(int[] coins, int coinsCount, int sum) {

		int[] table = new int[sum+1];

		table[0] = 1;

		for (int i=0;i<coinsCount;i++) {
			for (int j=coins[i];j<=sum;j++) {
				table[j] += table[j-coins[i]];
			}
		}

		return table[sum];
	}

}
