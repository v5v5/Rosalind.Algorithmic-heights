package _05_MAJ_MajorityElement;

import java.util.Arrays;

import _05_MAJ_MajorityElement.Data.DataMAJ;

public class Algorithms {

	public static int[] majorityElement(DataMAJ data) {

		int[] out = new int[data.a.length];

		for (int i = 0; i < data.a.length; i++) {

			Arrays.sort(data.a[i]);
			out[i] = -1;

			int start = 0;
			int finish = 0;
			int count;

			for (int j = 1; j < data.a[i].length; j++) {

				if (data.a[i][j] != data.a[i][j - 1]) {
					start = j;
				} else {
					finish = j;
					count = finish - start + 1;

					if (count > data.n / 2) {
						out[i] = data.a[i][finish];
						break;
					}
				}
			}
		}

		return out;
	}

}
