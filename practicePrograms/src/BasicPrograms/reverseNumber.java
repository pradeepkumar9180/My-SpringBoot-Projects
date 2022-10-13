package BasicPrograms;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string to be reverse");
		str = input.next();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.println(str.charAt(i));
		}

	}

}
