package Main;

import java.util.Scanner;

	public class Main {
		
		static int[] result= new int[7];   //保存最后结果的数组
		public static String Chang(String str)    //转换为二进制
		{
			 String str1="";
			 String str2="";
			int num = Integer.valueOf(str);
			while(num >= 1){
			if(num % 2 == 0){
			  str1 += "0";
			}
			if(num % 2 == 1){
				  str1 += "1";
				}
			num = num/2;
			}
			for(int i = 0;i < str1.length();i++){
			  str2 += String.valueOf(str1.charAt(str1.length()-i-1));
			}
			if(str2.length()<=8){
				str2 = (str2+"00000000").substring(0,8); 
			}
			return str2;
		}

		public static void main(String[] args) {
			String test = "";
			int flagmark = 0;
			Scanner sc=new Scanner(System.in);
			while(true){
			String str=sc.nextLine();
			String IP = str.split("~")[0];
			String IP1 = str.split("~")[1];
			if(IP1.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")){ //表示如同10.138.15.1格式
			String[] temp1=IP1.split("\\.");
			int[] str2 = new int[4];
			str2[0]=Integer.parseInt(temp1[0]);
			str2[1]=Integer.parseInt(temp1[1]);
			str2[2]=Integer.parseInt(temp1[2]);
			str2[3]=Integer.parseInt(temp1[3]);

			if(str2[0]>=0&&str2[0]<=255&&str2[1]>=0&&str2[1]<=255&&str2[2]>=0&&str2[2]<=255&&str2[3]>=0&&str2[3]<=255){
				
				for (int i=0;i<4;i++)        //判掩码是不是1在0前面
				{
					String temp2=Chang(String.valueOf(str2[i]));
					test+=temp2;
				}
				for (int j=1;j<32-1;j++)
					if (test.charAt(j-1)>test.charAt(j) && test.charAt(j)<test.charAt(j+1))
					{
						flagmark=1;
					}
				test = "";
			if(IP.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")){ //表示如同10.138.15.1格式
				String[] temp=IP.split("\\.");
				int[] str1 = new int[4];
				str1[0]=Integer.parseInt(temp[0]);
				str1[1]=Integer.parseInt(temp[1]);
				str1[2]=Integer.parseInt(temp[2]);
				str1[3]=Integer.parseInt(temp[3]);
				if(flagmark == 0&&str1[0]>=0&&str1[0]<=255&&str1[1]>=0&&str1[1]<=255&&str1[2]>=0&&str1[2]<=255&&str1[3]>=0&&str1[3]<=255){
					if (str1[0]>=1 &&str1[0]<=126 )
						result[0]++;
					else if (str1[0]>=128 &&str1[0]<=191)
						result[1]++;
					else if (str1[0]>=192&&str1[0]<=223)
						result[2]++;
					else if (str1[0]>=224&&str1[0]<=239)
						result[3]++;
					else if (str1[0]>=240&&str1[0]<=255)
						result[4]++;
					else if (str1[0]==127)
						result[5]++;

					if (str1[0]==10||         //私有IP
						(str1[0]==172&&str1[1]>=16&&str1[1]<=31)||
						(str1[0]==192&&str1[1]==168))
						result[6]++;
				}  	
				else{
					result[5]++;
				}
			}
			else{
				result[5]++;
			}
			}else{
				result[5]++;
			}
			}
			else{
				result[5]++;
			}
			flagmark = 0;
			for (int i=0;i<7;i++)
			{
				if (i<6)
					System.out.print(result[i]+" ");
				else
					System.out.print(result[6]);
			}
			
			}
		}
			}
	
