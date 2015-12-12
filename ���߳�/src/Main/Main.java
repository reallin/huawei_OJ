package Main;

	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;

	/*
	 * 
	 */
	public class Main extends Thread{
	    private static String tmp ;
	     private static Lock lock = new ReentrantLock();
	     private static int state =0;
	     static boolean flag;   

	    public static String multiThreadWrite(final int times) {
	            tmp =new String();
	            flag=false;
	         Thread threadA =new Thread()
	         {
	             public void run(){
	                 int count =0;
	                
	                 while(count<times)
	                    {
	                    lock.lock();
	                    if(state%4==0)
	                    {
	                
	                    tmp += "A";
	                    state++;
	                    count++;
	                    }
	                    lock.unlock();
	                    }
	                 
	         }
	         };
	         
	    
	             Thread threadB =new Thread()
	         {
	            
	             public void run(){
	                 int count =0;
	                
	                  while(count<times)
	                    {

	                      
	                    lock.lock();
	                    if(state%4==1)
	                    {
	                        
	                    tmp += "B";
	                    state++;
	                    count++;
	                    }
	                    lock.unlock();
	                    }
	                 
	         }
	         };
	         
	             Thread threadC =new Thread()
	         {
	             public void run(){
	                 int count=0;
	                
	                 while(count<times)
	                    {
	                    lock.lock();
	                    if(state%4==2)
	                    {
	                    tmp += "C";
	                    state++;
	                    count++;
	                    }
	                    lock.unlock();
	                    }
	                 
	         }
	         };
	         
	             Thread threadD =new Thread()
	         {
	            
	             public void run()
	             {
	                 int count =0;
	            
	                    while(count<times)
	                    {
	                    lock.lock();
	                    if(state%4==3)
	                    {
	                    tmp += "D";
	                    state++;
	                    count++;
	                    }
	                    lock.unlock();
	                    }
	                     flag=true;
	            }
	         };
	         
	         threadA.start();
	         threadB.start();
	         threadC.start();
	         threadD.start();
	         while(!flag); //防止main线程在四个线程执行完之前就返回tmp值
	     return tmp; 
	    }
	    public static void main(String[] args){
	    	multiThreadWrite(1000);
	    }
	}
