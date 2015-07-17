package _02_DEG_DegreeArray;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Data.DataDEG data = new Data.DataDEG();
		
		Data.getData(data);
		System.out.println("nVertexes: " + data.nVertexes);
		System.out.println("nEdges: " + data.nEdges);

//		for (Edge edge : data.edges) {			
//			System.out.println("edge: " + edge);
//		}
		
		int[] dataOut = Algorithms.degreeArray(data);
		System.out.println(Arrays.toString(dataOut));
	}
}
