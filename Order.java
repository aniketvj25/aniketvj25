package Assignment;

import java.awt.List;
import java.util.ArrayList;

public class Order  {

	int id;
	int line_item_list;
	static int card;
	static int cvv;
	
	
	List<Order>a2 = new ArrayList<Order>();
	public static void main(String[]args)
	{
		List<Lineitem>a2 = new ArrayList<Lineitem>();
		orders(null);
		
	}


	private static void orders(List a2) {
		System.out.println("Order details is "+a2);
		
	}


	public void setName() {
		// TODO Auto-generated method stub
		
	}


	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
