package Assignment;
import java.io.IOException;
import java.util.*;

public class Shopkeeper {
	

	public static ArrayList<String> al = new ArrayList<String>();
	
	
	public static void add()
	{
		Product p = new Product();
		
		
		 Scanner myObj = new Scanner(System.in);
		 
		 
		 System.out.println("Enter Product ID");
		 p.id = myObj.nextLine();
		 
		 System.out.println("Enter Product Name");
		p.name = myObj.nextLine();
		
		 System.out.println("Enter Product Brand");
		 p.brand = myObj.nextLine();
		 
		 System.out.println("Enter Product Price");
		 p.price = myObj.nextLine();
		 
		 
		 System.out.println("Enter Product Stock");
		 p.stock =  myObj.nextLine();
		 
		
		 for (int i = 0; i < al.size(); i++) 
	            System.out.print(al.get(i) + " "); 
			
		 
		al.add(p.id);
		al.add(p.name);
		al.add(p.brand);
		al.add(p.price);
		al.add(p.stock);
		
		
		
	}
	public static void delete(List <String> al) {
		// TODO Auto-generated method stub
		Product p = new Product();
		Scanner d = new Scanner(System.in);
		System.out.println("Enter id of the product you want to delete");
		p.id=d.nextLine();
		/*
		 * for(int i=0;i<=al. i++) { al.remove(i); }
		 */
		al.clear();
		
	}
	public static void show()
	{
		System.out.println("List of Product is"+al);
	}
	


	

	public static void choice()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.Add  2.Delete 3.Search 4.List 5.Return");
		int choice;
		do
		{
			 choice = s.nextInt();
			switch(choice)
			{
				case 1 :
					add();
					break;
			
				case 2:
					delete(al);
					break;
					
				case 3:
					//search();
					break;
				
					
				case 4:
					show();
					break;
					
				case 5:
					took();
					break;
			}System.out.println("1.Add  2.Delete 3.Search 4.List 5.Return");
		}while(choice < 6);
	} 
	
	

	/*private static void search(List<String>al) {
		// TODO Auto-generated method stub
		for(search String:al)
		{
			if(al.getid().equals(id)))
			{
				return String;
			}
		}
	}*/
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
			
			choice();
			add();
			delete(al);
			show();
			took();
			//search();
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
			
		
	
	
	




	
	public static void main(String []args)
	{
		choice();
		add();
		delete(al);
		show();
		//search();
		took();
	}
	public ArrayList<String> getArrayList() {
		// TODO Auto-generated method stub
		return al;
	}















	

	
	

	
		
	}
	


	

