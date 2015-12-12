package Main;
/**
 * 密码验证合格程序 
 * 长度超过8位
 * 包括大小写字母.数字.其它符号,以上四种至少三种
 * 不能有相同长度超2的子串重复
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		String str=sc.nextLine();
		boolean bol1=changdu(str);
		boolean bol2=zhonglei(str);
		boolean bol3=chongfu(str);
		if(bol1&&bol2&&bol3) System.out.println("OK");
		else System.out.println("NG");}
		sc.close();
	}
	public static boolean changdu(String str)
	{
		if(str.length()>8)
			return true;
		return false;
	}
	public static boolean zhonglei(String str)
	{
		boolean isUp = false;
		boolean isLow = false;
		boolean isShu = false;
		boolean isOther = false;
			
		Pattern patUp=Pattern.compile("[A-Z]"); //匹配大写字母
		Matcher matUp=patUp.matcher(str);
		while(matUp.find())
			isUp = true;
		
		Pattern patLow=Pattern.compile("[a-z]");
		Matcher matLow=patLow.matcher(str);
		while(matLow.find())
			isLow = true;
		
		Pattern patShu=Pattern.compile("\\d");
		Matcher matShu=patShu.matcher(str);
		while(matShu.find())
			isShu = true;
		
		char[] temp = str.toCharArray();
		for(int i=0;i<temp.length;i++)
		{
			if(!((temp[i]>='a'&&temp[i]<='z')||(temp[i]>='A'&&temp[i]<='Z')
					||(temp[i]>='0'&&temp[i]<='9')))
			{
				isOther = true;
			}
		}
		int count = 0;
		if(isLow)
			count++;
		if(isOther)
			count++;
		if(isUp)
			count++;
		if(isShu)
			count++;
		if(count>=3)
			return true;
		return false;
	}
	public static boolean chongfu(String str)
	{
		if(str.length()>8)
		{
			for(int i=0;i<str.length()-2;i++)
			{
				String reString = str.substring(i,i+2);
				for(int j=i+1;j<str.length()-2;j++)
				{
					String resString = str.substring(j,j+2);
					if(reString.equals(resString))
					{
						return false;
					}
				}
			}
			
		}
		return true;
		
	}

}

