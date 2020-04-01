package padi;
import java.util.Scanner;
public class program2 {
	public static void funct(int nu1,int nu2,Scanner je) {
		System.out.println("Press 1 for Addition \nPress 2 for subraction \nPress 3 for multiplication \nPress 4 for division \nPress 5 for modulo ");
		int ch = je.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(nu1+nu2);
			break; 
		}
		case 2:
		{
			System.out.println(nu1-nu2);
			break; 
		}
		case 3:
		{
			System.out.println(nu1*nu2);
			break; 
		}
		case 4:
		{
			System.out.println(nu1/nu2);
			break; 
		}
		case 5:
		{
			System.out.println(nu1%nu2);
			break; 
		}
		default : 
		{
			System.out.println("Give the correct option");
			funct(nu1,nu2,je);
			break; 
		}
		}
	
	}
	public static int getn1(Scanner je) {
		System.out.println("Give the first number:\n");
		return je.nextInt();
	}
	public static int getn2(Scanner je)
		{
		System.out.println("Give the second number:\n");
		return je.nextInt();
	}
	public static void main(String args[])
	{
		Scanner je = new Scanner(System.in);
		int nu1=0,nu2=0;
		nu1=getn1(je);
		nu2=getn2(je);
		funct(nu1,nu2,je);	
		while(true)
		{
			System.out.println("Press 1 to try from first\n2 to change option");
			int ch = je.nextInt();
		switch(ch)
		{
		case 1:
		{
			nu1=getn1(je);
			nu2=getn2(je);
			funct(nu1,nu2,je);
			break; 
		}
		case 2:
		{
			funct(nu1,nu2,je);
			break;
		}
		default :
		{
			System.out.println("Press the right option");
			break;
		}
		}
		}		
	}
	
}
