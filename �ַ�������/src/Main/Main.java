package Main;
/**
 * 字符串排序，字母不分大小写，排序前的靠前，只排字母，其它字符不排如
 * A Famous Saying: Much Ado About Nothing(2012/8)
   A aaAAbc dFgghh: iiMm Nnn ooooS sttuuuy(2012/8)
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		char temp;
		Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();
        char arry[] = str.toCharArray();
        for(int i = 0;i < str.length();i++){
        	for(int j = i+1;j < str.length();j++){
        		if(arry[i]>='a' && arry[i] <= 'z'){  //判断前面的数是否是小写字母
        			if( arry[j] >='a'&& arry[j] <= 'z'){  //后面与之比较低的是否是小写字母
        			if((arry[i]-32)>(arry[j]-32)){   //小写字母比较时要减去32，把它当作大写字母进行比较
        				temp = arry[i];
        				arry[i] = arry[j];
        				arry[j] = temp;
        			}
        			}
        			else if(arry[j]>='A' && arry[j] <= 'Z'){  //后面字母为大写字母情况
        				if((arry[i]-32)>(arry[j])){
            				temp = arry[i];
            				arry[i] = arry[j];
            				arry[j] = temp;
        			}
        			}
        		}
        			if(arry[i]>='A' && arry[i] <= 'Z'){  //前面字母小大写字母情况
        				if( arry[j] >='a'&& arry[j] <= 'z'){    //与之比较的字母为小定情况
                			if((arry[i])>(arry[j]-32)){
                				temp = arry[i];
                				arry[i] = arry[j];
                				arry[j] = temp;
                				}
        				}
        				else if(arry[j]>='A' && arry[j] <= 'Z'){ //与之比较的字母为大定情况
            				if((arry[i])>(arry[j])){
                				temp = arry[i];
                				arry[i] = arry[j];
                				arry[j] = temp;
            			}
            			}
        			}
        		}
        	}
        System.out.print(String.valueOf(arry));
        sc.close();
	}
	}

       

