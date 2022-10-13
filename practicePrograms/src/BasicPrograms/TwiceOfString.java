package BasicPrograms;

import java.util.Scanner;

public class TwiceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int result=twiceString(str);
		System.out.println(result);
		

	}
	public static int  twiceString(String str) {
		int res=Integer.parseInt(str);
		return res*2;
		
		
	}

}
