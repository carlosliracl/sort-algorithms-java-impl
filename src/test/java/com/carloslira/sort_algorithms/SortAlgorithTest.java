package com.carloslira.sort_algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class SortAlgorithTest {

	private Object[][] sortParams() {

		Object[][] params = new Object[4][2];

		params[0][0] = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		params[0][1] = new int[] { -22, -15, 1, 7, 20, 35, 55  };

		params[1][0] = new int[] { 4, 3, 2, 1 };
		params[1][1] = new int[] { 1, 2, 3, 4 };

		params[2][0] = new int[] { 90, 68, 15, 92, 17, 85, 45, 1, 79, 25, 99, 32, 86, 14, 80, 5, 50, 68, 50, 88 };
		params[2][1] = new int[] { 1, 5, 14, 15, 17, 25, 32, 45, 50, 50, 68, 68, 79, 80, 85, 86, 88, 90, 92, 99 };

		params[3][0] = new int[] { 21, 4, -9, 10, 76, 4 };
		params[3][1] = new int[] { -9, 4, 4, 10, 21, 76 };
		
		return params;
	}

	@Test
	@Parameters(method = "sortParams")
	public void bubbleSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new BubbleSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);
	}

	@Test
	@Parameters(method = "sortParams")
	public void selectionSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new SelectionSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);

	}

	@Test
	@Parameters(method = "sortParams")
	public void insertionSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new InsertionSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);

	}

	@Test
	@Parameters(method = "sortParams")
	public void shellSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new ShellSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);
	}

	@Test
	@Parameters(method = "sortParams")
	public void mergeSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new MergeSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);
	}

	@Test
	@Parameters(method = "sortParams")
	public void quickSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new QuickSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);
	}

}
