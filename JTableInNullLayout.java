import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JTableInNullLayout
{
  public static void main(String[] argv) throws Exception {

      JPanel panel = new JPanel(null);
	int i=50;
      JLabel helloLabel = new JLabel("Hello world!");
	
	for(i=50; i<1000; i+=20)
      	{helloLabel.setBounds( i, 500, 100, 25 );} // x, y, width, height
      panel.add(helloLabel);

      JFrame frame = new JFrame();
      frame.add(panel);
      frame.setPreferredSize( new Dimension(200,200));
      frame.pack();
      frame.setVisible(true);
  }
}