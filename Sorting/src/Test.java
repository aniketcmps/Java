
public class Test {

	public static void main(String args[]) {
		int A[] = { 20, 18, 10, 7, 12, 8, 9, 5, 4, 2, 1, 7, -1 - 12, 201, 0, -125, 4589 };

		HeapSort q = new HeapSort();
		A = q.heapSort(A);

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

		// System.out.println((2 * 2) + 1);
	}
}
