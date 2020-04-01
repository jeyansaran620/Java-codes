package padi;

public class Program15 {
	private int day,month,year;
	
	public Program15()
	{
		this(1,1,2000);
	}
	public Program15(int d)
	{
		this(d,1,2000);
	}
	public Program15(int d,int m)
	{
		this(d,m,2000);
	}
	public Program15(int d,int m,int y)
	{
		day = d;
		month = m;
		year = y;
		System.out.printf("this constructs %s\n",this);
	}
public void setDate(int d,int m,int y)
{
 setDay(d);
 setMonth(m);
 setYear(y);
}
public void setDay(int d)
{
	 day=(d<31 && d>=0 ? d : 1);
}
public void setMonth(int m)
{
	 month=(m<12 && m>=0 ? m : 1);
}
public void setYear(int y)
{
	 year=(y<3000 && y>=0 ? y : 2000);
}
public String toString()
{
	return String.format("%d/%d/%d",day,month,year);
}
}