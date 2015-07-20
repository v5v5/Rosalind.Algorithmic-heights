package _10_HEA_BuildingAHeap;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Data.DataHEA data = new Data.DataHEA();
		Data.getData(data);

//		System.out.println("----- data in -----");
//		System.out.println("n: " + data.n);
//		System.out.println(Arrays.toString(data.a));

		 int[] dataOut = Algorithms.buildingAHeap(data);
		
//		 System.out.println("----- data out -----");
		 System.out.println(Arrays.toString(dataOut));
//		 Utils.outputToFile(dataOut);

	}

}
