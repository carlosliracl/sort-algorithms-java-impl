package com.carloslira.sort_algorithms;

public class ShellSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		// 20, 35, -15, 7, 55, 1, -22
		
		for (int gap = values.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < values.length; i++) {

				int newElement = values[i];

				int j = i;
				while (j >= gap && values[j - gap] > newElement) {
					values[j] = values[j- gap];
					j -= gap;
				}
				values[j] = newElement;
			}
		}

	}

}
