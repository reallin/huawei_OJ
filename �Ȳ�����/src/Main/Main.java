package Main;
/**
 * 等差数列 2，5，8，11，14。。。。求前N项之和。
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();
	int[] arry = new int[str];
	for(int i = 0;i < arry.length;i++){
		arry[i] = 2+3*i;                  //将等差数列各值赋到数组里
	}
	for(int i = 0;i < arry.length;i++){
		sum += arry[i];           //数组前N项求和
	}
	System.out.print(sum);
	sc.close();
}
}
