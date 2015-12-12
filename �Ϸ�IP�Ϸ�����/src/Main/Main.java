package Main;

	import java.util.Scanner;
import java.util.Scanner;
	public class Main {
		
		static int[] result= new int[7];   //保存最后结果的数组
		public static void Chang(String str)    //转换为二进制
		{
			 String str1="";
			 String str2="";
			int num = Integer.valueOf(str);
			while(num > 1){
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
			System.out.print(str2);
		}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			String IP=sc.nextLine();
			Chang(IP);
/*			if(IP.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")){ //表示如同10.138.15.1格式
				String[] temp=IP.split("\\.");
				int a1=Integer.parseInt(temp[0]);
				int a2=Integer.parseInt(temp[1]);
				int a3=Integer.parseInt(temp[2]);
				int a4=Integer.parseInt(temp[3]);
				if(a1>=0&&a1<=255&&a2>=0&&a2<=255&&a3>=0&&a3<=255&&a4>=0&&a4<=255){
					System.out.print("YES");
				}else{
					System.out.print("NO");
				}
			}else{
				System.out.print("NO");
			}*/
			sc.close();
		}
	}


	/*void checkNetSegment(string mask,string ip1)
	{	

		int count1=0,count2=0;
		int count4=0,count5=0;
		string str1[4],str3[4];
		for(int i=0; i<mask.size(); i++)  //掩码的点个数(不连续的点等于3个)
			if(mask[i]=='.' && mask[i+1]!='.')
				count1++;
		for(int i=0; i<ip1.size(); i++)  //ip1的点个数
			if(ip1[i]=='.' && ip1[i+1]!='.')
				count2++;

		for(int i=0; i<mask.size(); i++)  //掩码的点个数(所有的点等于3个)
			if(mask[i]=='.')
				count4++;
		for(int i=0; i<ip1.size(); i++)  //ip1的点个数
			if(ip1[i]=='.')
				count5++;

		if(count1==count2&&count1==3
			&& count4==count5&&count4==3)  //如果格式正确
		{
			int i=0;                         //ip1先分解为4段
			int flag1=0;
			int k=0;
			while(i<ip1.size())
			{
				int tmp=i;
				while(isdigit(ip1[tmp]))
					tmp++;
				str1[k]=ip1.substr(i,tmp-i);
				k++;
				i=tmp+1;
			}
			i=0;                   //掩码分为4段 		
			int flag3=0,flagmk=0; 	
			k=0; 
			string test;
			while(i<mask.size()) 	
			{ 		
				int tmp=i; 	
				while(isdigit(mask[tmp])) 		
					tmp++; 		
				str3[k]=mask.substr(i,tmp-i); 	
				k++; 	
				i=tmp+1; 	
			} 		
			for(int i=0; i<4; i++)         //判断每一段的值是否在0-255之间 	
				if(atoi(str1[i].c_str())<256 &&atoi(str1[i].c_str())>=0) 	
					flag1++; 	

			for(int i=0; i<4; i++) 	
				if(atoi(str3[i].c_str())<256 &&atoi(str3[i].c_str())>=0)
					flag3++; 

			for (int i=0;i<4;i++)        //判掩码是不是1在0前面
			{
				string temp=Chang(str3[i]);
				test+=temp;
			}

			for (int j=1;j<32-1;j++)
				if (test[j-1]>test[j] && test[j]<test[j+1])
				{
					flagmk=1;
					break;
				}

				if(flag1==flag3 &&flag3==4 &&flagmk==0)      //格式正确		
				{ 

					if (str1[0]>="1" &&str1[0]<="126" )
						result[0]++;
					else if (str1[0]>="128" &&str1[0]<="191")
						result[1]++;
					else if (str1[0]>="192"&&str1[0]<="223")
						result[2]++;
					else if (str1[0]>="224"&&str1[0]<="239")
						result[3]++;
					else if (str1[0]>="240"&&str1[0]<="255")
						result[4]++;
					else if (str1[0]=="127")
						result[5]++;

					if (str1[0]=="10"||         //私有IP
						(str1[0]=="172"&&str1[1]>="16"&&str1[1]<="31")||
						(str1[0]=="192"&&str1[1]=="168"))
						result[6]++;
				}  		
				else 	
					result[5]++; 	
		} 	
		else                                         //格式不正确 	
			result[5]++;
	}  
	int main() 
	{ 	
		string s1,ms,ip;
		while (getline(cin,s1))
		{
			int position=s1.find("~",0);
			ip=s1.substr(0,position);
			ms=s1.substr(position+1,s1.size()-1);
			checkNetSegment(ms,ip);
		}
		for (int i=0;i<7;i++)
		{
			cout<<result[i];
			if (i==6)
				cout<<endl;
			else
				cout<<" ";
		}
		return 0;
	}
}*/
