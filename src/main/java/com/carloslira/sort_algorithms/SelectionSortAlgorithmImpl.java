package com.carloslira.sort_algorithms;

public class SelectionSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {

		for (int lastUnsortedIndex = values.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (values[i] > values[largest]) {
					largest = i;
				}
			}
			swap(values, largest, lastUnsortedIndex);
		}

	}

}
