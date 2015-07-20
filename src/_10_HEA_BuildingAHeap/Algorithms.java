package _10_HEA_BuildingAHeap;

import _10_HEA_BuildingAHeap.Data.DataHEA;

public class Algorithms {

	public static int[] buildingAHeap(DataHEA data) {

		int[] heap = new int[data.a.length];

		System.arraycopy(data.a, 0, heap, 0, data.a.length);

//		for (int i = heap.length - 1; i >= 0; i--) {
//			// heapify(heap, i);
//		}

		int i = heap.length - 1;
		while (true) {
			i = heap.length - 1;
			i = bubbleUp(heap, i);
			
			if (i == -1) {
				break;
			}
		}

		return heap;
	}

	private static int bubbleUp(int[] a, int start) {
		int p;
		for (int i = start; i > 0; i--) {
			p = (i - 1) / 2;

			if (a[p] >= a[i]) {
				continue;
			}

			int temp = a[i];
			a[i] = a[p];
			a[p] = temp;

			return i - 1;
		}
		return -1;
	}

	private static void heapify(int[] heap, int i) {
		int l;
		int r;
		int largest;

		for (;;) {
			l = 2 * i + 1;
			r = 2 * i + 2;
			largest = i;

			if (l < heap.length && heap[l] > heap[largest]) {
				largest = l;
			}

			if (r < heap.length && heap[r] > heap[largest]) {
				largest = r;
			}

			if (largest == i) {
				break;
			}

			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			i = largest;
		}
	}

	private static void heapify0(int[] a, int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;

		if ((l < a.length) && (a[l] > a[i])) {
			largest = l;
		}

		if ((r < a.length) && (a[r] > a[largest])) {
			largest = r;
		}

		if (largest != i) {

			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;

			heapify0(a, largest);
			// heapify0(a, i);
		}
	}

	private static int right(int i) {
		return 2 * i + 2;
	}

	private static int left(int i) {
		return 2 * i + 1;
	}

}
