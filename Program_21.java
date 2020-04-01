package padi;

public class Program_21 {

	public static void main(String[] args)
	{
		Program21 hell[] = new Program21[2]; 
		hell[0] = new Program21_();
		hell[1] = new Program21__();
		Program21_ hellu = new Program21_();
      hellu.eat(21);
		Program__21_ helly = new Program__21_();
		for(int x=0;x<2;++x)
			helly.digest(hell[x]);
	}
}
