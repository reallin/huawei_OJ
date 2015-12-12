package Main;
/**
 * 计算两个矩阵相乘后生成的新矩阵
 */
import java.util.Scanner;
public class Main {
public void matrix_multiply(int[][] str1,int[][] str2, int x, int y, int z){
	int[][] str3 = new int[x][z];
	String s = "";
	for(int i = 0;i < x;i++){ //矩阵行
		for(int j = 0;j < z;j++){  //矩阵列
			for(int k = 0;k < y;k++){  //对应项相乘
				str3[i][j] += str1[i][k]*str2[k][j];
			}
		}
	}
	for(int i = 0;i < x;i++){
		for(int j = 0;j < z;j++){
			if(j != z-1){
				s =s+str3[i][j]+" ";
			}
			if(j == z-1){    //为了输出行末没有多一个空格
				s = s+str3[i][z-1];
			}
		}
		System.out.print(s);
		s = "";
		System.out.print("\n");
	}
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = Integer.valueOf(sc.nextLine());
	int y = Integer.valueOf(sc.nextLine());
	int z = Integer.valueOf(sc.nextLine());
	String[] str = new String[y];
	String[] str1 = new String[y];
	String[] temp = new String[y];
	String[] temp1 = new String[z];
	int[][] arry1 = new int[x][y];
	int[][] arry2 = new int[y][z];
	for(int i = 0;i < x;i++){   //第一个矩阵输入，按行输入，每行数据用空格分开
	str[i] = sc.nextLine();
	temp = str[i].split(" ");
	for(int j = 0;j < y;j++){
	arry1[i][j] =Integer.valueOf(temp[j]);
	}
	}
	for(int i = 0;i < y;i++){  //第二个矩阵输入
	str1[i] = sc.nextLine();
	temp1 = str1[i].split(" ");
	for(int j = 0;j < z;j++){
	arry2[i][j] =Integer.valueOf(temp1[j]);
	}
	}
	Main m1 = new Main();
	m1.matrix_multiply(arry1,arry2,x,y,z);
	sc.close();
}
}
