package Main;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] c = str.toCharArray();
    ArrayList<Character> alist = new ArrayList<Character>();
    for (int i = 0; i < c.length; i++) {
		if (!alist.contains(c[i]) && 0<c[i] && c[i]<128) {
			alist.add(c[i]);
		}
}
    System.out.print(alist.size());
    sc.close();
}
}
