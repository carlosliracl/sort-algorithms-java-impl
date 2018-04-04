package com.carloslira.sort_algorithms;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CountingSortAlgorithmTest {
	
	private Object[][] sortParams() {
		
		Object[][] params = new Object[3][2];
		
		params[0][0] = new int[] { 20, 35, 15, 7, 20, 1, 22, 12, 0, 0 };
		params[0][1] = new int[] { 0, 0, 1, 7, 12, 15, 20, 20, 22, 35 };
		
		params[1][0] = new int[] { 4, 3, 2, 1 };
		params[1][1] = new int[] { 1, 2, 3, 4 };
		
		params[2][0] = new int[] { 90, 68, 15, 92, 17, 85, 45, 1, 79, 25, 99, 32, 86, 14, 80, 5, 50, 68, 50, 88 };
		params[2][1] = new int[] { 1, 5, 14, 15, 17, 25, 32, 45, 50, 50, 68, 68, 79, 80, 85, 86, 88, 90, 92, 99 };

		return params;

	}

	@Test
	@Parameters(method = "sortParams")
	public void countingSortTest(int[] unsortedArray, int[] expectedSortedArray) {
		new CountingSortAlgorithmImpl().sort(unsortedArray);
		assertArrayEquals(expectedSortedArray, unsortedArray);
	}

}
