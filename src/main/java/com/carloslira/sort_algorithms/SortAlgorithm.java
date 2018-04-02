package com.carloslira.sort_algorithms;

public interface SortAlgorithm {
	void sort(int[] values);
	
	default void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
