package ThreadDemo;
public class ThreadDemo {
	 public static void main(String[] args){
		 threadtext tt = new threadtext();
		 new Thread(tt).start();
		 new Thread(tt).start();
		 new Thread(tt).start();

	 }
		
}
 class threadtext implements Runnable {
	 int ticket = 100;
	 public void run(){
	 while(true){
		 if(ticket > 0)
	 System.out.println(Thread.currentThread().getName()+"Æ±Êı¶àÉÙ"+ticket--);
	 }
	 }
}