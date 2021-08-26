package Assignment;
import java.util.*;

public class Customer
{
	
	
	
	
	public static void Buy(List <String> al)
	{
		Shopkeeper s = new Shopkeeper();
		Product p = new Product();
		Order o = new Order();
		List<String> ac = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Want to buy");
		p.name = sc.nextLine();
		System.out.println("Enter Card Number ");
		o.card =  sc.nextLine();
		System.out.println("Enter Card CVV Number");
		o.cvv = sc.nextLine();
		
		ac.add(p.name);
		ac.add(o.card);
		ac.add(o.cvv);
		
		System.out.println("Order details are");
	
		for (int i = 0; i < ac.size(); i++) 
            System.out.print(ac.get(i) + " " ); 
		
	
		
		 
		 
	}
	

	public static void list()
	{
		Shopkeeper sh = new Shopkeeper();
		ArrayList <String> al = sh.getArrayList();
		System.out.println("List of Product is"+al);
	}
	
	public static void choice()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.List 2.Return");
		int choice;
		do
		{
			 choice = s.nextInt();
			switch(choice)
			{
				case 1 :
					list();
					break;
			
				case 2:
					took();
					break;
					
			
				
			}System.out.println("1.List 2.Return");
		}while(choice < 3);
	} 
	public static  void took() 
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
			Shopkeeper sh = new Shopkeeper();
			sh.choice();
			sh.add();
			sh.delete(al);
			sh.show();
			
			}
			break;
			case 2 :
			{
				took();
				Buy(al);
				list();
				
			}
			break;
		}
		
		
	}
			
	
	
	
	public static void main(String []args)
	{
	
		choice();
		list();
		took();
	}
}
