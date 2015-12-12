package Main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main {
	Frame f = new Frame("测试");
	FileDialog d1 = new FileDialog(f,"选择需要打开文件",FileDialog.LOAD);
	FileDialog d2 = new FileDialog(f,"选择需要保存路径",FileDialog.SAVE);
	Button b1 = new Button("打开文件");
	Button b2 = new Button("保存文件");
	public void init(){
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d1.setVisible(true);
				System.out.println(d1.getDirectory()+d1.getFile());
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d2.setVisible(true);
				System.out.println(d2.getDirectory()+d2.getFile());
			}
		});
		f.add(b1);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
public static void main(String[] args){
	new Main().init();
}
}
