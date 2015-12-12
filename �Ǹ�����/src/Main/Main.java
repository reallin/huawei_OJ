package Main;


import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
public static void main(String[] args){
	int num = 0;
	double sum = 0.0;
	double ping = 0.0;
	Scanner sc = new Scanner(System.in);
	int s = Integer.valueOf(sc.nextLine());
	int[] array = new int[1000];
	for(int i = 0;i < s;i++){
		array[i] = sc.nextInt();
		if(array[i] < 0){
			num++;
		}
		if(array[i] >= 0){
			sum += array[i];
		}
	}
	ping = sum/(s-num);
	NumberFormat ddf1=NumberFormat.getNumberInstance() ; 
	ddf1.setMaximumFractionDigits(1); 
	String str = ddf1.format(ping); 
	System.out.print(num+" "+str);
	sc.close();
}
}
