
public class InsertionSort {

	public int[] insertionSort(int data[]) {
		int key;

		for (int i = 1; i < data.length; i++) // Insertion Sort
		{
			key = data[i];
			int j = i - 1;
			while (j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				j = j - 1;
			}
			data[j + 1] = key;
		}

		return data;
	}

}
