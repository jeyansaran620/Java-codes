package padi;

public enum program_16 {

	jeyan("hello","12"),
	saran("hi","20"),
	bigil("dude","22"),
	jeyan1("hello","12"),
	saran2("hi","20"),
	bigil3("dude","22");
	
	public String desc;
	public String age;
	
	program_16(String des,String year)
	{
		desc = des;
		age=year;
	}
	public String getDesc()
	{
		return desc;
	}

	public String getAge()
	{
		return age;
	}
}
