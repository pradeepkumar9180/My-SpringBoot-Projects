package BasicPrograms;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
	System.out.println("enter the two strings str and str1");
	String str,str1;
	int count=0;
	str=input.next();
	str1=input.next();
	if(str.length()==str1.length())
	{
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==str1.charAt(i)||str.charAt(i)==(str1.charAt(str1.length()-1-i)))
		{
			count++;
		}
	}
	

	}
	if(count==str.length())
	{
		System.out.println("strings are anagram");
	}
	else
	{
		System.out.println("strings are not anagarm");
	}

}
}
