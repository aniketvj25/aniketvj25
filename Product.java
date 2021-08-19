package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Product {

	int id;
	static String name;
	static String brand;
	static String price;
	static String stock;
	
	
	static List<Product> al=new ArrayList<Product>();
	public static void main(String []args)
	{
		
		dispaly(null);
	}
	private static void dispaly(List al) {
		
		System.out.println("Product List Is "+al);
	}
	public void setName() {
		// TODO Auto-generated method stub
		
	}
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
