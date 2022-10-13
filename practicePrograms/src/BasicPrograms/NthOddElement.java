package BasicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NthOddElement {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		List<Integer>l1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int listElements=input.nextInt();
			l1.add(listElements);
		}
		System.out.println(nthOddIndex(l1,n));
	}
		public static Integer nthOddIndex(List<Integer>l1,int n)
		{
			int index=-1;
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)%2!=0)
			{
				index=i;
			}
			
		}
		return index;
	}

}
