package Main;

import java.util.Scanner;

public class Main {
	public static int run(int x){  
		   
		 if(x<=2){//前两行直接返回-1  
		     return -1;  
		 }else if(x%2 == 1){//奇数行第一个出现偶数为2  
		     return 2;  
		 }  
		return x / 2 % 2 + 3;  
		}  
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int str = sc.nextInt();
		System.out.print(run(str));
		sc.close();
	}
}
