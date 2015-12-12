package FrameTest;
import java.awt.*;
public class FrameTest {
public static void main(String[] args)
{
	Frame f = new Frame("≤‚ ‘");
	f.setLayout(new FlowLayout(FlowLayout.LEFT, 10,6));
	for(int i = 0;i<10;i++)
	{
		f.add(new Button("aa"+i));
	}
	f.pack();
	/*Panel p = new Panel();
	p.add(new TextField(20));
	p.add(new Button("aaa"));
	f.add(p);
	f.setBounds(25,30,250,200);*/
	f.setVisible(true);
}
}
