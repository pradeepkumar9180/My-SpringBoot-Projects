package BasicPrograms;

import java.util.Scanner;

public class Fizz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String res = isDivisibelBy(n);
		System.out.println(res);
	}

	public static String isDivisibelBy(int n) {
		String ab="";

		if (n % 3 == 0 && n % 5 == 0)
		{
			ab="fizzbuzz";
		}
		else if (n % 3 == 0)
		{
		  ab="fizz";
		}
		else if (n % 5 == 0 ) {
		 ab="buzz";
		}
		else
			ab=String.valueOf(n);
		return ab;
	}
}
