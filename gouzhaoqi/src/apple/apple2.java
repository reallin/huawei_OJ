package apple;

public class apple2 extends apple{
public apple2(){
	super();
}
public static void main(String args[]){
	apple f = new apple2();
	f.setColor("给私有成员赋值");
	
	String s1 = f.getColor();
	System.out.println(s1);
}
}
