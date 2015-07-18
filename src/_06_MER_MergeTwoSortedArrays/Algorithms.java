package _06_MER_MergeTwoSortedArrays;

import _06_MER_MergeTwoSortedArrays.Data.DataMER;

public class Algorithms {

	public static int[] mergeTwoSortedArrays(DataMER data) {

		int[] out = new int[data.a.length + data.b.length];
		int[] arrMin;
		int[] arrMax;

		if (data.a.length < data.b.length) {
			arrMin = data.a;
			arrMax = data.b;
		} else {
			arrMin = data.b;
			arrMax = data.a;
		}

		int iOut = 0;
		int iMin = 0;
		int iMax = 0;
		
		while (true) {
			
			if (iMin == arrMin.length) {
				System.arraycopy(arrMax, iMax, out, iOut, out.length - iOut);
				break;
			}
			if (iMax == arrMax.length) {
				System.arraycopy(arrMin, iMin, out, iOut, out.length - iOut);
				break;
			}
			
			if (arrMin[iMin] < arrMax[iMax]) {
				out[iOut] = arrMin[iMin];
				iOut++;
				iMin++;
			} else if (arrMin[iMin] > arrMax[iMax]) {
				out[iOut] = arrMax[iMax];
				iOut++;
				iMax++;
			} else {
				out[iOut] = arrMax[iMax];
				iOut++;
				iMax++;
				out[iOut] = arrMin[iMin];
				iOut++;
				iMin++;
			}

		}

//		while ((iMin < arrMin.length) && (iMax < arrMax.length)) {
//
//			if (arrMin[iMin] < arrMax[iMax]) {
//				out[iOut] = arrMin[iMin];
//				iOut++;
//				iMin++;
//			} else if (arrMin[iMin] > arrMax[iMax]) {
//				out[iOut] = arrMax[iMax];
//				iOut++;
//				iMax++;
//			} else {
//				out[iOut] = arrMax[iMax];
//				iOut++;
//				iMin++;
//				out[iOut] = arrMin[iMin];
//				iOut++;
//				iMax++;
//			}
//		}
//
//		System.arraycopy(arrMax, iMax, out, iOut, out.length - iOut);

		return out;
	}

}
