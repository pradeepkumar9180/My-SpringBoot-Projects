package BasicPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class mapExample {

	public static void main(String[] args) {
		Map<Integer,String>i1=new TreeMap();
		i1.put(1,"apple");
		i1.put(2,"pradeep");
		i1.put(4,"sdd");
		i1.put(3,"weda");
		i1.put(5, "bfuj");
	for(Map.Entry<Integer, String>m:i1.entrySet())
//	{
//		System.out.println(m.getKey()+" "+m.getValue());
		if(m.getKey()>1)
		{
			System.out.println(m.getValue());
		}
//	}
		
//		sorted by key accending order
	//	i1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//sorted by key in decending order
	//	i1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		//sorted by value
	//	i1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
