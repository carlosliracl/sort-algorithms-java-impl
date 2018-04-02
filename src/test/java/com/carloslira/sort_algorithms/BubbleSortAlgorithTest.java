package com.carloslira.sort_algorithms;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)

public class BubbleSortAlgorithTest {

	private int[] unsortedArray;
	private int[] expectedSortedArray;

	public BubbleSortAlgorithTest(int[] unsortedArray, int[] expectedSortedArray) {
		super();
		this.unsortedArray = unsortedArray;
		this.expectedSortedArray = expectedSortedArray;
	}

	@Parameterized.Parameters
	public static Collection trianglesData() {
		return Arrays.asList(
				new Object[][] { { new int[] { 20, 35, -15, 7, 55, 1, -22 }, new int[] { -22, -15, 1, 7, 20, 35, 55 } },
						{ new int[] { 21, 4, -9, 10, 76, 4 }, new int[] { -9, 4, 4, 10, 21, 76 } }

				});
	}

	@Test
	public void sort() {
		new BubbleSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);

	}

}
