package BasicPrograms;

import java.util.Scanner;

public class candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int result=countCandy(n);
		System.out.println(result);

	}
	public static int countCandy(int n)
	{
	return n*n;
	}

}
