package BasicPrograms;

import java.util.Scanner;

public class findIndexOfElement {

	public static void main(String[] args) {
		int n,index=-1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter the elements in a array");
		for (int i = 0; i < n; i++) {

			a[i] = input.nextInt();
		}
		System.out.println("enter the element to find the index in array:");
		int value=input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				index=i;
			}
		}
		if(index>=0)
		{
			System.out.println("INDEX of an element is : "+index);
		}
		else
		{
			System.out.println("Element out of array so index cant be find");
		}

	}

}


