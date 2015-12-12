package apple;

public class apple {
private String color;

public String getColor()
{
	return color;
}
public void setColor(String str){
	this.color = str;
}
public apple()
{
	System.out.println("无参构造运行");
}
public apple(String str){
	System.out.println("有参数构造运行");
	this.color = str;
}

}


