package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		if(num<=30000&&num>0)
		{
			for(int i=1;i<=num;i++){
				int ge=i%10,shi=(i/10)%10,bai=(i/100)%10,qian=(i/1000)%10;
				if(i%7==0||ge==7||shi==7||bai==7||qian==7){
					count++;
				}
			}
			System.out.print(count);
		}
		
		sc.close();
	}

}