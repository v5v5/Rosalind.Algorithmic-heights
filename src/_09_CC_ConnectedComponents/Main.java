package _09_CC_ConnectedComponents;

public class Main {

	public static void main(String[] args) {

		Data.DataCC data = new Data.DataCC();
		Data.getData(data);

//		System.out.println("----- data in -----");
//		System.out.println("n: " + data.nVertexes);
//		System.out.println("m: " + data.mEdges);
//		for (int i = 0; i < data.edges.length; i++) {
//			System.out.println(data.edges[i]);
//		}

		int dataOut = Algorithms.connectedComponents(data);

		System.out.println("----- data out -----");
		System.out.println(dataOut);

	}

}
