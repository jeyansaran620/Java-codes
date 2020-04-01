package padi;
import java.util.EnumSet;
public class program16 {
	public static void main(String args[])
	{
		for(program_16 info : program_16.values())
		{
			System.out.printf("%s\t%s\t%s\n",info,info.getDesc(),info.getAge());
		}
		for(program_16 info : EnumSet.range(program_16.bigil,program_16.saran2))
		{
			System.out.printf("%s\t%s\t%s\n",info,info.getDesc(),info.getAge());
		}
	}
	

}
