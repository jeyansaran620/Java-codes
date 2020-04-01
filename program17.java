package padi;

public class program17 {
     private String first_name;
	 private String last_name;
	 private static int members=0;
	
 public program17(String Fn,String Ln)
 {
		 first_name=Fn;
		 last_name=Ln;
		 members++;
		 System.out.printf("The %d Member's First Name is %s The Last Name is %s\n",members,first_name,last_name);
 }
 
 public static int getMembers()
 {
	 return members;
 }
}
