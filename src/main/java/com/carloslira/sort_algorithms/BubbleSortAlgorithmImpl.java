package com.carloslira.sort_algorithms;

public class BubbleSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		for (int lastUnsortedIndex = values.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (values[i] > values[i + 1]) {
					swap(values, i, i + 1);
				}

			}
		}
	}

}
