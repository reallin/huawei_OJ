package Main;
/**
 * 输出7有关数字的个数，包括7的倍数，还有包含7的数字
 */
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	int count = 0;
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();
	for(int i = 1;i < str;i++){
		if(i%7 == 0||(i%1000/100)==7||(i%100/10)==7||(i%10==7)){
			count++;
		}
	}
	System.out.print(count);
	sc.close();
}
}
