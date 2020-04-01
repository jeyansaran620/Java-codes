package padi;

import java.util.Scanner;

public class program4 {
public static void main(String args[])
{
	Scanner je = new Scanner(System.in);
	int i =5;
	if(true)
	{
		System.out.println(i--);
	}
	
	System.out.print(++i);
	
	program2 another = new program2();
	i= another.getn1(je);
	System.out.println(i);
}
}
