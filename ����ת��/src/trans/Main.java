package trans;

public class Main {
	public int pos;
	public static int temp = 0;
public static String trans(int num,int base,int arr)
{
	StringBuilder sb = new StringBuilder();
	
	//System.out.print(String.valueOf(temp));
	while(num != 0)
	{
		temp = num & (base - 1);
		sb.append(String.valueOf(temp));
		num = num >> arr;
	}
	String a = sb.toString();
	//System.out.print(sb);
	return a;
}
public static void main(String[] args)
{
	System.out.print(trans(7,2,1));
	//trans(7,8,3);
}
}
