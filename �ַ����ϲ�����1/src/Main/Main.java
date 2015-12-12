package Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
	public void ProcessString(String str1,String str2)
	{
		String str3 = str1+str2;
		char[] arry = str3.toCharArray();
		int[] ca = new int[1000];
		ArrayList<Integer> alist = new ArrayList<Integer>();
		Arrays.sort(arry);
		System.out.print(Arrays.toString(arry));
		for(int i = 0;i < arry.length;i++){
			int temp = arry[i];
			while(temp>1){
			if(temp%2 == 0){
				alist.add(0);
			}
			else{
				alist.add(1);
			}	
			temp = temp/2;
			}
			for(int j = alist.size()-1;j >= 0;j--){
				ca[i] = alist.get(j);
				ca[i] += alist.get(j-1)*(alist.size()-j)*2;
			}
			System.out.print(ca[i]);
			alist.clear();
			/*	if(ca[i]>='a'&&ca[i]<='z'){
				System.out.print(ca[i]-0x32);
			}*/
				/*else{
					System.out.print(ca[i]);
		}	*/
	}
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arry1 = str.split(" ");
		Main m1 = new Main();
		m1.ProcessString(arry1[0], arry1[1]);
		sc.close();
	}
}
