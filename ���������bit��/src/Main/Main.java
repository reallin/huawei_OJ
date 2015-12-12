package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	int[] num = new int[1000];
	int k = 0;
	int count = 0;
	if(N < 0 || N > 255)
	System.out.print("Êý¾Ý³¬ÏÞ");
	while (N > 0)
	{
	if (N % 2 == 1)
	{
	count++;
	N = N>>1;
	}
	else if (N % 2 == 0)
	{
	num[k] = count;
	count = 0;
	N = N>>1;
	k++;
	}
	}
	if (N == 0)
	{
	num[k] = count;
	}
	int max = 0;
	for(int i = 0; i <= k; i++)
	{
	if(max < num[i])
	{
	max = num[i];
	}
	}
	System.out.print(max);
    sc.close();
	}
}
