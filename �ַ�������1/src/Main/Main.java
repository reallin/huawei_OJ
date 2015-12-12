package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		strSort(str);
		sc.close();
	}
	
	public static void strSort(String str){
		char[] chs=str.toCharArray();
		int f=1;
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<chs.length-i;j++){
				if((j+f)<(chs.length)){
					if(chs[j]>='A'&&chs[j]<='Z'){
						if(chs[j+f]>='A'&&chs[j+f]<='Z'){
							if(chs[j]>chs[j+f]){
								char temp=chs[j];
								chs[j]=chs[j+f];
								chs[j+f]=temp;
							}
							f=1;
						}else if(chs[j+f]>='a'&&chs[j+f]<='z'){
							if(chs[j]>chs[j+f]-32){
								char temp=chs[j];
								chs[j]=chs[j+f];
								chs[j+f]=temp;
							}
							f=1;
						}else{
							j=j-1;
							f++;
						}
					}else if(chs[j]>='a'&&chs[j]<='z'){
						if(chs[j+f]>='A'&&chs[j+f]<='Z'){
							if(chs[j]>chs[j+f]+32){
								char temp=chs[j];
								chs[j]=chs[j+f];
								chs[j+f]=temp;
							}
							f=1;
						}else if(chs[j+f]>='a'&&chs[j+f]<='z'){
							if(chs[j]>chs[j+f]){
								char temp=chs[j];
								chs[j]=chs[j+f];
								chs[j+f]=temp;
							}
							f=1;
						}else{
							j=j-1;
							f++;
						}
					}else{
						
					}
				}else{
					j=chs.length-i;
				}
			}
		}
		for(int i=0;i<chs.length;i++){
			System.out.print(chs[i]);
		}
	}
}
