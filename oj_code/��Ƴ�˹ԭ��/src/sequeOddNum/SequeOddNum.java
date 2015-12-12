package sequeOddNum;

import java.util.Scanner;

public class SequeOddNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		 StringBuilder sb = new StringBuilder();
	     if(m < 0||m > 100){
	    	 return;
	     }else{
	    	 int l = m*m;
	    		 for(int i = 0;i < m;i++){
	    			 if(i!=m-1)
	    			 sb.append(l-m+2*i+1).append("+");
	    			 else{
	    				 sb.append(l-m+2*i+1);
	    			 }
	    	 }	   
	     }
		System.out.print(sb.toString());
	}
	 /*public String GetSequeOddNum(int m)
	 {
		 StringBuilder sb = new StringBuilder();
	     if(m < 0||m > 100){
	    	 return "error";
	     }else{
	    	 int l = m*m;
	    		 for(int i = 0;i < m;i++){
	    			 if(i!=m-1)
	    			 sb.append(l-m+2*i+1).append("+");
	    			 else{
	    				 sb.append(l-m+2*i+1);
	    			 }
	    	 }
	     return sb.toString();
	     }
	 }*/
}
