package _04_DDEG_DoubleDegreeArray;

import _04_DDEG_DoubleDegreeArray.Data.DataDDEG;

public class Algorithms {

	public static int[] doubleDegreeArray(DataDDEG data) {

		int[] vertexes = new int[data.nVertexes];
		int countEdges;

		for (int i = 0; i < vertexes.length; i++) {

			int[] neighbors = getNeighbors(data, i + 1);
			countEdges = 0;

			for (int j = 0; j < neighbors.length; j++) {
				countEdges += getCountEdges(data, neighbors[j]);
			}
			vertexes[i] = countEdges;
		}

		return vertexes;
	}

	private static int[] getNeighbors(DataDDEG data, int i) {
		int count = getCountEdges(data, i);
		int[] neighbors = new int[count];
		int indexNeighbor = 0;

		for (int j = 0; j < data.edges.length; j++) {
			if (data.edges[j].v0 == i) {
				neighbors[indexNeighbor] = data.edges[j].v1;
				indexNeighbor++;
			} else if (data.edges[j].v1 == i) {
				neighbors[indexNeighbor] = data.edges[j].v0;
				indexNeighbor++;
			}
		}

		return neighbors;
	}

	private static int getCountEdges(DataDDEG data, int i) {

		int count = 0;

		for (int j = 0; j < data.edges.length; j++) {
			if ((data.edges[j].v0 != i) && (data.edges[j].v1 != i)) {
				continue;
			}
			count++;
		}
		return count;
	}

}
