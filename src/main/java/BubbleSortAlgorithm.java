
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public void sort(int[] values) {
		for (int lastUnsortedIndex =  values.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(values[i] > values[i+1]) {
					swap(values, i, i+1);
				}
				
			}
		}
	}

	private void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
