package Main;
/**
 * 一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 
 * 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高
 */
import java.util.Scanner;

public class Main {
	public static double getJourney(double high)
    {
		double d = high*2+high/2+high/4+high/8;
        return d;
    }
	   public static double getTenthHigh(double high)
	    {
		   double d = high/32;
	        return d;
	    }
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   double s = sc.nextDouble();
		   System.out.println(getJourney(s));
		   System.out.print(getTenthHigh(s));
		   sc.close();
	   }
}
