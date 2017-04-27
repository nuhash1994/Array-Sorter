
public class Sort {

	public static int[] sortArray(String[] inputArray) {
		int[] sortedArray = new int[inputArray.length];
		int[] tempArray = new int[inputArray.length];
		int temp;
		for (int k = 0; k < inputArray.length; k++) {
			tempArray[k] = Integer.parseInt(inputArray[k]);

		}
		for (int j = 0; j < tempArray.length - 1; j++) {
			for (int i = 0; i < tempArray.length - 1; i++) {
				if (tempArray[i] > tempArray[i + 1]) {
					temp = tempArray[i];
					tempArray[i] = tempArray[i + 1];
					tempArray[i + 1] = temp;
					sortedArray = tempArray;

				}
			}
		}
		return sortedArray;
	}

}
