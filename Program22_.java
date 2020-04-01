package padi;

public class Program22_ {
  Program22[] animal = new Program22[2];
 private int i=0;
 public void add(Program22 x) {
	 if(i<animal.length)
	{
	 animal[i]=x;
	 System.out.println("animal added to index "+i);
	 i++;
    }
}
	 
}
