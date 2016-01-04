
public class MegreSort {

	public int[] merge(int data[], int start, int mid, int end) {
		int sortedList[] = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			sortedList[i] = data[i]; // store array in temp file for reference
		}
		int i = start;
		int j = mid + 1;
		int z = start;
		while (i <= mid && j <= end) {
			if (sortedList[i] <= sortedList[j]) {
				data[z] = sortedList[i];
				i++;
			} else {
				data[z] = sortedList[j];
				j++;
			}
			z++;
		}
		if (i <= mid) {
			for (int k = z; k <= end; k++) {
				data[k] = sortedList[i]; // If left array is not traveresed
											// completely
				i++;
			}
		} else if (j <= end) {
			for (int k = z; k <= end; k++) {
				data[k] = sortedList[j]; // If right array is not traveresed
											// completely
				j++;
			}
		}
		return data;
	}

	public int[] mergeSort(int data[], int start, int end) {
		int mid;

		if (start < end) {
			mid = ((start + end) / 2);
			data = mergeSort(data, start, mid); // mergesort on Left part of
												// array
			data = mergeSort(data, mid + 1, end); // mergesort on Right part of
													// array
			data = merge(data, start, mid, end);
		}
		return data;
	}
}
