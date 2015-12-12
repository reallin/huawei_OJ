package Main;
import java.util.Scanner;
public class Main {
public void GetResult(int str){
for(int i = 0 ;i< 20;i++){
	for(int j = 0; j<30;j++){
	  for(int k = 0; k<100; k++){
	   if(k%3 == 0 && (i*5+j*3+k/3) == 100 && (i+j+k) == 100){
	     System.out.println(i+" "+j+" "+k);
	   }
	  }
	}
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int str = sc.nextInt();
	sc.close();
   Main m1 = new Main();
	m1.GetResult(str);
}
}



