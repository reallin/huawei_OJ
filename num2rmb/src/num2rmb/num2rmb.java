package num2rmb;

import java.util.Arrays;

public class num2rmb {
private String[] han={"Áã","Ò¼","Ù@","Èþ",
  "ËÁ","Îé","Â½","Æâ","°Æ","¾Á"};
private String[] unitArr={"Ç§","°Ù","Ê®"};

private String[] div (double a)
{
  long b = (long) a;
  long c = Math.round((a-b)*100);
  return new String[]{b+" ", String.valueOf(c)};  
}
private String toHan(String d)
{
	String result="";
	for(int i=0;i<d.length();i++)
	{
		int num = d.charAt(i)-48;
		if(num!=0&&i!=d.length()-1)
		{
		  result+=han[num]+unitArr[i];	
		}
		else
		{
			result+=han[num];
		}
	}
	return result;
}
public static void main(String[] args)
{
	num2rmb nu = new num2rmb();
 System.out.println(Arrays.toString(nu.div(1234.567)));	
 System.out.println(nu.toHan("3204"));
}
}
