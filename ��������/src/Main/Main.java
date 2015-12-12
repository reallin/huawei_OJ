package Main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
        String s = sc.nextLine();
		StringBuffer sb=new StringBuffer();
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++){
		sb.append(new StringBuffer(str[i]).reverse()); //单个单词先反转am变为ma
		if(i!=str.length-1)  sb.append(" "); //单词与单词之间加空格
		}
		sb.reverse();//对整个字符串进行反转。
		System.out.print(sb);
		sc.close();
	    }
		}