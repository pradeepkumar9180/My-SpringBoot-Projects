package BasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfNodes {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int result=secondLargestElement(a);
		System.out.println("secondLargestElement is: "+result);
	}

	private static int secondLargestElement(int[] a) {
		Arrays.sort(a);
		// TODO Auto-generated method stub
		return a[a.length-2];
	
	}
}