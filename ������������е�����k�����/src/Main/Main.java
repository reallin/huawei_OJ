package Main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
public static void main(String[] args){
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int s =Integer.valueOf(sc.nextLine());
	//int[] arry =new int[s];
	for(int i = 0;i < s;i++){
		arraylist.add(sc.nextInt());
	}
	int s1 = sc.nextInt();
	System.out.print(arraylist.get(arraylist.size()-1-s1));
	sc.close();
}
}
