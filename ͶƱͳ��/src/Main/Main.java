package Main;
/**
 * 输出候选人的名字和得票数量 如
 * 4
   A B C D
   8
   A B C D E F G H
   A : 1
   B : 1
   C : 1
   D : 1
   Invalid : 4
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		int vaild = 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		//int s = Integer.valueOf(sc.nextLine());
		String str = sc.nextLine();
		String[] arry =str.split(" "); 
		int s1 =Integer.valueOf(sc.nextLine());
		String str1 = sc.nextLine();
		String[] arry1 = str1.split(" "); 
		
		 ArrayList<String> alist = new ArrayList<String>();
		 for (int i = 0; i < arry.length; i++) {  //防止输入选举人有重复
		 if (!alist.contains(arry[i])) {
		 alist.add(arry[i]);
		 }
		 }
		 String[] arry3 = new String[alist.size()];
		 for(int i = 0; i < alist.size();i++){
			 arry3[i] = (String)alist.toArray()[i];
		 }
		 
        int[] arry2 = new int[arry.length];
        for(int i = 0;i < s1;i++){  
        	temp = 0;
        	for(int j = 0;j < arry3.length;j++){
        	if(arry1[i].equals(arry3[j])){
        		arry2[j]++;
        		temp = 1;
        	}
        }
        	if(temp == 0){ //计算无效票
        		vaild++;
        	}
        }
        for(int i = 0;i < arry3.length;i++){
        System.out.println(arry3[i]+" : "+arry2[i]);
        }
        System.out.print("Invalid : "+vaild);
        sc.close();
	}
}
