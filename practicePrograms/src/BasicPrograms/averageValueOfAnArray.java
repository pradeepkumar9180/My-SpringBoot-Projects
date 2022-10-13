package BasicPrograms;

import java.util.Scanner;

public class averageValueOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0, avg;
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter the number of elements to be insertted in a array");
		n=input.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements in a array");
	for (int i = 0; i < n; i++) {
		
		a[i]=input.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
			
		sum=sum+a[i];

	}
	avg=sum/n;
	System.out.println("Average value of array is : "+avg);
	}
	

}
