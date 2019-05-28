package sortings;

import comparisons.Comparables;

public class QuickSort<T> implements Sort <T>{

    @Override
    public long sort(T[] array, Comparables<T> comparables) {

		long start = System.currentTimeMillis();
		

			if (array == null || array.length == 0)
				return start;

			if (Comparables >= comparables)
				return start;

		// pick the pivot
		int middle = Comparables + (comparables - Comparables) / 2;
		int pivot = array[middle];

		// make left < pivot and right > pivot
		int i = Comparables, j = comparables;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (Comparables < j)
			quickSort(array, Comparables, j);

		if (comparables > i)
			quickSort(array, i, comparables);


        return System.currentTimeMillis() - start;
    }
}
