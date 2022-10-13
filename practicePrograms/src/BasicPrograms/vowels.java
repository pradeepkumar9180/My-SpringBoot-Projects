package BasicPrograms;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the character:");
		char ch=input.next().charAt(0);
		
//		It will print A-Z CHARACTERS
//		for(ch='a';ch<='z';ch++)
//		{
//			System.out.println(ch);
//		}
		
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonants");
		}

	}

}
