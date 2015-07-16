package _01_BINS_BinarySearch;

import java.util.Arrays;

import utils.DataLoaderFromFile;

public class Main {

	// static int[] sortedArray = { 10, 20, 30, 40, 50 };
	// static int[] integers = { 40, 10, 35, 15, 40, 20 };

//	static ArrayList<Integer> sortedArray;
//	static ArrayList<Integer> integers;
	
	public static class MyData {
		public int[] sortedArray;
		public int[] integers;
	}

	public static void main(String[] args) {
		
		MyData data = new MyData();
		
		DataLoaderFromFile.load("D:/rosalind_bins.txt", data);
		
//		System.out.println(Arrays.toString(data.sortedArray));
//		System.out.println(Arrays.toString(data.integers));		
		
		System.out.println(Arrays.toString(Algorithms.binarySearch(data.sortedArray, data.integers)));
	}
}

