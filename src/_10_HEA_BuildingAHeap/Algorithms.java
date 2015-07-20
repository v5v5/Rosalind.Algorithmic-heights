package _10_HEA_BuildingAHeap;

import _10_HEA_BuildingAHeap.Data.DataHEA;

public class Algorithms {

	public static int[] buildingAHeap(DataHEA data) {

		int[] heap = new int[data.a.length];

		System.arraycopy(data.a, 0, heap, 0, data.a.length);

		for (int i = heap.length / 2; i > 0; i--) {
			heapify0(heap, i);
		}

		return heap;
	}

	private static void heapify(int[] heap, int i) {
		int tmp = heap[i];
		int child;

		for (; left(i) <= heap.length; i = child) {
			child = left(i);

			if (child != heap.length && heap[child] > heap[child + 1]) {
				child++;
			}

			if (tmp > heap[child]) {
				heap[i] = heap[child];
			} else {
				break;
			}
		}
		heap[i] = tmp;
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
		}
	}

	private static int right(int i) {
		return 2 * i + 2;
	}

	private static int left(int i) {
		return 2 * i + 1;
	}

}
