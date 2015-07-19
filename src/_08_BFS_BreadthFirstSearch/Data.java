package _08_BFS_BreadthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {

	public static class DataBFS {
		public int nVertexes;
		public int mEdges;
		public Edge[] edges;
	}
	
	static public class Edge {
		public int v0;
		public int v1;

		@Override
		public String toString() {
			return v0 + ", " + v1;
		}
	}

	public static void getData(DataBFS data) {
		URL url = Data.class.getResource("/08_BFS_BreadthFirstSearch.txt");

		BufferedReader in;
		
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			int iLine = -1;
			String line;
			String[] pair;
			Edge edge;

			while ((line = in.readLine()) != null) {
				pair = line.split(" ");

				iLine++;
				if (iLine == 0) {
					data.nVertexes = Integer.parseInt(pair[0]);
					data.mEdges = Integer.parseInt(pair[1]);
					data.edges = new Edge[data.mEdges];
					continue;
				}

				edge = new Edge();
				edge.v0 = Integer.parseInt(pair[0]);
				edge.v1 = Integer.parseInt(pair[1]);
				
				data.edges[iLine - 1] = edge;
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
