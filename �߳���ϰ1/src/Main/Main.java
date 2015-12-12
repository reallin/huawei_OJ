package Main;

import java.util.Scanner;

public class Main {
 public static void main(String[] args){
	 int ticket = 0;
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 threadtext t = new threadtext();
	 threadtext1 t1 = new threadtext1();
	 threadtext2 t2 = new threadtext2();
	 threadtext3 t3 = new threadtext3();
	 while(ticket < n){
	 new Thread(t).start();
	 new Thread(t1).start();
	 new Thread(t2).start();
	 new Thread(t3).start();
	 ticket++;
	 }
 }
}
 class threadtext implements Runnable{
	 public void run(){
	 System.out.print("A");
	 }
 }
	 class threadtext1 implements Runnable{
		 public void run(){
		 System.out.print("B");
		 }
}
	 class threadtext2 implements Runnable{
		 public void run(){
		 System.out.print("C");
		 }
}
	 class threadtext3 implements Runnable{
		 public void run(){
		 System.out.print("D");
		 }
}