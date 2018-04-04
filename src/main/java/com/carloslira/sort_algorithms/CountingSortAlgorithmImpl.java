package com.carloslira.sort_algorithms;

/**
 * Not Stable Algorithm
 * Evaluate minimum and maximum is not a great idea
 * Handle with arrays that contains 0 
 * @author Carlos Lira
 *
 */
public class CountingSortAlgorithmImpl implements SortAlgorithm {

	@Override
	public void sort(int[] values) {

		int minValue = getMinValue(values);
		int maxValue = getMaxValue(values);

		sort(values, minValue, maxValue);
	}

	private void sort(int[] values, int min, int max) {
		int countArray[] = new int[max - min + (min == 0 ? 1 : 2)];
		for (int i = 0; i < values.length; i++) {
			++countArray[values[i]];
		}
		int index = 0;
		for (int i = 0; i < countArray.length; i++) {
			while (countArray[i] > 0) {
				values[index++] = i;
				--countArray[i];
			}
		}
	}

	// TODO
	private int getMaxValue(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	// TODO
	private int getMinValue(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}
}
