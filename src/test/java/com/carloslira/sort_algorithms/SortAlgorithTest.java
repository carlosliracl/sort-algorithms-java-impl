package com.carloslira.sort_algorithms;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

//@RunWith(value = Parameterized.class)

@RunWith(JUnitParamsRunner.class)
public class SortAlgorithTest {

	// private int[] unsortedArray;
	// private int[] expectedSortedArray;
	//
	// public SortAlgorithTest(int[] unsortedArray, int[] expectedSortedArray) {
	// super();
	// this.unsortedArray = unsortedArray;
	// this.expectedSortedArray = expectedSortedArray;
	//
	//
	// }

	private Object[][] sortParams() {
		return new Object[][] { { new int[] { 20, 35, -15, 7, 55, 1, -22 }, new int[] { -22, -15, 1, 7, 20, 35, 55 } },
				{ new int[] { 21, 4, -9, 10, 76, 4 }, new int[] { -9, 4, 4, 10, 21, 76 } } };
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

}
