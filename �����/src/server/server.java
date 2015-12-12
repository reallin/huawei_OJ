package server;
import java.net.*;
import java.io.*;
public class server {
public static void main(String[] args) throws Exception{
	ServerSocket ss = new ServerSocket(100);
	
	Socket s = ss.accept();
	OutputStream out = s.getOutputStream();
	PrintStream ps = new PrintStream(out,true);
	ps.print("<font size=7 color=green>×¢²á³É¹¦<font>");
	System.out.println("Hello world");
	s.close();
	ss.close();
}
}
