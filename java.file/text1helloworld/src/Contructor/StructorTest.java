package Contructor;

public class StructorTest {
private String name;
private int count;
public void setName(String name)
{
	this.name = name;
	return;
}
public String getName()
{
return this.name;	
}
public void setAge(int count)
{
	if(count>100||count<=0)
	{
		System.out.println("´íÎó");
	return;
	}
	else
	{
		this.count=count;
	}
	
}public int getCount()
{
return this.count;	
}
public StructorTest(String a ,int b )
{
	setAge(b);
	setName(a);
}
public static void main(String[] args)
{
	StructorTest tc =  new StructorTest("·è¿ñÓ¢Óï",20);
	System.out.println(tc.getName());
	System.out.println(tc.count);
	
}
}
