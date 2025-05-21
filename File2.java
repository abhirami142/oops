import java.io.*;
class file2
{
	public static void main(String args[])
	{
		try
		{
			FileReader f1=new FileReader("f1.txt");
			FileWriter f2=new FileWriter("f2.txt");
			int i;
			while ((i=f1.read())!=-1)
			{
				f2.write(i);	
				System.out.print((char)i);			
			}
			f1.close();
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
