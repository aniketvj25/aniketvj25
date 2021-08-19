package Assignment;
import java.util.*;

public class Customer
{

	String cname;
	String mail;
	int number;
	
	
	public static void Buy()
	{
		List<Order>a2 = new ArrayList<Order>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Card No");
		 card = sc.nextInt();
		 System.out.println("Enter CVV ");
		 cvv = sc.nextInt();
		 
		 
	}
	public static void list(List al)
	{
		System.out.println("Product list is "+al);
	}
	public static void main(String[]args)
	{
		Buy();
		list(null);
	}
	public void setName() {
		// TODO Auto-generated method stub
		
	}
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
