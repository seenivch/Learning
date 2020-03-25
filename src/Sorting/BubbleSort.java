package Sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int values[]= {9,8,7,5,6};
		System.out.println("Before Sort");
		for(int i  : values) {
			System.out.println(i);
		}
		bubbleSortImpl(values);
		System.out.println("After Sort");
		for(int i  : values) {
			System.out.println(i);
		}
	}

	private static void bubbleSortImpl(int[] values) {
		int temp =0;
		
		for(int i=0;i<values.length;i++){
			
			for(int j=1;j<(values.length)-i;j++) {
				
				if(values[j-1]>values[j]) {
					temp = values[j-1];
					values[j-1] = values[j];
					values[j] = temp;
				}
			}
		}
		
	}

}
