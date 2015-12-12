package CommonComponent;
import java.awt.*;
import javax.swing.*;
public class CommonComponent {
Frame f = new Frame("²âÊÔ");
Button ok = new Button("È·ÈÏ");
CheckboxGroup a = new CheckboxGroup();
Checkbox male = new Checkbox("ÄÐ",a,true);
Checkbox female = new Checkbox("Å®",a,false);
Choice color =  new Choice();
List colorList = new List();
TextArea ta = new TextArea(5,20);
TextField name = new TextField(50);
public void init()
{
    color.add("ºì");
    color.add("ÂÌ");
    color.add("À¶");
    colorList.add("ºì");
    colorList.add("ÂÌ");
    Panel bottom =new Panel();
    bottom.add(name);
    bottom.add(ok);
    f.add(bottom,BorderLayout.SOUTH);
    Panel checkPanel = new Panel();
    checkPanel.add(color);
    checkPanel.add(male);
    checkPanel.add(female);
    Box topLeft = Box.createVerticalBox();
    topLeft.add(ta);
    topLeft.add(checkPanel);
    Box tope = Box.createHorizontalBox();
    tope.add(topLeft);
    tope.add(colorList);
    f.add(tope);
    f.pack();
    f.setVisible(true);
    
    
    	
}
public static void main(String[] args)
{
    new CommonComponent().init();	
}

}
