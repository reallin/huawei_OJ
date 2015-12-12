package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		int bi = 0;
		int mi = 0;
		int th = 0;
		if(num/1000000000 > 0){
			sb.append(readNum((int)(num/1000000000),0)+" billion");
			bi = 1;
		}if(num/1000000 > 0){
			if(num%1000000000/1000000 != 0)
			sb.append(readNum((int)(num%1000000000/1000000),bi)+" million");
			mi = 1;
			
		}if(num/1000 > 0){
			if(num%1000000/1000 != 0)
			sb.append(readNum((int)(num%1000000/1000),mi)+" thousand");
			th = 1;
			
		}
		sb.append(readNum((int)(num%1000),th));
		String str = sb.toString().trim();
		System.out.print(str);
		sc.close();
	}
	public static String readNum(int i,int j){
		String str = "";
		if(i>=1000||i<0){
			return "";
		}
		else{
			int bai = i/100;
			int shi = i%100/10;
			int ge = i%10;
			str = readShi(ge,shi,bai,j);
		}
		return str;
	}	
	public static String readShi(int ge,int shi,int bai,int th){
		StringBuilder sb = new StringBuilder();
		String str = ""; 
		switch(bai){
		case 1:sb.append(" one hundred");break;
		case 2:sb.append(" two hundred");break;
		case 3:sb.append(" three hundred");break;
		case 4:sb.append(" four hundred");break;
		case 5:sb.append(" five hundred");break;
		case 6:sb.append(" six hundred");break;
		case 7:sb.append(" seven hundred");break;
		case 8:sb.append(" eight hundred");break;
		case 9:sb.append(" night hundred");break;
	case 0:break;
		}
		if(th!=0&&(ge!=0||shi!=0)){
			sb.append(" and");
		}else if(bai!=0&&(ge!=0||shi!=0)){
			sb.append(" and");
		}
		switch(shi){
		case 1:
			switch(ge){
			case 1:sb.append(" eleven");break;
			case 2:sb.append(" twelve");break;
			case 3:sb.append(" thirteen");break;
			case 4:sb.append(" fourteen");break;
			case 5:sb.append(" fifteen");break;
			case 6:sb.append(" sixteen");break;
			case 7:sb.append(" seventeen");break;
			case 8:sb.append(" eighteen");break;
			case 9:sb.append(" nineteen");break;
			case 0:sb.append(" ten");
			break;
			}break;
		case 2:sb.append(" twenty");break;
		case 3:sb.append(" thirdty");break;
		case 4:sb.append(" forty");break;
		case 5:sb.append(" fifty");break;
		case 6:sb.append(" sixty");break;
		case 7:sb.append(" seventy");break;
		case 8:sb.append(" eightty");break;
		case 9:sb.append(" ninety");break;
		case 0:if(bai!=0&&ge!=0)sb.append(" and");
		break;
		
		}if(shi!=1&&readGe(ge)!="zero")
		sb.append(readGe(ge));
		return sb.toString();
	}
	public static String readGe(int a){
		String str = "";
		switch(a){
		case 1:str = " one";break;
		case 2:str = " two";break;
		case 3:str = " three";break;
		case 4:str = " four";break;
		case 5:str = " five";break;
		case 6:str = " six";break;
		case 7:str = " seven";break;
		case 8:str = " eight";break;
		case 9:str = " night";break;
		case 0:str = "zero";break;
		}
		return str;
	}
}
