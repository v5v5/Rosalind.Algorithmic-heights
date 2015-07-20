package _10_HEA_BuildingAHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {

	public static class DataHEA {
		public int n;
		public int[] a;
	}
	
	public static void getData(DataHEA data) {
		URL url = Data.class.getResource("/10_HEA_BuildingAHeap.txt");

		BufferedReader in;
		
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			int iLine = -1;
			String line;

			while ((line = in.readLine()) != null) {

				iLine++;
				if (iLine == 0) {
					data.n = Integer.parseInt(line);
					continue;
				}
				
				data.a = getIntegers(line);
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
