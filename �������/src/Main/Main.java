package Main;

/**
 * 密码验证合格程序 
 * 长度超过8位
 * 包括大小写字母.数字.其它符号,以上四种至少三种
 * 不能有相同长度超2的子串重复
 */
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	int count = 0;
	int flag = 0,flag1 = 0, flag2 = 0,flag3 = 0;
	int temp = 0, temp1 = 0, temp2 =0;
	String[] arry = new String[1000];
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){  //有下一行就输入
		temp = 0;
		temp1 = 0;
		temp2 = 0;
		flag = 0;
		flag1 = 0;
		flag2 = 0;
		flag3 = 0;
		arry[count] = sc.nextLine();
		if(arry[count].length() <= 2){
			break;
		}
		if(arry[count].length() <= 8){   //字符少于8个的情况
			temp = 1;
		}
		else{
			for(int i = 0;i < arry[count].length();i++){
				if(arry[count].charAt(i)>='A'&&arry[count].charAt(i)<='Z'){
					flag = 1;
				}
				else if(arry[count].charAt(i)>='a'&&arry[count].charAt(i)<='z'){
					flag1 = 1;
				}
				else if(arry[count].charAt(i)>='0'&&arry[count].charAt(i)<='9'){
					flag2 = 1;
				}
				else
					flag3 = 1;
			}
			if(flag1 + flag2 +flag3 + flag < 3){   //计算如果少于三种字符情况
				temp1 = 1;
			}
			for(int i = 0;i < arry[count].length()-2;i++){    //计算邻三个字符是否相等。
				for(int j = i+1;j < arry[count].length()-2;j++){
					if(arry[count].substring(i,i+2).equals(arry[count].substring(j,j+2))){
						temp2 = 1;
					}
				}
			}
		}
		if(temp == 0&&temp1 == 0&&temp2 == 0){
			System.out.print("OK");
		}
		else{
			System.out.print("NG");
		}
		count++;
	}
	sc.close();
}
}


