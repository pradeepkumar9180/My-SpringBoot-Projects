package BasicPrograms;

import java.util.Scanner;

public class maxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max, min;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter the elements in a array");
		for (int i = 0; i < n; i++) {

			a[i] = input.nextInt();
		}
		max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum value in the array : " + min);
		System.out.println("Maximum value in the array : " + max);
	}

}
