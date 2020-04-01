package padi;
import javax.swing.*;
import java.awt.FlowLayout;
public class program19 extends JFrame {
 private JLabel item1;
  public program19()
  {
	  super("Nothing");
	  setLayout(new FlowLayout());
	  item1= new JLabel("This is the Secret");
	  item1.setToolTipText("This will be on Hover");
	  add(item1);
  }
}
