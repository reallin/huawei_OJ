package Main;

import java.util.Scanner;

public class Main {
	public boolean FindChar(String str,char c){
		int count = 0;
		char[] arry = str.toCharArray();
		for(int i = 0; i < str.length()-1; i++){
			//for(int j = i+1;j < str.length()-1; j++){
				if (arry[i] == c){
				count++;
				}
				}
			if(count == 1){
				return true;
			}
			else{
		return false;
			}
			}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arry = str.toCharArray();
		Main mi = new Main();
		for(int i = 0;i < str.length();i++){
			if(mi.FindChar(str,arry[i])==true){
			System.out.print(arry[i]);
			return;
			}
		}
		sc.close();
		System.out.print('.');
		}
	}

