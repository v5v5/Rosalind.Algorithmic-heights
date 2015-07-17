package _02_DEG_DegreeArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Data {

	static public class DataDEG {
		public int nVertexes;
		public int nEdges;
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
	
	public static void getData(DataDEG data) {
		URL url = Algorithms.class.getResource("/02_DEG_DegreeArray.txt");

		BufferedReader in;
		ArrayList<Edge> edges = new ArrayList<Edge>();

		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String[] pair;
			String line;
			int iLine = -1;
			Edge edge;

			while ((line = in.readLine()) != null) {

				pair = line.split(" ");

				iLine++;
				if (iLine == 0) {
					data.nVertexes = Integer.parseInt(pair[0]);
					data.nEdges = Integer.parseInt(pair[1]);
					continue;
				}

				edge = new Edge();
				edge.v0 = Integer.parseInt(pair[0]);
				edge.v1 = Integer.parseInt(pair[1]);

				edges.add(edge);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		data.edges = new Edge[edges.size()];
		data.edges = edges.toArray(data.edges);
	}

}
