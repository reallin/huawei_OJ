package Main;


	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			sc.close();
			 System.out.print(MarkNum(str));
		}
		 public static String MarkNum(String pInStr)
		 {
			 String pOutStr=pInStr.replaceAll("(\\d+)", "*$1*");
				return pOutStr;
		  
		 }
	}

