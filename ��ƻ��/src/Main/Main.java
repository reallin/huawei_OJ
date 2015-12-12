package Main;
import java.util.Scanner;
public class Main {
	public static int fun(int m,int n)  //m个苹果放在n个盘子中共有几种方法
	{
     if(m==0||n==1)  //因为我们总是让m>=n来求解的，所以m-n>=0,所以让m=0时候结束，如果改为m=1，
	        return 1;    //则可能出现m-n=0的情况从而不能得到正确解    
     if(n>m)
	         return fun(m,m);
	    else
         return fun(m,n-1)+fun(m-n,n);
	 }
	 
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 System.out.print(fun(m,n));
		 sc.close();
		 
	 }
	 {

 }
}
