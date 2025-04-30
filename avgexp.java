import java.util.*;
class NegativeException extends Exception
{
NegativeException(String s)
{
super(s);
}
}
class avgexp
{
void checknum(int n) throws NegativeException
{
int num;
double sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
for(int i=0;i<n;i++)
{
num=sc.nextInt();
if(num<0)
{
throw new NegativeException("-ve number occurred...cannot find average..");
}
sum+=num;
}
System.out.println("average of the numbers are:"+sum/n);
}
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("enter the total no. of  integers");
x=sc.nextInt();
avgexp a=new avgexp();
try
{
a.checknum(x);
}
catch(NegativeException e)
{
System.out.println(e);
}
System.out.println("program terminated..");
}
}


