package Main;
/**
 * 对整数完成“去重”与“排序”的工作
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
 public static void main(String[] args){
	 ArrayList<Integer> alist = new ArrayList<Integer>();
	 Scanner sc = new Scanner(System.in);
	 int s = sc.nextInt();
	 int[] arry = new int[s];
	 for(int i = 0;i < s;i++){
		 arry[i] = sc.nextInt();
	 }
	 Arrays.sort(arry);
	 for(int i = 0;i < s;i++){
		 if(!alist.contains(arry[i])){
		 alist.add(arry[i]);
		 }
	 }
	 for(int i = 0;i < alist.size();i++){
	 System.out.println(alist.get(i));
	 }
	 sc.close();
 }
}
