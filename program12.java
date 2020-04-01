package padi;

public class program12 {
public static void main(String args[])
{
	System.out.println(max(312,55,616,76,443,66,909));
}
public static int max(int...numbers)//To find the maximum of the numbers
{
	int max= numbers[0];
	for(int i=0;i<numbers.length;i++)
	{
		if(max<numbers[i])
			max=numbers[i];
	}
	return max;
}
}
