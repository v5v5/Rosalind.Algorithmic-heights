package _06_MER_MergeTwoSortedArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {

	public static class DataMER {
		public int countA;
		public int[] a;
		public int countB;
		public int[] b;
	}

	public static void getData(DataMER data) {
		URL url = Data.class.getResource("/06_MER_MergeTwoSortedArrays.txt");

		BufferedReader in;
		
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			int iLine = 0;
			String line;

			while ((line = in.readLine()) != null) {
				switch (iLine) {
				case 0:
					data.countA = Integer.parseInt(line.trim());
					break;
				case 1:
					data.a = getIntegers(line);
					break;
				case 2:
					data.countB = Integer.parseInt(line.trim());
					break;
				case 3:
					data.b = getIntegers(line);
					break;
				default:
					break;
				}
				iLine++;
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
