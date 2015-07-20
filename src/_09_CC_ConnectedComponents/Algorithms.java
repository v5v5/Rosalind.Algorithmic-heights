package _09_CC_ConnectedComponents;

import _09_CC_ConnectedComponents.Data.DataCC;

public class Algorithms {

	static boolean[] visited;
	static int[] pre;
	static int[] post;
	static int[] ccnum;
	private static int cc = 0;

	public static int connectedComponents(DataCC data) {

		dfs(data);

		return cc;
	}

	static void dfs(DataCC data) {

		visited = new boolean[data.nVertexes];
		pre = new int[data.nVertexes];
		post = new int[data.nVertexes];
		ccnum = new int[data.nVertexes];

		for (int v = 0; v < visited.length; v++) {
			visited[v] = false;
		}

		for (int v = 0; v < data.nVertexes; v++) {
			if (visited[v] == false) {
				cc++;
				explorer(data, v);
			}
		}
	}

	static void explorer(DataCC data, int v) {
		visited[v] = true;
		previsit(v);

		int u;

		for (int i = 0; i < data.edges.length; i++) {

			if ((data.edges[i].v0 - 1) == v) {
				u = data.edges[i].v1 - 1;
			} else if ((data.edges[i].v1 - 1) == v) {
				u = data.edges[i].v0 - 1;
			} else {
				continue;
			}

			if (visited[u] == false) {
				explorer(data, u);
			}
		}

		postvisit(v);
	}

	private static void postvisit(int v) {
		post[v]++;
	}

	private static void previsit(int v) {
		ccnum[v] = cc;
		pre[v]++;
	}
}
