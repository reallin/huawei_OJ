package Main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> com = new Vector<String>();
		Vector<String> exe = new Vector<String>();
		com.add("reset");
		com.add("reset board");
		com.add("board add");
		com.add("board delet");
		com.add("reboot backplane");
		com.add("backplane abort");
		
		exe.add("reset what");
		exe.add("board fault");
		exe.add("where to add");
		exe.add("no board at all");
		exe.add("impossible");
		exe.add("install first");
		
		while(sc.hasNext())
		{
			String str = sc.nextLine();
			int count =0;
			int weizhi = 0;
			if(str.matches("[a-z]+\\ [a-z]+"))
			{
				String left = str.split(" ")[0];
				String right = str.split(" ")[1];
				for(int i=1;i<=5;i++)
				{
					if(com.get(i).startsWith(left))
					{
						String comRight = com.get(i).split("\\ ")[1];
						if(comRight.startsWith(right))
						{
							count++;
							weizhi = i;
						}
							
					}
				}
				if(count == 1) 
				{
					System.out.println(exe.get(weizhi));
					count = 0;
				}else {
					System.out.println("unkown command");
					count = 0;
				}
				
				
			}
			else if(str.matches("[a-z]+"))
			{
				if(com.get(0).startsWith(str))
				{
					System.out.println("reset what");
				}else {
					System.out.println("unkown command");
				}
			}
			else {
				System.out.println("unkown command");
			}
		}
      sc.close();
	}

}