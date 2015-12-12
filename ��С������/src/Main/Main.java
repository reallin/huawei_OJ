package Main;

import java.util.Scanner;

/**
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数
 * @author Administrator
 *
 */
public class Main {
public static void main(String[] args){
	int temp = 0;
	int max;
	int min;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
    if(a > b){
    	max = a;
    	min = b;
    }
    else{
    	max = b;
    	min = a;
    }
	for(int j = 1;j <= j;j++){
		if((max*j)%min == 0){
		   temp = max*j;
		   break;
		}
	}
	System.out.print(temp);
	sc.close();
}
}
