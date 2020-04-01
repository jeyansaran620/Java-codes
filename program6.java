package padi;

public class program6 {
 public static void main(String args[]) {
	 double amount=0,rate=0.01;
	 int principal=10000,year;
	 for (year=1;year<=25;year++)
{
   amount=principal*Math.pow(1+rate,year);
   System.out.println(amount);
		 
}
 }
}
