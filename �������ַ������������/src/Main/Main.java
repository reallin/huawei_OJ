package Main;
/**
 * 查找两个字符串a,b中的最长公共子串。
 */
import java.util.Scanner;

public class Main {
	public static String iQueryMaxCommString(String stringA, String stringB){
        String minStr = null;
        String maxStr = null;
		int sum = 0;
		int temp = 0;
		int max = 0;
		int flag = 0;
		if(stringA.length() < stringB.length()){   //分出两字符串中较长和较短的
			minStr = stringA;
			maxStr = stringB;
		}
		else{
		   minStr = stringB;
		   maxStr = stringA;
		}
		for(int i = 0; i < minStr.length() ;i++){    //从短串开始，逐个查找相同串
			for(int j = 0;j < maxStr.length();j++){  
				while((j+temp)<maxStr.length() && (i+temp)<minStr.length() && (minStr.charAt(i+temp) == maxStr.charAt(j+temp))){  //两字符串逐加1比较直到不相等且访问短字符串结束
					temp++;
					sum++;
					}
				if(max < sum){   //找出最长相同串的长度
					max = sum;
					flag = i;
				}
				sum = 0;
				temp = 0;
			}
		}
		return minStr.substring(flag,flag+max);
	}
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   String str1 = sc.nextLine(); 
	   System.out.print(iQueryMaxCommString(str,str1));
	   sc.close();
	}
}
