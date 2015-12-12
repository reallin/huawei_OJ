package Main;
/*
 * 对于不同的字符串，我们希望能有办法判断相似程度，我们定义了一套操作方法来把两个不相同的字符串变得相同，具体的操作方法如下：
1 修改一个字符，如把“a”替换为“b”。
2 增加一个字符，如把“abdd”变为“aebdd”。
3 删除一个字符，如把“travelling”变为“traveling”。
比如，对于“abcdefg”和“abcdef”两个字符串来说，我们认为可以通过增加和减少一个“g”的方式来达到目的。上面的两种方案，都只需要一次操作。把这个操作所需要的次数定义为两个字符串的距离，而相似度等于“距离＋1”的倒数。也就是说，“abcdefg”和“abcdef”的距离为1，相似度为1/2=0.5.
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 =sc.nextLine();
	String s2=sc.nextLine();
	int i = CalculateStringDistance(s1,0,s1.length()-1,s2,0,s2.length()-1)+1;//相似度
	System.out.print("1/"+i);
}
public static int CalculateStringDistance(String strA, int pABegin, int pAEnd,    
		   String strB, int pBBegin, int pBEnd)     
		{    
		     if(pABegin > pAEnd)    
		     {    
		          if(pBBegin > pBEnd)    
		               return 0;     
		          else    
		     
		               return (pBEnd - pBBegin + 1);    
		     }    
		    
		     if(pBBegin > pBEnd)    
		     {    
		          if(pABegin > pAEnd)    
		               return 0;    
		          else    
		               return pAEnd - pABegin + 1;    
		     }    
		    
		     if(strA.charAt(pABegin) == strB.charAt(pBBegin))    
		     {    
		          return CalculateStringDistance(strA, pABegin + 1, pAEnd,    
		            strB, pBBegin + 1, pBEnd);    
		     }    
		     else    
		     {    
		          int t1 = CalculateStringDistance(strA, pABegin, pAEnd, strB,     
		            pBBegin + 1, pBEnd);    
		          int t2 = CalculateStringDistance(strA, pABegin + 1, pAEnd,     
		            strB,pBBegin, pBEnd);    
		          int t3 = CalculateStringDistance(strA, pABegin + 1, pAEnd,    
		            strB,pBBegin + 1, pBEnd);    
		          return min(t1,t2,t3) + 1;    
		     }    
		} 
public static int min(int a,int b,int c){
	int s = Math.min(a, b);
	int k = Math.min(s, c);
	return k;
}
}