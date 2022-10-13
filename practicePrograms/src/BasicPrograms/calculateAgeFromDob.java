package BasicPrograms;

import java.util.Scanner;

public class calculateAgeFromDob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int current_date=2022;
		String str=input.nextLine();
		String[] str1=str.split("-",3);
		int res=Integer.parseInt(str1[str1.length-1]);
		int age=current_date-res;
		System.out.println(age);
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
		}
		
		
	}

}
