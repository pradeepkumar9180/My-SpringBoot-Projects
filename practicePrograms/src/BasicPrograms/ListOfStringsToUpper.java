package BasicPrograms;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsToUpper {
	public static void main(String[] args) {
		List<String>l1=new ArrayList<>();
		l1.add("ramesh");
		l1.add("pradeep");
		l1.add("kumar");
		List<String>l3=toUpperCaseString(l1);

		System.out.println(l3);
	}
//
	private static List<String> toUpperCaseString(List<String>l1) {
		// TODO Auto-generated method stub
//		List<String>l2=new ArrayList<>();
//	for (String s1 : l1) {
//		l2.add(s1.toUpperCase());
//	}
//		return l2;
//			
//	using Streams;
		
		
		return l1.stream().map(String::toUpperCase).collect(Collectors.toList());
		
	}
		
	}
