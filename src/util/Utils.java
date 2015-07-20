package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Utils {

	public static void outputToFile(int[] a) {

		// URL url = Utils.class.getResource("/out.txt");
		//
		// BufferedWriter out;
		//
		// OutputStreamWriter osw = new OutputStreamWriter(url.openStream());
		//
		// try {
		// out = new BufferedWriter(new OutputStreamWriter(url.openStream()));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		String path = Utils.class.getResource("/out.txt").getPath();

		try {
			PrintWriter writer = new PrintWriter(new File(path));
			for (int i = 0; i < a.length; i++) {
				if (i != 0) {
					writer.write(" ");
				}
				writer.write(Integer.toString(a[i]));
			}
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
