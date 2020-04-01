package padi;
import java.util.Random;
public class program8 {
public static void main(String args[])
{
	Random dice = new Random();
	int array[] = new int[6];
	
	for (int i=0;i<100;i++)
	{
		++array[dice.nextInt(6)];
	}
	System.out.println("number\tTimes");
	for (int q=0;q<6;q++)
	{
		System.out.println(q+1+"\t"+array[q]);
	}
}
}
