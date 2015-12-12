package GridBagTest;
import java.awt.*;
public class GridBagTest {
private Frame f= new Frame("²âÊÔ´°¿Ú");
private GridBagLayout gb = new GridBagLayout();
private GridBagConstraints gbc =  new GridBagConstraints();
private Button[] bs= new Button[10];
public void init()
{
    f.setLayout(gb);
    for(int i = 0; i<bs.length;i++)
    {
    	bs[i]=new Button("aa"+i);
    	
    }
    gbc.fill=GridBagConstraints.BOTH;
    gbc.weightx =1;
    addButton(bs[0]);
    //gbc.weightx = 0;
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    addButton(bs[1]);
    gbc.weightx = 0;
    addButton(bs[2]);
    f.pack();
    f.setVisible(true);
}
public static void main(String[] args)
{
  new GridBagTest().init();	
}
private void addButton (Button button)
{
   gb.setConstraints(button, gbc);
   f.add(button);
}
}
