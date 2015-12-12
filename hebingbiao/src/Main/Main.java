package Main;

import java.util.Scanner;
public class Main {
	public static void main(String[] args){
    int count = 0;
    int flag = 0;
   Scanner sc = new Scanner(System.in);
   int s = sc.nextInt();
   int[][] arry1 = new int[s][2];
   int arry[] = new int[s*2];
   for(int i = 0;i < s*2;i++){
	   int s1 = sc.nextInt();
	   arry[i] = s1;
   }
   for(int i = 0;i < s;i++){
		   for(int j = 0;j < count;j++){
			   if(arry1[j][0] == arry[i*2]){
				   arry1[j][1] += arry[i*2+1];
				   flag = 1;
			   }
		   }
		   if(flag == 0){
			   arry1[count][0] = arry[i*2];
			   arry1[count][1] = arry[i*2+1];
			   count++;
	   }
		   flag = 0;
   }
   for(int i = 0;i < count;i++){
	  // System.out.println(arry[i]);
	   System.out.println(arry1[i][0]);
	   System.out.println(arry1[i][1]);
	   }

	   }
   }