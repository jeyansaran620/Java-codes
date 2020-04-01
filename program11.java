package padi;

public class program11 {
public static void main(String args[])
{
	int hey[][][]= {{{10,12,13,16,17},{62,93,74,89}},{{61,34,75,61,57},{16,39,67,74,20}}};
	for(int i=0;i<hey.length;i++)
	{
		for(int o=0;o<hey[i].length;o++)
		{
			for(int p=0;p<hey[i][o].length;p++)
			{
	 System.out.print(hey[i][o][p]+"\t");
	}

			 System.out.println();
		}

		 System.out.println();
		 System.out.println();
	}
}
}
