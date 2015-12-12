package Main;
/**
 * 输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
      都按先录入排列在前的规则处理。
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int s = Integer.valueOf(sc.nextLine());
	int s1 = Integer.valueOf(sc.nextLine());
	String[][] arry = new String[s][2];
	String[] temp = new String[2];
	for(int i = 0;i < s;i++){
		String str = sc.nextLine();
		arry[i] = str.split(" ");
	}
	for(int i = 0;i < s;i++){
		for(int j = i+1;j < s;j++){
			if(Integer.valueOf(arry[i][1]) > Integer.valueOf(arry[j][1])){
				temp[0] = arry[i][0];
				temp[1] = arry[i][1];
				arry[i][0] = arry[j][0];
				arry[i][1] = arry[j][1];
				arry[j][0] = temp[0];
				arry[j][1] = temp[1];
			}
		}
	}
   if(s1 == 1){  //表示升序
	   for(int i = 0;i < s;i++){
		   System.out.println(arry[i][0]+" "+arry[i][1]);
	   }
   }
   if(s1 == 0){ //表示降序
	   for(int i = s-1;i >= 0;i--){
		   System.out.println(arry[i][0]+" "+arry[i][1]);
	   }
   }
	sc.close();
}
}
