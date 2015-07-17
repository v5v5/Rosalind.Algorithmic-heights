package _03_INS_InsertionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Data {

	public static int[] getData() {
		int[] integers = null;

		URL url = Data.class.getResource("/03_INS_InsertionSort.txt");

		BufferedReader in;

		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String line;
			int iLine = -1;

			while ((line = in.readLine()) != null) {

				iLine++;
				if (iLine == 0) {
					continue;
				}

				integers = getIntegers(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return integers;
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
