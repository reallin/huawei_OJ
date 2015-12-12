package Main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args){
	int num = 0;
	int max = 0;
	int temp = 0;
	ArrayList<Integer> alist = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[] arry = new int[s];
	int[] arry1 = new int[s];
	for(int i = 0;i < s;i++){
		arry[i] = sc.nextInt();
	}
	for(int i = 0;i < s;i++){
		for(int k = i+1;k < s;k++){
			arry1 = arry;
		for(int j = 0;j < s-k;j++){		
			if(arry1[j+k] > arry1[i]){
				temp = arry1[j+k];
				arry1[j+k] = arry1[i];
			    arry1[i] = temp;
			    num++;
			}
		}
			if(max < num){
				max = num;		
	         }
			num = 0;
		}
	}
		System.out.print(max);
	sc.close();
}
}