package BasicPrograms;

import java.util.Scanner;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string str and str1:");
		String str;
		String str1;
		int count=0;
		str=input.next();
		str1=input.next();
		if(str.length()==str1.length())
		{
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - 1 - i; j++) {

				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		char[] ch1 = str.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str1.length() - 1 - i; j++) {

				if (ch1[j] > ch1[j + 1]) {
					char temp1 = ch1[j];
					ch1[j] = ch1[j + 1];
					ch1[j + 1] = temp1;
				}
			}
		}
		
	
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==ch1[i])
				{
				count++;
				}
			}
		if(count==ch1.length)
		{
		System.out.println("strings are anagram");
		}
		else
		{
			System.out.println("strings are not anagram");
		}

		}
		else
		{
			System.out.println("string lengths are unmatched so it is not an anagram");
		}
		}

}
