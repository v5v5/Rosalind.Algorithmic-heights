package _08_BFS_BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

import _08_BFS_BreadthFirstSearch.Data.DataBFS;

public class Algorithms {

	public static int[] breathFirstSearch(DataBFS data) {
		int[] dist = new int[data.nVertexes];
		int inVertex = 1;

		for (int j = 0; j < dist.length; j++) {
			dist[j] = -1;
		}

		dist[inVertex - 1] = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(inVertex);

		int u;

		while (!q.isEmpty()) {
			u = q.poll();
			for (int i = 0; i < data.edges.length; i++) {
				if (data.edges[i].v0 != u) {
					continue;
				}

				if (dist[data.edges[i].v1 - 1] != -1) {
					continue;
				}

				q.offer(data.edges[i].v1);
				dist[data.edges[i].v1 - 1] = dist[data.edges[i].v0 - 1] + 1;
			}
		}

		return dist;
	}

}
