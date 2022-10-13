package BasicPrograms;

import java.util.Scanner;

public class bala {	
	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.println("enter the input integer");
		long key=input.nextLong();
		long result=unlockingKey(key);
		System.out.println(result);
	}
	public static long unlockingKey(long key)
	{
		long answer=0;
		String str=String.valueOf(key);
		char[] ch1=str.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			
		}
		
		
		
		return answer;
	}

}
