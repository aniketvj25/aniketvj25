package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main 
{
	static String s;
	static String c;

	public static void main(String[]args)
	{
		Shopkeeper sh =new Shopkeeper();
		Customer cu;
		cu = new Customer();
		sh.took();
		
	 
	}
	public static void took() 
	{
		 List<String> al = new ArrayList<String>();
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter Your Choice of User");
		System.out.println("1.Shopkeeper");
		System.out.println("2.Customer");
		
		int choice = myObj2.nextInt();
		switch(choice)
		{
			case 1:
			{
			Shopkeeper sh;
			sh = new Shopkeeper();
			sh.choice();
			sh.add();
			sh.delete(al);
			sh.show();
		}
		break;
		case 2 :
		{
			Customer cu;
			cu = new Customer();
			
			cu.list();
			
		}
		break;
		}
		
		
		
		
		
		
	}
}
