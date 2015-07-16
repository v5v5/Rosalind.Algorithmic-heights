package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import _01_BINS_BinarySearch.Main.MyData;


public class DataLoaderFromFile {

	static public void load(String filePath, MyData data) {

		BufferedReader br;
		String line = null;
		int iLine = 0;
		try {
			br = new BufferedReader(new FileReader(filePath));

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
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
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
