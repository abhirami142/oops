import java.util.*;
class Employee
{
	int eNo;
	String eName;
	double salary;
	Employee(int eNo,String eName,double salary)
	{
		this.eNo=eNo;
		this.eName=eName;
		this.salary=salary;
	}
	/*void display()
	{
		System.out.println("Employee no ="+eNo);
		System.out.println("Employee name ="+eName);
		System.out.println("Employee salary ="+salary);
	}*/
}
class AO
{
	public static void main(String args[])
	{
		int n,en,search,flag=0;
		String nam;
		double s;
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.print("read the total number of employees:");
		n=s1.nextInt();
		Employee[] obj=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter the "+(i+1)+" employee number: ");
			en=s1.nextInt();
			System.out.print("Enter the "+(i+1)+" employee name: ");
			nam=s2.nextLine();
			System.out.print("Enter the "+(i+1)+" salary of employee: ");
			s=s1.nextDouble();
			obj[i]=new Employee(en,nam,s);
		}
		System.out.print("\nEnter the employee number to be searched:");
		search=s1.nextInt();
		for(int i=0;i<n;i++)
		{
			if(search==obj[i].eNo)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Employee found..");
		}
		else
		{
			System.out.println("Employee not found..");
		}
	}
}
