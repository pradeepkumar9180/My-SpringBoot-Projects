package BasicPrograms;

import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter the elements in a array");
		for (i = 0; i < n; i++) {

			
			a[i] = input.nextInt();
		}
		int[] b=new int[n];
		for(i=a.length-1;i>=0;i--)
		{
			b[a.length-1-i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
