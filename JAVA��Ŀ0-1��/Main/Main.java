package Main;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static int flag = 0;
	 public static void judge(int number, int value,Object[] others)
	 {
		 //int flag = 0;
	 	for(int i=number-1;i>=0;i--)
	 	{		
	 		if(value >= (int)others[i])
	 		{
	 			value = value - (int)others[i];
	 			if(value == 0)
	 			{
	 				flag = 1;
	 				System.out.print("true");
	 				//return flag;
	 				break;
	 			}
	 			judge(i-1,value,others);
	 		}		
	 	}		
	 }
	
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int s = Integer.valueOf(sc.nextLine());
	  ArrayList<Integer> alist = new ArrayList<Integer>();
	  ArrayList<Integer> alist1 = new ArrayList<Integer>();
	  ArrayList<Integer> alist2 = new ArrayList<Integer>();
	  int[] arry = new int[s];
	  int temp = 0;
	  int sum = 0;
	  int sum1 = 0;
	  int sum2 = 0;
	  for(int i = 0;i < s;i++){
		  sum += arry[i];
	  }
	  if(sum % 2 == 0){
		  for(int i = 0;i < s;i++){
			  if(arry[i] % 5 == 0){
				  alist.add(arry[i]);
			  }
			  else if(arry[i] % 3 == 0){
				  alist1.add(arry[i]);
			  }
			  else{
				  alist2.add(arry[i]);
			  }
		  }
		  for(int i = 0;i < alist.size();i++){
			  sum1 += alist.get(i);
		  }
		  for(int i = 0;i < alist1.size();i++){
			  sum2 += alist1.get(i);
		  }
		  if(sum1 < sum2){
			 temp = sum/2-sum1;
			 judge(alist2.size(), temp,alist2.toArray());
			 if(flag == 1){
				 System.out.print("false");
			 }
		  }	  
	  }
	  sc.close();
  }
}