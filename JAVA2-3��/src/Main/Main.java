package Main;
/**
 * 计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，总共有多少种走法，
 * 要求能往右和往下走，不能往左和往上走
 */
import java.util.Scanner;

public class Main {
	public int count(int m,int n)
	{	
	if((m==1 && n==0) || (m==0 && n==1))
	return 1;
	if(m>0 && n>0)
	return count(m-1,n)+ count(m,n-1);	//递规计算
	if(m==0)  //只有一列情况
	return count(m,n-1);
	if(n==0)
	return count(m-1,n);
	return 0;
	}
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 Main mi = new Main();
	 System.out.print(mi.count(m,n));
	 sc.close();
	}
}

