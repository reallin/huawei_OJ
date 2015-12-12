package Main;
/**
 * 统计其中英文字符，空格字符，数字字符，其他字符的个数
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	  int ch = 0,shu = 0,space = 0,other = 0;
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  for(int i = 0;i < str.length();i++){
		  if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
			  ch++;
		  }
		  else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
			  shu++;
		  }
		  else if(str.charAt(i) == ' '){
			  space++;
		  }
		  else{
			  other++;
		  }
	  }
	  System.out.println(ch);
	  System.out.println(space);
	  System.out.println(shu);
	  System.out.print(other);
	  sc.close();
  }
}
