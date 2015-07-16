package _01_BINS_BinarySearch;

public class Algorithms {

	static public int[] binarySearch(int[] sortedArray, int[] integers) {
		int n = sortedArray.length;
		int m = integers.length;

		int[] indexes = new int[m];

		for (int i = 0; i < integers.length; i++) {
			indexes[i] = search(sortedArray, 0, n - 1, integers[i]);
		}

		return indexes;
	}

	private static int search(int[] sortedArray, int iLow, int iHigh, int k) {
		int n = (iHigh - iLow) / 2 + iLow;
		
		if (k == sortedArray[n]) {
			return n + 1;
		}

		// TODO required check
		if (iLow == iHigh - 1) {
			return -1;
		}

		int newLow;
		int newHigh;

		if (k < sortedArray[n]) {
			newLow = iLow;
			newHigh = n;
		} else {
			newLow = n;
			newHigh = iHigh;
		}

		return search(sortedArray, newLow, newHigh, k);
	}

}
