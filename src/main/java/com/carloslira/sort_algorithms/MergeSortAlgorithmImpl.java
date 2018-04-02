package com.carloslira.sort_algorithms;

import java.util.Arrays;

public class MergeSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		mergeSort(values, 0, values.length);
	}

	private void mergeSort(int[] values, int start, int end) {
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(values, start, mid);
		mergeSort(values, mid, end);
		merge(values, start, mid, end);
	}

	private void merge(int[] values, int start, int mid, int end) {
		if (values[mid - 1] <= values[mid]) {
			// keeps the algorithm stable
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int temp[] = new int[end - start];

		while (i < mid && j < end) {
			temp[tempIndex++] = values[i] <= values[j] ? values[i++] : values[j++];
		}
		// copy any left over on the left side
		System.arraycopy(values, i, values, start + tempIndex, mid - i);
		
		// copy the temp array into the original array 
		System.arraycopy(temp, 0, values, start, tempIndex);
		

	}

}
