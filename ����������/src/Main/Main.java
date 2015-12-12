package Main;

import java.util.Scanner;

public class Main {
	public static int CalcNum(int Input[],int InputNum)  
	{  
	    /* 代码在这里实现 */  
	    int i,j;  
	    int cnt;  
	    int dp[]= new int[100];  
	    if((InputNum<1)||(InputNum%2)!=0)  
	    {  
	        return 0;  
	    }  
	    for(i=InputNum-2;i>=0;i--)  
	    {  
	        for(j=InputNum-1;j>i;j--)   
	        {  
	            cnt = isPrime(Input[i] + Input[j]) ? (dp[i + 1] - dp[j - 1] + dp[j + 1] + 1):dp[i+1];    
	            dp[i] = (cnt>dp[i]) ? cnt:dp[i];  
	        }           
	    }    
	    return dp[0];   
	}  
	  
	public static boolean isPrime(int n)  
	{  
	    // Code Here  
	    int i;  
	    if(n<2)  
	    {  
	        return false;  
	    }  
	    for(i=2;i<=n/2;i++)  
	    {  
	        if(0==n%i)  
	        {  
	            return false;  
	        }  
	    }  
	    return true;  
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arry[] = new int[a];
		for(int i = 0;i < a;i++){
			arry[i] = sc.nextInt();
		}
		CalcNum(arry,a);
	}
}
