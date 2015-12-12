package Main;
/**
 * 免子问题其实是斐波那契数列
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	  int[] arry = new int[1000];
	  Scanner sc = new Scanner(System.in);
	  int s = sc.nextInt();
	  arry[0] = arry[1] = 1;
	  for(int i = 2;i < s;i++){
		  arry[i] = arry[i-1]+arry[i-2];
	  }
	  System.out.print(arry[s-1]);
	  sc.close();
  }
}
