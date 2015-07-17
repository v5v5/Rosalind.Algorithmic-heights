package _02_DEG_DegreeArray;

import _02_DEG_DegreeArray.Data.DataDEG;
import _02_DEG_DegreeArray.Data.Edge;

public class Algorithms {
	
	public static int[] degreeArray(DataDEG data) {		
		int[] vertexes = new int[data.nVertexes];
		
		for (Edge edge : data.edges) {
			vertexes[edge.v0 - 1]++;
			vertexes[edge.v1 - 1]++;
		}
		
		return vertexes;
	}
}
