import java.util.Scanner;
interface Shape{
void area();
void perimeter();
}
class circle implements Shape{
double r;
circle(double r){
this.r=r;
}
public void area(){
System.out.println("Area of circle is:"+3.14*r*r);
}
public void perimeter(){
System.out.println("Perimeter of circle is:"+2*3.14*r);
}
}
class rectangle implements Shape{
int l,b;
rectangle(int l,int b){
this.l=l;
this.b=b;
}
public void area(){
System.out.println("Area of rectangle is:"+l*b);
}
public void perimeter(){
System.out.println("Perimeter of rectangle is:"+(2*(l+b)));
}
}
class Interface{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int ch;
do{
System.out.println("\n Enter your choice");
System.out.println("1.To find area and perimeter of circle");
System.out.println("2.To find area and perimeter of rectangle");
System.out.println("0.Exit");
ch=in.nextInt();
switch(ch){
case 1:
System.out.println("Enter the radius:");
double r=in.nextDouble();
circle c=new circle(r);
c.area();
c.perimeter();
break;
case 2:
System.out.println("Enter the length and breadth:");
int l=in.nextInt();
int b=in.nextInt();
rectangle re=new rectangle(l,b);
re.area();
re.perimeter();
break;
case 0:
System.out.println("Exiting.....");
break;
}
}
while(ch!=0);
in.close();
}
}

