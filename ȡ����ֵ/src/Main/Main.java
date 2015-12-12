package Main;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int n;
Scanner sc =new Scanner(System.in);
float str = sc.nextFloat();
if(str >= 0){
	n = (int) (str+0.5);
}
else
  n = (int) (str-0.5);
System.out.print(n);
sc.close();
}
}
