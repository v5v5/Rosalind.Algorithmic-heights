package _01_BINS_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {
	public static class DataBINS {
		public int[] sortedArray;
		public int[] integers;
	}

	public static void getData(DataBINS data) {
		URL url = Data.class.getResource("/01_BINS_BinarySearch.txt");

		BufferedReader in;
		
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			int iLine = 0;
			String line;

			while ((line = in.readLine()) != null) {
				switch (iLine) {
				case 2:
					data.sortedArray = getIntegers(line);
					break;
				case 3:
					data.integers = getIntegers(line);
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
