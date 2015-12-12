package Main;
/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
   String[] str = new String[1000];
	Scanner sc = new Scanner(System.in); 
	ArrayList<String> alist = new ArrayList<String>();
	for(int i = 0;i < 2; i++){
	  str[i] = sc.nextLine();
	  for(int j = 0;j < str[i].length();j++){
		  if((j+1)%8 == 0){
			  alist.add(str[i].substring(j-7,j+1));
		  }
	  }
	  if(str[i].length()%8 != 0){
		  alist.add((str[i].substring((str[i].length()/8)*8,str[i].length())+"00000000").substring(0,8));
	  }
	  }
	ListIterator lit = alist.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
		sc.close();
	}	
}