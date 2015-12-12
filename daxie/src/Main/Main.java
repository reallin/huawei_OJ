package Main;
import java.util.Scanner;
public class Main {
	public int CalcCapital(String str){
		int count = 0;
		if(str == null){
			return 0;
		}
		else{
			char[] arry = str.toCharArray();
		for(int i = 0 ;i < str.length();i++){
			if(arry[i]>=65&&arry[i]<=90){
			count++;
			}
			}
		}
			return count;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Main mi = new Main();
		System.out.print(mi.CalcCapital(str));
		sc.close();
	}
}
