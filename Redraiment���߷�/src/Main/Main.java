package Main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args){
	ArrayList<Integer> alist = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[] arry = new int[s];
	for(int i = 0;i < s;i++){
		arry[i] = sc.nextInt();
		Arrays.sort(arry);
	}
	for(int i = 0;i < s;i++){
		alist.add(arry[i]);
	}
	System.out.print(alist.size());
	sc.close();
}
}
