package Sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int values[]= {9,8,7,5,6};
		System.out.println("Before Sort");
		for(int i  : values) {
			System.out.println(i);
		}
		insertionSortImpl(values);
		System.out.println("After Sort");
		for(int i  : values) {
			System.out.println(i);
		}
	}

	private static void insertionSortImpl(int[] values) {

		for(int i=1;i<values.length;i++) {
			int numbersToBeInserted = values[i];
			int comparingIndex = i-1;
			while(comparingIndex>=0 && values[comparingIndex]>numbersToBeInserted) {
				values[comparingIndex +1] = values[comparingIndex];
				comparingIndex--;
			}
			values[comparingIndex +1] = numbersToBeInserted;
		}
	}

}
