package Main;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
   String[] str = new String[1000];
	Scanner sc = new Scanner(System.in); 
	int num =Integer.parseInt(sc.nextLine());
	ArrayList<String> alist = new ArrayList<String>();
	for(int i = 0;i < num; i++){
	  str[i] = sc.nextLine();
	  for(int j = 0;j < str[i].length();j++){
		  if((j+1)%8 == 0){
			  alist.add(str[i].substring(j-7,j+1));
		  }
	  }
	  if(str[i].length()%8 != 0){
		  alist.add((str[i].substring((str[i].length()/8)*8,str[i].length())+"00000000").substring(0,8));
	  }
	  }
	ListIterator lit = alist.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
		sc.close();
	}	
}

