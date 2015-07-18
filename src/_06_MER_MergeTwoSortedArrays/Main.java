package _06_MER_MergeTwoSortedArrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Data.DataMER data = new Data.DataMER();

		Data.getData(data);

//		System.out.println("----- data in -----");		
//		System.out.println("countA: " + data.countA);
//		System.out.println("a: " + Arrays.toString(data.a));
//		System.out.println("countB: " + data.countB);
//		System.out.println("b: " + Arrays.toString(data.b));

		int[] dataOut = Algorithms.mergeTwoSortedArrays(data);
		System.out.println(Arrays.toString(dataOut));	
		
	}

}
