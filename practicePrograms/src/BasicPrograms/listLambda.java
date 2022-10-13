package BasicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner input=new Scanner(System.in);
		List<Integer>i1=new ArrayList();
		i1.add(1);
		i1.add(2);
		i1.add(3);
		i1.add(4);
		i1.add(5);
		//List<Integer>result=i1.stream().map(i->i+1).filter(i->i%2==0).collect(Collectors.toList());
		
//		long count=i1.stream().filter(i->i%2==0).count();
//		System.out.println(count);
//		for(Integer i:i1)
//		{
//			System.out.println(i);
//		}
		Iterator<Integer>i=i1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}
