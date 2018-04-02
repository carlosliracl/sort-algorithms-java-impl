import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortAlgorithTest {

	@Test
	public void sort() {
		
		int values[] = { 20, 35, -15, 7, 55, 1, -22 };
		int expect[] = { -22, -15, 1, 7, 20, 35, 55 };
		
		new BubbleSortAlgorithm().sort(values);

		assertArrayEquals(expect, values);

	}

}
