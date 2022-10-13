package BasicPrograms;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		//we can use this
//		String[] str1=str.split("-");
//		int year=Integer.parseInt(str1[str1.length-1]);
		
		//or this for user string to date conversion
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) ;
		LocalDate id= LocalDate.parse( str , f ) ;
		int year=id.getYear();
//current date inbuilt method	
		
		LocalDate date1=LocalDate.now();
		int year1=date1.getYear();
		int month=date1.getMonthValue();
		System.out.println(month);
		int age=year1-year;
		System.out.println(age);
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}
		}

}
