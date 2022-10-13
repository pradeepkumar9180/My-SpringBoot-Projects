package BasicPrograms;

import java.util.Scanner;

public class binaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
			
			}
		if(a[0]==(a[1]+a[2])/2  || a[1]==(a[0]+a[2])/2 || a[2]==(a[0]+a[1])/2)
		{
			count++;
			System.out.println(count);
		}
		
	
	}

}
