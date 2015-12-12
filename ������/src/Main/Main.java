package Main;
import java.util.Arrays;
/**
 * 现有一组砝码，重量互不相等，分别为m1、m2……mn；他们可取的最大数量分别为x1、x2……xn。现在要用这些砝码去称物体的重量，问能称出多少中不同的重量
 * 2
   1
   2     -----   5
   2
   1
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	int num = 0;
    	int count = 0;
    	int temp = 0;
    	int temp1 = 1;
    	int flag = 0;
    	int[] sum =new int[1000];
    	sum[0] = 0;
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();    //输入有几组砝码
    	int[] zhongLiang =new int[a];
    	int[] shuLiang =new int[a];
    	for(int i = 0;i < a;i++){
    		zhongLiang[i] = sc.nextInt();
    		shuLiang[i] = sc.nextInt();    //分别奖数量和重量两组数据存入两个数组中
    	}

    	for(int i = 0;i < a;i++){    //算出部的砝码数量
    		num += shuLiang[i];
    	}
    	int[] arry = new int[num];
    	for(int i = 0;i < a;i++){
    		for(int j = 0;j < shuLiang[i];j++){
    			arry[count] = zhongLiang[i];    //用数组存入所有的砝码值
    			count++;
    		}
    	}
    	//从第一位开始，拄后一位一位加，并比较是否跟之前相加的有相同的，相同就不存入数组，不同存入数组
    	for(int i = 0;i < arry.length ;i++){
    		for(int s = i;s < arry.length;s++){
    			temp = arry[i];
    		for(int j = s+1;j < arry.length;j++){  
    			temp += arry[j];
    		for(int k = 1;k < temp1;k++){  //与存入数组的己有可得重量相比较
    			if(temp == sum[k] ){
    				flag = 1;
    			}
    		}
    		if(flag != 1){    //没有相同的，奖这组复旦存入数组
    			sum[temp1] = temp;
    			temp1++;
    		}
    		flag = 0;
    	}
    		}
    	}
    	System.out.print(temp1+1); //第一项本身也是一个重量，所以加1
    	sc.close();
    }
}
