package test;

import java.util.Calendar;
import java.util.Scanner;
// this is second commit
public class Employee {
static int empId=1234;
static String empName="Ritika";
private int total_leaves;
private double total_salary;
int month;
Scanner sc=new Scanner(System.in);

 Employee ()
{

System.out.println("EMPLOYEE'S MONTHLY RECORD\n");
System.out.println("Employee's ID: "+empId);
System.out.println("Employee's Name: "+empName);
System.out.print("Employee's Status: ");
Scanner sc1=new Scanner(System.in);
String empstat=sc1.next();

}

public void calculate_balance_leaves()
{
	System.out.println("Enter number of days in current month:");
	Scanner sc=new Scanner(System.in);
	month=sc.nextInt();
	if (month==30)
	{
		System.out.println("Total Number of leaves: 8");
	}
	else if((month==28)||(month==29))
	{
		System.out.println("Total Number of leaves: 7");
	}
	else
	System.out.println("Total Number of leaves: 9 ");
	
	
	
	
}

/*public boolean avail_leave(int no_of_leaves, char type_of_leave)
{
	
}*/

/*void calculate_salary()
{
	if (month==30)
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee oo=new Employee();
oo.calculate_balance_leaves();


	}

}
