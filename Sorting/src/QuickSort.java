
public class QuickSort {

	private int partition(int[] data, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = data[end];
		int i = start;
		int j = end - 1;

		while (true) {
			while (j >= start) {
				if (data[j] < pivot)
					break;
				else
					j--;
			}
			while (i < end) {
				if (data[i] >= pivot)
					break;
				else
					i++;
			}
			if (i < j) {
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			} else {
				int temp = data[end];
				data[end] = data[i];
				data[i] = temp;
				return i;
			}
		}
	}

	public int[] quickSort(int data[], int start, int end) {
		int q;

		if (start < end) {
			q = partition(data, start, end);
			data = quickSort(data, start, q - 1);
			data = quickSort(data, q + 1, end);
		}
		return data;
	}

}
