package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(reverseUsingList.reverseString("java"));
	}

	public static String reverseString(String str) {

		String reversedString = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}

}
