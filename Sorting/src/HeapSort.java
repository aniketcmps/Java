
public class HeapSort {

	int heapSize;

	public HeapSort() {
		heapSize = -1;
	}

	private int parent(int i) {
		if (i % 2 == 0)
			return (i / 2) - 1;
		else
			return i / 2;
	}

	private int left(int i) {
		return (2 * i) + 1;
	}

	private int right(int i) {
		return (2 * i) + 2;
	}

	private int[] maxHeapify(int data[], int i) {
		int l = left(i);
		int r = right(i);
		int largest = 0;
		if (l <= heapSize && data[l] > data[i])
			largest = l;
		else
			largest = i;
		if (l <= heapSize && r <= heapSize && data[r] > data[largest])
			largest = r;
		if (largest != i) {
			int temp = data[i];
			data[i] = data[largest];
			data[largest] = temp;
			data = maxHeapify(data, largest);
		}
		return data;
	}

	private int[] buildMaxHeap(int data[]) {
		heapSize = data.length - 1;
		for (int i = (data.length - 1) / 2; i >= 0; i--)
			data = maxHeapify(data, i);
		return data;
	}

	public int[] heapSort(int data[]) {
		data = buildMaxHeap(data);
		for (int i = data.length - 1; i >= 0; i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			heapSize--;
			data = maxHeapify(data, 0);
		}
		return data;
	}
}
