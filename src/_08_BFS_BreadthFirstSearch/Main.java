package _08_BFS_BreadthFirstSearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Data.DataBFS data = new Data.DataBFS();
		Data.getData(data);

		System.out.println("----- data in -----");
		System.out.println("n: " + data.nVertexes);
		System.out.println("m: " + data.mEdges);
		for (int i = 0; i < data.edges.length; i++) {
			System.out.println(data.edges[i]);
		}

		int[] dataOut = Algorithms.breathFirstSearch(data);

		System.out.println("----- data out -----");
		System.out.println(Arrays.toString(dataOut));

	}

}
