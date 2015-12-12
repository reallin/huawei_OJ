package Main;
/**
 * 输入n个整数，输出其中最小的k个
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	//int str1 = sc.nextInt();
	int[] arry = new int[2];
	String[] arry1 = new String[2];
	arry1 = str.split(" ");             //将第一行输入两数据存入数组
	arry[0] =Integer.valueOf(arry1[0]);
	arry[1] = Integer.valueOf(arry1[1]);
	String[] arry2 = new String[arry[0]];
	String str2 = sc.nextLine();
		arry2 = str2.split(" ");
		/*for(int i = 0;i < str;i++){
			arry[i] = Integer.valueOf(arry1[i]);
		}*/
		Arrays.sort(arry2);    //数组排序
		for(int i = 0;i < arry[1];i++){      
			if(i < (arry[1] - 1)){   //输出最后面不要有空格
		System.out.print(arry2[i]+" ");
			}
			else{
				System.out.print(arry2[arry[1]-1]);
			}	
		}
		sc.close();
}
}