package padi;

public class program10 {
public static void main(String args[])
{
	int array[]= {3,4,5,6,11,8},p=9;
	change(array);
	changed(p);
	for(int i:array)
	{
		System.out.println(i);
	}
	System.out.println(p);
}
public static void change(int x[])//array values will be changed
{
	for(int i=0;i<x.length ;i++)
	{
		++x[i];
	}
}

public static void changed(int x)//variable value cant be changed
{
		x=99;
}
}
