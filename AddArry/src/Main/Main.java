package Main;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
  public void CombineBySort(String a1,int a,String b1,int b){
    String c = a1+b1;
    char[] c1 = c.toCharArray();
    Set<Character> set = new HashSet<Character>(); 
    for(int i = 0; i < c.length() ; i++){  
        set.add(c1[i]);  
    }  
    Iterator<Character> in = set.iterator();  
    char[] arrays = new char[set.size()];  
    int num=0;  
    while(in.hasNext()){  
        char in1 = (Character)in.next();  
        arrays[num] = in1;  
        num = num + 1;  
    }  
    Arrays.sort(arrays);
    for(int s = 0; s < arrays.length ; s++){  
        System.out.print(arrays[s]+" "); 
    }
  }
  public static void main(String[] args) throws IOException{
  Scanner sc = new Scanner(System.in);
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String s = sc.next();
  String str = br.readLine();
  String s1 = sc.next();
  String str1 = br.readLine();
  int s2 = Integer.parseInt(s);
  int s3 = Integer.parseInt(s1);
  Main m1 = new Main();
  m1.CombineBySort(str,s2,str1,s3);
  sc.close();
  }
  }