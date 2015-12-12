package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String IP=sc.nextLine();
		if(IP.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")){ //表示如同10.138.15.1格式
			String[] temp=IP.split("\\.");
			int a1=Integer.parseInt(temp[0]);
			int a2=Integer.parseInt(temp[1]);
			int a3=Integer.parseInt(temp[2]);
			int a4=Integer.parseInt(temp[3]);
			if(a1>=0&&a1<=255&&a2>=0&&a2<=255&&a3>=0&&a3<=255&&a4>=0&&a4<=255){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}else{
			System.out.print("NO");
		}
		sc.close();
	}
}