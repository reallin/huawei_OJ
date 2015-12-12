package Main;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	int sum = 0;
	int temp = 0;
	int count = 0;
	int[] sum1;
	int[] sum2 = new int[1000];
	String[] arry =new String[1000];
	char[] ca = new char[1000];
	Scanner sc = new Scanner(System.in);
	int num =Integer.parseInt(sc.nextLine());
	//System.out.println(num);
	for(int i = 0;i < num;i++){
	   arry[i] = sc.nextLine().toLowerCase();
	   ca = arry[i].toCharArray();
	   Arrays.sort(ca);
	   sum1 = new int[arry[i].length()];
	   for(int j = 0;j < arry[i].length();j=j+temp+1){
		   for(int k = j+1;k < arry[i].length();k++){ 
			   if(ca[j] == ca[k]){
				   sum++;
			   }
		   }
		   sum1[count] =sum+1;
		   count++;
		   temp = sum;
		   sum = 0;
	   }
	   Arrays.sort(sum1);
	   for(int j = sum1.length-1;sum1[j]!=0 && j >= 0;j--){
		   sum2[i] = sum1[j]*(26+j-sum1.length+1) + sum2[i];
	   }
	   count = 0; 
	}
	for(int i = 0;i < num;i++){
	 System.out.println(sum2[i]);
	}
	   sc.close();
}
}
