package padi;

public class Program_15 {
    private String name;
    private Program15 bday;
	public Program_15(String theName,Program15 Birthday)
	{
	name = theName;
	bday = Birthday;
	System.out.printf("this constructs %s\n",this);
	}
	public String toString()
	{
		return String.format("My name is %s, My Birthday is %s",name,bday);
	}
}
