package Main;

import java.util.Scanner;

public class Main {
	public static String subParse1(long num){
		Integer i = (int) num;
		
		String[] str0to19 = new String[]{
				"zero","one","two","three","four","five",
		        "six","seven","eight","nine","ten",
		        "eleven","twelve","thirteen","fourteen","fifteen",
		        "sixteen","seventeen","eighteen","nineteen"
		        };
		String[] str20to90 = new String[]{
				"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"	
				};
		StringBuffer result = new StringBuffer();
		if(i >= 100){
			result.append(str0to19[i/100]);
			result.append(" hundred");
			if(i / 100 > 1){
				result.append("s");
        	}
			i = i % 100;
		}
		
		if(i >= 20){
			if(!result.toString().equals("")){
				result.append(" and ");
			}
			result.append(str20to90[i/10 - 2]);
			if(i % 10 != 0){
				result.append(" " + str0to19[i % 10]);
			}
		}else if(i > 0){
			if(!result.toString().equals("")){
				result.append(" and ");
			}
			result.append(str0to19[i]);
		}
		return result.toString().trim();
	}
	public static String parse(long num) {
        if(num >= 10000000000L || num  < 0L){
        	return "error";
        }
        StringBuffer sb = new StringBuffer();
        if(num >= 1000000000L){
        	sb.append(subParse1(num / 1000000000L));       	
        	sb.append(" billion");
        	if(num / 1000000000L > 1){
        		sb.append("s");
        	}
        	num = num % 1000000000L;
        }
        if(num >= 1000000L){
        	if(!sb.toString().equals("")){
        		sb.append(" ");
        	}
        	sb.append(subParse1(num / 1000000L));
        	sb.append(" million");
        	if(num / 1000000L > 1){
        		sb.append("s");
        	}
        	num = num % 1000000L;
        }
        if(num >= 1000L){
        	if(!sb.toString().equals("")){
        		sb.append(" ");
        	}
        	sb.append(subParse1(num / 1000L));
        	sb.append(" thousand");
        	if(num / 1000L > 1){
        		sb.append("s");
        	}
        	num = num % 1000L;
        }
        if(num > 0){
        	if(!sb.toString().equals("")){
        		sb.append(" ");
        	}
        	sb.append(subParse1(num));
        }else{
        	if(sb.toString().equals("")){
        		sb.append("zero");
        	}
        }
    	return sb.toString().trim();
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long str = sc.nextLong();
	System.out.print(parse(str));
	sc.close();
	
}
}
