package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the size of an array:");
		Scanner in = new Scanner(System.in);
		int numberOfArray = in.nextInt();
		int arr[] = new int[numberOfArray];		
		System.out.println("Enter the Values of an array:");
		for(int i=0;i<numberOfArray;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the Value to be searched:");
		number = in.nextInt();
		for (int i=0;i<numberOfArray;i++) {
			if(arr[i]==number) {
				System.out.println("Value Found in location" + " " + i);
			} 
		}
	}
}
