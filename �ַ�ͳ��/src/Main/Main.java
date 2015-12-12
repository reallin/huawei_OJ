package Main;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
	public static void main(String[] args){
		int num = 1;
		int temp = 0;
		int temp1;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 ArrayList<String> alist = new ArrayList<String>();
		 ArrayList<Integer> alist1 = new ArrayList<Integer>();
	    int[] arry1 = new int[str.length()];
	    int[] arry2 = new int[str.length()];
	    
		char[] arry = str.toCharArray();
		Arrays.sort(arry);
	/*	for(int i = 0;i < str.length();i++){
			temp = 0;
			for(int j = i+1;j < str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					num++;
					temp++;
				}
			}*/
		for(int i = 0 ;i < str.length();i+=(temp+1)){
			temp = 0;
			for(int j = i+1 ; j < str.length();j++){
				if(arry[i] == arry[j]){
					num++;
					temp++;
				}
			}
			arry1[count] = num;
			arry2[count] = i;
		   count++;
			num = 1;	
		}
		int[] arry3 = new int[count];
		for(int i = 0;i < count ;i++){
			arry3[i] = arry1[i];
		}
		for (int i = 0; i < count; i++) {
			if (!alist.contains(arry1[i])) {
			alist1.add(arry1[i]);
			}
			}
		Object[] array1=alist.toArray();
		 System.out.print(Arrays.toString(arry3));
		Arrays.sort(array1);
		System.out.print(Arrays.toString(array1));
		/*for(int i = count;i>0;i--){
			for(int k = 0;k < str.length();k+=(temp1+1)){
				temp1 = 0;
				for(int j = i+1;j < str.length();j++){
					if(arry[k] == arry[j]){
						num++;
						temp1++;
					}
				}
			if (arry1[i] == num){
				alist.add(String.valueOf(arry[k]));
			}
			num = 0;
		}
}*/
		for(int i = str.length()-1;i > str.length()-count-1;i--){
			for(int j = 0;j < count;j++)
			if(arry1[i] == arry3[j]){
				alist.add(String.valueOf(str.charAt(arry2[j])));
			}
		}
		 ListIterator lit = alist.listIterator();  
		    while(lit.hasNext())  
		    {  
		       System.out.print(lit.next());  
		    }  	
		    sc.close();
}
}

