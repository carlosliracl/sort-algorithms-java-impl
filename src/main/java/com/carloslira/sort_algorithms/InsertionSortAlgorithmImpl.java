package com.carloslira.sort_algorithms;

public class InsertionSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {

		// supposably the index 0 element is already sorted, since it is the first
		// element to be inserted
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < values.length; firstUnsortedIndex++) {
			int newElement = values[firstUnsortedIndex];

			int i;
			// we keep going while index is greater than 0 and the new element is lower than
			// its left neighbor
			for (i = firstUnsortedIndex; i > 0 && values[i - 1] > newElement; i--) {
				// do a right shift
				values[i] = values[i - 1];
			}
			values[i] = newElement;
		}

	}

}
