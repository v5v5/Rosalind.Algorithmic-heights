package _01_BINS_BinarySearch;

import java.util.Arrays;

public class Main {

	// static int[] sortedArray = { 10, 20, 30, 40, 50 };
	// static int[] integers = { 40, 10, 35, 15, 40, 20 };
	

	public static void main(String[] args) {
		
		Data.DataBINS data = new Data.DataBINS();
		
		Data.getData(data);		
		
//		System.out.println(Arrays.toString(data.sortedArray));
//		System.out.println(Arrays.toString(data.integers));		
		
		System.out.println(Arrays.toString(Algorithms.binarySearch(data.sortedArray, data.integers)));
	}
}

