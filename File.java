 import java.io.*;
 import java.util.*;
 class file
 {
 	public static void  main(String args[])
 	{
 		try
 		{
 			FileReader f1=new FileReader("f1.txt");
 			FileWriter f2=new FileWriter("f1.txt");
 			int i;
 			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter the contents to insert into the file:");
 			String data=sc.nextLine();
 			System.out.println("Contents written to f1.txt");
 			f2.write(data);
 			f2.close();
 			System.out.println("Read the contents from f1.txt");
 			while((i=f1.read())!=-1)
 			{
 				System.out.print((char)i);
 			}
 			f1.close();
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 }
