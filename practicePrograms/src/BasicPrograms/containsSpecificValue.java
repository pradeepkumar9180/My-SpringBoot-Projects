package BasicPrograms;

import java.util.Scanner;

public class containsSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter the elements in a array");
		for (int i = 0; i < n; i++) {

			a[i] = input.nextInt();
		}
		System.out.println("enter the element to check wheater it is present or not in array");
		int key = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("The given Element: " + key + " Exists in the Array");
		} else {
			System.out.println("The given Element: " + key + " NotExists in the Array");
		}

	}

}
