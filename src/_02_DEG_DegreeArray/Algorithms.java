package _02_DEG_DegreeArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import _02_DEG_DegreeArray.Main.Edge;
import _02_DEG_DegreeArray.Main.MyData;

public class Algorithms {

	public static void getDataIn(MyData data) {
		// URL url =
		// Algorithms.class.getResource("/resources/02_DEG_DegreeArray.txt");
		URL url = Algorithms.class.getResource("/02_DEG_DegreeArray.txt");

		ArrayList<Edge> edges = new ArrayList<Edge>();
		int iLine = -1;
		Edge edge;
		String[] pair;

		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
//				System.out.println(line);

				iLine++;
				pair = line.split(" ");

				if (iLine == 0) {
					pair = line.split(" ");

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

	public static int[] degreeArray(MyData data) {		
		int[] vertexes = new int[data.nVertexes];
		
		for (Edge edge : data.edges) {
			vertexes[edge.v0 - 1]++;
			vertexes[edge.v1 - 1]++;
		}
		
		return vertexes;
	}

}
