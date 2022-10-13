package BasicPrograms;

import java.security.PublicKey;
import java.util.Scanner;

public class arraysEual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N, M,count=0;
		N = input.nextInt();
		M = input.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		for(int i=0;i<A.length;i++)
		{
				A[i]=input.nextInt();
		}
		for(int i=0;i<B.length;i++)
		{
				B[i]=input.nextInt();
		}
		int result=arrayEqual(A,B);
		System.out.println(result);
	}
		
	public static int arrayEqual(int[] A,int[] B)
	{
		int count=0;
		if (A.length == B.length) {
			for(int i=0;i<A.length;i++)
			{
				if(A[i]==B[i])
				{
					count++;
				}
			}

		}
		return count;
	}

}
