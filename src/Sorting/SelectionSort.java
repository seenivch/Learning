package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int values[]= {9,8,7,5,6};
		System.out.println("Before Sort");
		for(int i  : values) {
			System.out.println(i);
		}
		selectionSortImpl(values);
		System.out.println("After Sort");
		for(int i  : values) {
			System.out.println(i);
		}
	}

	private static void selectionSortImpl(int[] values) {
		int minValue,minIndex,temp = 0;
		for(int i=0;i<values.length;i++) {
			minValue= values[i];
			minIndex=i;
			for(int j=i;j<values.length;j++) {
				if(values[j]<minValue) {
					minValue= values[j];
					minIndex=j;
				}
			}
			if(minValue<values[i]) {
				temp = values[i];
				values[i] = values[minIndex];
				values[minIndex]= temp;
			}
		}
	}
}
