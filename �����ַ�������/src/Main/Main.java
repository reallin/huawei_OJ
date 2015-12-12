package Main;

/**
 * 计算两个字符串的最大公共字串的长度，字符不区分大小写
 */
import java.util.Scanner;
public class Main {
private static int getCommonStrLength(String pFirstStr,String pSecondStr)
{
   int firstCount = pFirstStr.length();
   int secondCount = pSecondStr.length();
   int maxCount;
   int minCount;
   String MaxStr;
   String MinStr;
   if(firstCount < secondCount)
   {
	   MaxStr  = pSecondStr.toLowerCase();
	   MinStr  = pFirstStr.toLowerCase();
	   maxCount = secondCount;
	   minCount = firstCount;
   }
   else
   {
	   MaxStr = pFirstStr.toLowerCase();
	   MinStr  = pSecondStr.toLowerCase();
	   maxCount = firstCount;
	   minCount = secondCount;
   }
   for(int i = minCount;i >= 1;i--)
   {
	   for(int j = 0;j <= minCount - i;j++ )
	   {
		   for(int k = 0; k <= maxCount - i; k++ )
		   {
			   if(MinStr.substring(j,i+j).equals(MaxStr.substring(k,i+k)))
			    {
				   return i;
			    }  
		   }
	   }
   }
   return 0;
}
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   String[] arry = str.split(" ");
   System.out.println(getCommonStrLength(arry[0],arry[1]));
   sc.close();
}
}