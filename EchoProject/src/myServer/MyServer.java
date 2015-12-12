package myServer;


import java.io.IOException;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer {
	public static void main(String[] args){
		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();  //接收客户端请求
			OutputStream out = client.getOutputStream();
			//BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//StringBuilder sb = new StringBuilder();
			//sb.append("Android:");
			//sb.append(buf.readLine());
			out.write("圣诞节快乐".getBytes("UTF-8"));
			out.close();
			//buf.close();
			client.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
