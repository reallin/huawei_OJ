package InputStr;
import java.util.Scanner;
public class InputStr {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] temp = str.toCharArray();
    	for(int i = 0;i < str.length();i++)
    	{
    		System.out.print(temp[str.length()-i-1]);
    	}
    sc.close();
}
}
