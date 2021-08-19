package Assignment;

public class main 
{

	public static void main(String[]args)
	{
		Shopkeeper s = new Shopkeeper();
		s.setName();
		System.out.println(s.getName());
		
		Customer c = new Customer();
		c.setName();
		System.out.println(c.getName());
		
		Order o = new Order();
		o.setName();
		System.out.println(o.getName());
		
		Product p = new Product();
		p.setName();
		System.out.println(p.getName());
		
		Lineitem l = new Lineitem();
		l.setName();
		System.out.println(l.getName());
		
	}
}
