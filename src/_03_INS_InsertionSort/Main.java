package _03_INS_InsertionSort;

public class Main {
	public static void main(String[] args) {

		int[] integers = Data.getData();

		int count = Algorithms.insertionSort(integers);

		System.out.println(count);
	}
}
