package Main;
import java.util.Scanner;
public class Main {
 public boolean	boolIsAllCharExist(String pShortString,String pLongString){
	 int count = 0;
   char[] arry1 = pShortString.toCharArray();
   char[] arry2 = pLongString.toCharArray();
   for(int i = 0;i < pShortString.length();i++){
     for(int j = 0; j < pLongString.length(); j++){
       if(arry1[i] == arry2[j]){
       count++;
       break;
       }
       }
     }
   if(count == pShortString.length()){
    return true;
   }
   else{
   return false;
   }
   }
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String str1 = sc.nextLine();
   String str2 = sc.nextLine();
   sc.close();
   Main mi = new Main();
   System.out.print(mi.boolIsAllCharExist(str1,str2));
 }
 }
 
 

