package Sorting;

class QuickSort {

	public static void main(String[] args) {
		int arr[]= {9,8,7,5,6};
		System.out.println("Before Sort");
		for(int i  : arr) {
			System.out.println(i);
		}
		quickSort(arr,0,arr.length-1);
		System.out.println("After Sort");
		for(int i  : arr) {
			System.out.println(i);
		}
	}

	private static void quickSort(int arr[],int low,int high) {
		int mid = (low+high)/2;
		int i = low;
		int j =  high; 
		int pivot = arr[mid];
		while(i<=j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;	
				i++;
				j--;
			}
		}
		
		if(low<j)
			quickSort(arr,low,j);
		if(high>j)
			quickSort(arr,i,high);
	}
}
