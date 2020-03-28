package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array:");
		Scanner in = new Scanner(System.in);
		int numberOfArray = in.nextInt();
		int arr[] = new int[numberOfArray];		
		System.out.println("Enter the Values of an array:");

		for(int i=0;i<numberOfArray;i++) {
			arr[i] = in.nextInt();
		}

		System.out.println("Enter the value to be searched:");
		int number = in.nextInt();

		int low = 0;
		int mid =0;
		int high = numberOfArray - 1;
		while(low<=high) {
			mid = (low +high)/2;
			if(arr[mid] == number) {
				System.out.println("value found at Location" + " " + mid);
				break;
			} else if(arr[mid]>number) {
				high = mid -1;
			} else if(arr[mid]<number) {
				low =  mid +1;
			}
			if(low>high) {
				System.out.println("Value Not Found");
			}
		}
	}

}