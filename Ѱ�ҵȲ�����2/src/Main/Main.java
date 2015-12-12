package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		if(m>=0&&n>m&&n<=30)
		{
			for(int i=m;i<n;i++)
			{
				if(isPrime(i))
					prime.add(i);
			}
		}
		
		dengcha(prime);
		
	}
	public static void dengcha(ArrayList<Integer> arr)
	{
		int sz=arr.size();  
		int max = 0,maxcha=0;
		int gongcha = 0;
		int count = 0;
		int x = 0;
		int start = 0;
		for(int i=0;i<sz-1;i++)
		{
			for(int j=i+1;j<sz;j++)
			{
				gongcha = arr.get(j)-arr.get(i);
				x = arr.get(j)+gongcha;
			
				count = 2;		
				while(arr.contains(x))
				{
					count++;
					x = x+gongcha;
				}
				if(count >max)
				{
					max = count;
					start = i;
					maxcha = gongcha;
				}
			}
		}
		int y = 0;
		System.out.print(arr.get(start)+" ");
		y=arr.get(start)+maxcha;
		while(arr.contains(y))
		{
			System.out.print(y+" ");
			y = y+maxcha;
		}
	}
	public static boolean isPrime(int k)
	{
		if(k<2)
			return false;
		for(int i=k-1;i>=2;i--)
		{
			if(k%i==0)
				return false;
		}
		return true;
	}
	
}
