import java.io.*;
import java.util.*;
public class File
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter text to write to file1.txt");
String input=sc.nextLine();
FileWriter fw=new FileReader("f1.txt");
f1.write(input);
f1.close();
System.out.println("Text written to f1.txt");
FileReader f1=new FileReader("f1.txt");
FileWriter f2=new FileWriter("f2.txt");
int i;
System.out.println("Contets copied to f2.txt");
while(((i=f1.read()) != -1)
{
f2.write(i);
System.out.println((char)i);
}
f1.close();
f2.close();
System.out.println("Contents copied to f2.txt");
}
catch(Exception e)
{
System.out.println("an error occured:" +e.getMessage());
}
}
} 

