package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		boolean flag = false;
		sc.close();
		if(num%2==0)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=2;i<num;i++)
			{
				if(isPrime(i))
				{
					list.add(i);
				}
			}
			for(int i=list.size()/2;i>=0;i--)
			{
				for(int j=list.size()/2+1;j<list.size();j++)
				{
					if(list.get(i)!=list.get(j))
					{
						if(list.get(i)+list.get(j)==num)
						{
							System.out.println(list.get(i));
							System.out.println(list.get(j));
							flag=true;
							break;
						}
					}
				}
				if(flag==true)
					break;
			}
		}

	}
	public static boolean isPrime(int k)
	{
		if(k==2)
			return true;
		if(k<2||k>2&&k%2==0)
			return false;
		int j = (int)Math.sqrt(k);
		if(j%2==0)
			j--;
		while(j>2 && k%j!=0)
			j-=2;
		return j<2;
	}
}