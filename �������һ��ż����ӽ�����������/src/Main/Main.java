package Main;
/**
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，要求输出组成指定偶数的两个素数差值最小的素数对
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int flag1 = 0;
	int flag2 = 0;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i = a/2;i < a;i++){ //从a/2开始判断，可判断出差值最小的
		flag1 = 0;
		flag2 = 0;
		for(int j = 2;j< Math.sqrt(i);j++ ){ //判断i是否为素数 
			if(i%j == 0){
				flag1 = 1;
			}
			if((a-i)%j == 0){
				flag2 = 1;
			}
		}
		if(flag1 == 0 && flag2 == 0){
			System.out.println(a-i);
			System.out.print(i);
			break;
		}
	}
	sc.close();
}
}
