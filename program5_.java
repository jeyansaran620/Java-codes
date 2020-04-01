package padi;

public class program5_ {
	private String girlName;
	public program5_(String name) {
		girlName= name;
	}
public void setName(String name) {
	girlName= name;
}
public String giveName() {
	return girlName;
}
public void printName()
{
	System.out.print(giveName());
}
}
