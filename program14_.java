package padi;

public class program14_ {
	private int hour,second,minute;
	public program14_(int h)
	{
		this(h,0,0);
	}
	public program14_(int h,int m)
	{
		this(h,m,0);
	}
	public program14_(int h,int m,int s)
	{
		hour = h;
		minute = m;
		second = s;
		System.out.printf("this constructs %s\n",this);
	}
public void setTime(int h,int m,int s)
{
 setHour(h);
 setMinute(m);
 setSecond(s);
}
public void setHour(int h)
{
	 hour=(h<24 && h>=0 ? h : 0);
}
public void setMinute(int m)
{
	 minute=(m<60 && m>=0 ? m : 0);
}
public void setSecond(int s)
{
	 second=(s<60 && s>=0 ? s : 0);
}
public String toMilitary()
{
	return String.format("%02d:%02d:%02d",hour,minute,second);
}
public String toString()
{
	return String.format("%02d:%02d:%02d %s",hour==0 ? 12 :(hour<=12 && hour>0 ? hour : hour-12),minute,second,hour<12 && hour>=0 ? "AM" : "PM");
}
}
