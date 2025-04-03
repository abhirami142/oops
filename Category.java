import java.util.*;
class publisher
{
	String pub_name,agen_name;
	publisher(String pub_name,String agen_name)
	{
		this.pub_name=pub_name;
		this.agen_name=agen_name;
	}
}
class book extends publisher
{
	String b_name,author,type;
	int price;
	book(String pub_name,String agen_name,String b_name,String author,String type,int price)
	{
		super(pub_name,agen_name);
		this.b_name=b_name;
		this.author=author;
		this.type=type;
		this.price=price;
	}
}
class literature extends book
{
	literature(String pub_name,String agen_name,String b_name,String author,String type,int price)
	{
		super(pub_name,agen_name,b_name,author,type,price);
	}
	void display_lit()
	{
		System.out.println("Book name is "+b_name);
		System.out.println("Author name is "+author);
		System.out.println("Publisher name is "+pub_name);
		System.out.println("Agent name is "+agen_name);
		System.out.println("Price of book is "+price);
	}
}
class fiction extends book
{
	fiction(String pub_name,String agen_name,String b_name,String author,String type,int price)
	{
		super(pub_name,agen_name,b_name,author,type,price);
	}
	void display_fict()
	{
		System.out.println("Book name is "+b_name);
		System.out.println("Author name is "+author);
		System.out.println("Publisher name is "+pub_name);
		System.out.println("Agent name is "+agen_name);
		System.out.println("Price of book is "+price);
	}
}
class category
{
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		Scanner op1=new Scanner(System.in);
		int i,n,n1;
		System.out.println("Enter the number of literature books ");
		n=op.nextInt();
		literature ar[]=new literature[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Book name ");
			String b_name=op1.nextLine();
			System.out.println("Enter Author name ");
			String author=op1.nextLine();
			System.out.println("Enter Publisher name ");
			String pub_name=op1.nextLine();
			System.out.println("Enter Agent name ");
			String agen_name=op1.nextLine();
			System.out.println("Enter Type of book ");
			String type=op1.nextLine();
			System.out.println("Enter Price of book");
			int price=op.nextInt();
			ar[i]=new literature(pub_name,agen_name,b_name,author,type,price);
			System.out.println("\n");
		}
		
		System.out.println("Enter the number of fiction books ");
		n1=op.nextInt();
		fiction arr[]=new fiction[n1];
		for(i=0;i<n1;i++)
		{
			System.out.println("Enter Book name ");
			String b_name=op1.nextLine();
			System.out.println("Enter Author name ");
			String author=op1.nextLine();
			System.out.println("Enter Publisher name ");
			String pub_name=op1.nextLine();
			System.out.println("Enter Agent name ");
			String agen_name=op1.nextLine();
			System.out.println("Enter Type of book ");
			String type=op1.nextLine();
			System.out.println("Enter Price of book");
			int price=op.nextInt();
			arr[i]=new fiction(pub_name,agen_name,b_name,author,type,price);
			System.out.println("\n");
		}
		System.out.println("\n DETAILS OF LITERATURE BOOKS\n");
		for(i=0;i<n;i++)
		{
			ar[i].display_lit();
			System.out.println("\n");
		}
		System.out.println("\n DETAILS OF FICTION BOOKS \n");
		for(i=0;i<n1;i++)
		{
			arr[i].display_fict();
			System.out.println("\n");
		}
	}
}
		
		
			
		
		

	
		
		
