package cardexception;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Creditcard
{
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	static Scanner scan = new Scanner(System.in);
	static Scanner scan1 = new Scanner(System.in);
	static boolean b = false;
	static long storelong() {
		Scanner scan = new Scanner(System.in);
		try {
			b = true;
			return scan.nextLong();
		}
		catch(Exception e) {
			b = false;
			return 0;
		}
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		display.println("Enter the Credit card Details :");
		display.print("Name = ");
		String name = scan.nextLine();
		display.print("Card Number = ");
		long number;
		while(1>0) {
			number = storelong();
			if(b)
				break;
		}
		b = false;
		display.print("Expiry Date = ");
		String date = scan.nextLine();
		Details obj = new Details(name,number,date);
		Details obj1 = new Details("KOKILA",7385657657l,"17-03-2023");
		display.println("The current Credit card number is same as the Previous Credit card number ? "+Details.equals(obj,obj1));
		obj = Details.cloneobj();
		display.println("Credit card Name : "+obj.name+"\nCredit card Number : "+obj.num+"\nExpired Date : "+obj.exdate);
		display.println("--------------------X---------------------");
	}
}
