package _02_DEG_DegreeArray;

import java.util.Arrays;

public class Main {
	
	static public class Edge {
		public int v0;
		public int v1;
		
		@Override
		public String toString() {
			return v0 + ", " + v1;
		}
	}
	
	static public class MyData {
		public int nVertexes;
		public int nEdges;
		public Edge[] edges;
	}

	public static void main(String[] args) {
		
		MyData data = new MyData();
		
		Algorithms.getDataIn(data);
		System.out.println("nVertexes: " + data.nVertexes);
		System.out.println("nEdges: " + data.nEdges);
		for (Edge edge : data.edges) {			
			System.out.println("edge: " + edge);
		}
		
		int[] dataOut = Algorithms.degreeArray(data);
		System.out.println(Arrays.toString(dataOut));
	}
}
