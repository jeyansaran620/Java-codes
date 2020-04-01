package padi;
import java.util.Random;
public class program7 {
public static void main(String args[])
{
	Random freq = new Random();
	int hey[]= new int[10];
	for (int i=0;i<10;i++)
	{
		hey[i]=1+freq.nextInt(6);
		System.out.println(hey[i]);
	}
	
	int maxi = Math.max(Math.max(Math.max(1+freq.nextInt(66),12),Math.max(10,5)),Math.max(Math.max(8,1+freq.nextInt(66)),Math.max(16,2)));
	System.out.println(maxi);
}
}
