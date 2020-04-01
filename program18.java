package padi;
import javax.swing.JOptionPane;
public class program18 {

	public static void main(String args[])
	{
		String fi=JOptionPane.showInputDialog("Enter the First number:");
		String ls=JOptionPane.showInputDialog("Enter the Second number:");
		int first = Integer.parseInt(fi);
		int second = Integer.parseInt(ls);
		int sum = first+second ; 
		JOptionPane.showMessageDialog(null, "The sum is "+sum,"Calculator",JOptionPane.PLAIN_MESSAGE);
	}
}
