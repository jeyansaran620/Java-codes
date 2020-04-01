package padi;

import java.util.Scanner;

public class program_5 {
public static void main(String args[])
{ 
	Scanner inp = new Scanner(System.in);
	program5_ give = new program5_("jeyan");
	program5_ give2 = new program5_("saran");
	System.out.println("Give the Name:");
	String temp = inp.nextLine();
	give.setName(temp);
	give.printName();
	give2.printName();
}
}
