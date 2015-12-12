package Main;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
 public static void main(String[] args){
	 int flag = 0;
	 int num = 0;
	 int temp = 0;
	 int max = 0;
	 int temp1 = 0;
	 int temp2 = 0;
	 int temp3 = 0;
	 Scanner sc = new Scanner(System.in);
	 int s = sc.nextInt();
	 int s1 = sc.nextInt();
	 ArrayList<Integer> alist = new ArrayList<Integer>(); 
	 for(int i = s;i < s1;i++){
        for(int j = 2;j < s;j++){
        	if(i/j == 0){
        		flag = 1;
        	}
        }
        if(flag == 0){
        	alist.add(i);
        }
        flag = 0;
	 }
	 for(int i = 0;i < alist.size();i++){
		 for(int j = 1;j < alist.size();j++){
			 if(alist.contains(alist.get(i)+j)){
				 num++;
				 temp = i;
				 temp2 = j;
			 }
		 }
		 if(max < num){
			 temp1 = temp;
			 temp3 = temp2;
		 }
	 }
	 for(int i = 0;i < num;i++){
		 if(i != num-1){
	 System.out.print((temp1+temp3*i)+" ");
		 }
		 else if(i == num-1){
			 System.out.print(i);
		 }
	 }
	 sc.close();
 }
}
