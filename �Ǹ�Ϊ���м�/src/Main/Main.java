package Main;

import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	String str = "";
	int count = 0;
	int num = 0;
	double sum = 0.0;
	double ping = 0.0;
	Scanner sc = new Scanner(System.in);
	//int s = Integer.valueOf(sc.nextLine());
	int[] array = new int[1000];
	while(sc.hasNext()){
		array[count] = sc.nextInt();
		if(array[count] < 0){
			num++;
		}
		if(array[count] >= 0){
			sum += array[count];
		}
		count++;
		if(count - num > 0 ){
		ping = sum/(count-num);
		NumberFormat ddf1=NumberFormat.getNumberInstance() ; 
		ddf1.setMaximumFractionDigits(1); 
		str = ddf1.format(ping); 
		
	}
		else if(count == num){
			str = "0.0";
		}
		System.out.println(num);
		System.out.println(str);
	}
	
	sc.close();
}
}