package _04_DDEG_DoubleDegreeArray;

import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
		
		Data.DataDDEG data = new Data.DataDDEG();
		
		Data.getData(data);
		
		int[] dataOut = Algorithms.doubleDegreeArray(data);
		System.out.println(Arrays.toString(dataOut));
	}
}
