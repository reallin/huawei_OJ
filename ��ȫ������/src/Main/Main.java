package Main;
/**
 * 给出一个数
 * 输出完全数的个数
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int sum = 0;
	int num = 0;
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	for(int i = 1;i < s;i++){
		sum = 0;
		for(int j = 1;j <= i/2;j++){
			if(i%j == 0){
			sum += j;
			}
		}
		if(sum == i){
			num++;
		}
	}
	System.out.print(num);
	sc.close();
}
}
