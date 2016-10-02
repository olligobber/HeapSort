
public class HeapSort {
	
	public static void swap(int[] array, int first, int second) {
		if (first < array.length && second < array.length) {
			int temp = array[first];
			array[first] = array[second];
			array[second] = temp;
		}
	}
	
	public static void siftDown(int[] array, int element, int length) {
		while (true) {
			if (element * 2 + 2 < length) {
				if (array[element * 2 + 2] < array[element * 2 + 1]) {
					if (array[element * 2 + 2] < array[element]) {
						swap(array, element, element * 2 + 2);
						element = element * 2 + 2;
					}
				}
				else {
					if (array[element * 2 + 1] < array[element]) {
						swap(array, element, element * 2 + 1);
						element = element * 2 + 1;
					}
				}
			}
			else if (element * 2 + 1 < length) {
				if (array[element * 2 + 1] < array[element]) {
					swap(array, element, element * 2 + 1);
					element = element * 2 + 1;
				}
			}
			else {
				break;
			}
		}
	}
	
	public static void heapify(int[] array) {
		for (int i = array.length - 1; i >= 0; --i) {
			siftDown(array, i, array.length);
		}
	}
	
	public static void sort(int[] array) {
		heapify(array);
		for (int last = array.length-1; last > 0; last--) {
			swap(array, 0, last);
			siftDown(array, 0, last);
		}
	}
}
