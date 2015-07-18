package _07_2SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {

	public static class Data2SUM {
		public int k;
		public int n;
		public int[][] a;
	}

	public static void getData(Data2SUM data) {
		URL url = Data.class.getResource("/07_2SUM.txt");

		BufferedReader in;
		
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			int iLine = -1;
			String line;
			String[] pair;

			while ((line = in.readLine()) != null) {
				iLine++;

				if (iLine == 0) {
					pair = line.split(" ");
					data.k = Integer.parseInt(pair[0]);
					data.n = Integer.parseInt(pair[1]);
					data.a = new int[data.k][];
					continue;
				}

				data.a[iLine - 1] = getIntegers(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int[] getIntegers(String line) {
		String[] parts = line.split(" ");
		int[] integers = new int[parts.length];
		int i = 0;
		for (String str : parts) {
			integers[i] = Integer.parseInt(str.trim());
			i++;
		}
		return integers;
	}

}
