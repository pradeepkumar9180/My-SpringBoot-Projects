package BasicPrograms;

import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the input string");
		String data=input.next();
		System.out.println("enter the character to count the occurance:");
		char coder=input.next().charAt(0);
		int result=countChar(data,coder);
		System.out.println("occurance of "+coder+" is :"+result);
	}
	public static int countChar(String data,char coder)
	{
		int answer=0;
		char[] ch1=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(ch1[i]==coder)
			{
				answer++;
			}
		}
	
		return answer;
		
	}

}
