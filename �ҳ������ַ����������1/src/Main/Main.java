package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String maxStr = null;
		String minStr = null;
		int sum = 0;
		int temp = 0;
		int max = 0;
		int flag = 0;
		   Scanner sc = new Scanner(System.in);
		   String str = sc.nextLine();
		   System.out.print(str);
		   String str1 = sc.nextLine(); 
		   System.out.print(str1);
		   if(str.length() < str1.length()){
				minStr = str;
				maxStr = str1;	
			}
			else{
				minStr = str1;
				maxStr = str;
			}
				
			for(int i = 0; i < minStr.length() ;i++){
				for(int j = 0;j < maxStr.length();j++){
					while(minStr.charAt(i+temp) == maxStr.charAt(j+temp)){
							temp++;
							sum++;
					}
					if(max < sum){
						max = sum;
						flag = i;
					}
					sum = 0;
					temp = 0;
				}
			}
		   System.out.print(minStr.substring(flag,flag+max));
		   sc.close();
}
}
