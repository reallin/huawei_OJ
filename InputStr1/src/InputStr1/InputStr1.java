package InputStr1;
import java.util.Scanner;
public class InputStr1 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			
			if(str.length()<=100){
				char[] temp=str.toCharArray();
				for(int i=temp.length-1;i>=0;i--)
				{
					System.out.print(temp[i]);
				}	
			}
			sc.close();
		}

	}

