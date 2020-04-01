package padi;

public class program14 {
public static void main(String args[])
{
	program14_ get = new program14_(0,0,9);
	System.out.println(get.toMilitary());
	System.out.println(get.toString());
	get.setTime(9,15,45);
	System.out.println(get.toString());
	get.setHour(5);
	System.out.println(get.toMilitary());
	System.out.println(get.toString());
}
}
