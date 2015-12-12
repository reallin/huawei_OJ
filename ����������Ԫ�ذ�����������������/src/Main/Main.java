package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[] arry = new int[s];
	for(int i = 0;i < s;i++){
		arry[i] = sc.nextInt();
	}
	int flag = sc.nextInt();
	Arrays.sort(arry);
	if(flag == 0){  //ÉýÐò
	for(int i = 0;i <arry.length;i++){
		if(i != arry.length-1){
	System.out.print(arry[i]+" ");
		}
		if(i == arry.length-1){
			System.out.print(arry[i]);
		}
	}
	}
	else if(flag == 1){  //½µÐò
		for(int i = arry.length-1;i >=0;i--){
			if(i != 0){
				System.out.print(arry[i]+" ");
					}
					if(i == 0){
						System.out.print(arry[i]);
					}
		}
	}
	sc.close();
}
}
