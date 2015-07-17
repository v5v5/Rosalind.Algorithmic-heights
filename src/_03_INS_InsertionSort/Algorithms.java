package _03_INS_InsertionSort;

public class Algorithms {

	public static int insertionSort(int[] a) {
		int count = 0;
		int k;
		for (int i = 1; i < a.length; i++) {
			k = i;
			while ((k > 0) && (a[k] < a[k - 1])) {
				swap(a, k - 1, k);
				count++;
				k--;
			}
		}
		return count;
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}