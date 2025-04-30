import java.util.*;
class EvenException extends Exception
{
EvenException(String s)
{
super(s);
}
}
class OddException extends Exception
{
OddException(String s)
{
super(s);
}
}
class oddeven
{
static void even(int n) throws EvenException
{
if(n%2==0)
{
throw new EvenException("n is even");
}
}
static void odd(int n) throws OddException
{
if(n%2!=0)
{
throw new OddException("n is odd");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number:");
n=sc.nextInt();
try{
even(n);
odd(n);
}
catch(EvenException e)
{
System.out.println(e);
}
catch(OddException e)
{
System.out.println(e);
}
}
}

