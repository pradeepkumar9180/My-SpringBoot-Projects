package BasicPrograms;

import java.util.Scanner;

public class removeElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, value,count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter the elements in a array");
		for (int i = 0; i < n; i++) {

			a[i] = input.nextInt();
		}
		System.out.println("Enter the elemnt to be removed if it exists ");
		value = input.nextInt();
		int[] b = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if(a[i]==value)
			{
				count++;
			}
		}
			if(count>0)
			{
				for(int i=0;i<a.length;i++)
				{
			if (a[i] != value) {
				b[i] = a[i];
			}
			}
				for(int i=0;i<b.length;i++)
				{
				System.out.println("New elements are : "+b[i]);
			}
			}
			else
			{
				System.out.println("Element not found in the Array");
			}

	}

}
