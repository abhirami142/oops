import java.util.*;
class Employee
{
    String ename;
    int eno;
    double salary;
    Employee(String ename,int eno,double salary)
    {
        this.ename=ename;
        this.eno=eno;
        this.salary=salary;
    }
}
public class AO
{
    public static void main(String args[])
    {
        int n,en,search,flag=0;
        String nam;
        double s;
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.println("enter no. of employees:");
        n=s1.nextInt();
        Employee[] obj=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the " + (i+1) + "employee no:");
            en=s1.nextInt();
            System.out.println("enter the" + (i+1) + "employee name:");
            nam=s2.nextLine();
            System.out.println("enter the " + (i+1) + "employee salary:");
            s=s1.nextInt();
            obj[i]=new Employee(nam,en,s);
        }
        System.out.println("enter the employee no. to be searched:");
        search=s1.nextInt();
        for(int i=0;i<n;i++)
        {
            if(search==obj[i].eno)
            {
                flag=1;
                System.out.println("Empoyee found...");
                System.out.println("Employee details...");
                System.out.println("Name:"+ obj[i].ename);
                System.out.println("Number:"+ obj[i].eno);
                System.out.println("employee salary is:"+ obj[i].salary);
            }
        }
            if(flag==0)
            {
                System.out.println("employee not found...");
            }
    }
    
}
