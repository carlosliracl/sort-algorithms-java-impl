package com.carloslira.sort_algorithms;

public class QuickSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		sort(values, 0, values.length);
	}

	private void sort(int[] values, int start, int end) {
		if (end - start < 2) {
			return;
		}
		int pivotIndex = position(values, start, end);
		sort(values, pivotIndex + 1, end);
		sort(values, start, pivotIndex);
	}

	private int position(int[] values, int start, int end) {

		int pivot = values[start];
		int i = start;
		int j = end;

		while (i < j) {

			do {
				if (values[--j] <= pivot && i < j) {
					values[i] = values[j];
				}
			} while (values[j] >= pivot && j > i);
			
			do {
				if (values[++i] >= pivot && i < j) {
					values[j] = values[i];
				}
			} while (values[i] <= pivot && i < j);

		}
		values[j] = pivot;
		return j;
	}

}
