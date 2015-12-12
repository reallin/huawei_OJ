package Main;
/**
 * 如果统计的个数相同，则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
    输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
    按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
    aadddccddc-----dca
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ss = str.toCharArray();
		int[] num = new int[ss.length];
		int[] weizhi = new int[ss.length];
		int count = 0;	
		for(int i=0;i<ss.length;i++)
		{
			if((ss[i]>='A'&&ss[i]<='Z')||(ss[i]>='a'&&ss[i]<='z')||(ss[i]>='0'&&ss[i]<='9')||(ss[i]==' '))
			{
				for(int j=0;j<ss.length;j++)
				{
					if(ss[i] == ss[j])
						count++;
				}

				num[i] = count;   //计算第个字符数量
				weizhi[i] = i;   //记录下字录的位置
				count=0;
			}
			else{
				continue;
			}
		}
//		System.out.print(ss.length+" "+num.length);
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])       //对字符数量数组进行排序大的在前
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					char xx = ss[i];
					ss[i] = ss[j];
					ss[j] = xx;
				}else if(num[i] == num[j])    //相同数量的比较ASII
				{
					if(ss[i]>ss[j])
					{
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
						char xx = ss[i];
						ss[i] = ss[j];
						ss[j] = xx;
					}
				}
			}
		}
		ArrayList<Character> countlist = new ArrayList<Character>();
		for(int i=0;i<num.length;i++) 
		{
			if(!countlist.contains(ss[i]))
			{
				countlist.add(ss[i]);   //按顺序装入
			}
		}
		for(int i=0;i<countlist.size();i++)
		{
			System.out.print(countlist.get(i));
		}
		sc.close();

}  
}

