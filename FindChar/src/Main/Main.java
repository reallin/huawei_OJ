package Main;

import java.util.Scanner;
public class Main {
public char Find(String str){
	int count = 0;
	char[] arry = str.toCharArray();
	for(int i = 0; i < str.length()-1; i++){
		for(int j = i+1;j < str.length()-1; j++){
			if (arry[i] == arry[j]){
			count++;
			}
			}
		if(count == 0){
			return arry[i+1];
		}
		else{
		count = 0;
		}
		}
	return 'a';
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	Main mi = new Main();
	System.out.print(mi.Find(str));
	sc.close();
}
}

