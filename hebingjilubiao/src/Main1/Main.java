package Main1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args){
    int count = 0;
    int flag = 0;
   Scanner sc = new Scanner(System.in);
   int s = sc.nextInt();
   int[][] arry1 = new int[s/2+1][2];
   int arry[] = new int[s];
   for(int i = 0;i < s;i++){
	   int s1 = sc.nextInt();
	   arry[i] = s1;
   }
   for(int i = 0;i < s;i+=2){
		   for(int j = 0;j < arry1.length;j++){
			   if(arry1[j][0] == arry[i]){
				   arry1[j][1] += arry[i+1];
			   }
			   flag = 1;
		   }
		   if(flag == 0){
			   arry1[count][0] = arry[i];
			   arry1[count][1] = arry[i+1];
			   count++;
	   }
		   flag = 0;
   }
   for(int i = 0;i < arry1.length;i+=2){
	   System.out.println(arry1[i][0]);
	   System.out.println(arry1[i][1]);
	   }

	   }
   }


