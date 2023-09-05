import java.util.*;
class kri{
public int acc;
public String name;
public int bal;
public String add;

public void getDetail()
{Scanner sc=new Scanner(System.in);
System.out.println("Enter Account number: ");
int acc=sc.nextInt();
System.out.println("Enter name: ");
String name =sc.nextLine();
System.out.println("Enter balance: ");
int bal=sc.nextInt();
System.out.println("Enter Address number: ");
String add=sc.nextLine();}

public void withdr(){
Scanner sc=new Scanner(System.in);
int amt;
System.out.println("Enter withdraw amount: ");
amt=sc.nextInt();
bal=bal-amt;
System.out.println("Updated Balance: "+bal);}

public void disp(){
System.out.println("Account no: "+acc);
System.out.println("Name: "+name);
System.out.println("Balance: " +bal);}

public static void main(String args[])
{
kri c1=new kri();
c1.getDetail();
c1.disp();
c1.withdr();
c1.disp();
}
}