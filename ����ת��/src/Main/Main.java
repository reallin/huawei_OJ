package Main;

public class Main {
	public int pos;
	public static int temp = 0;
public static String trans(int num,int base,int arr)
{
	StringBuilder sb = new StringBuilder();
	temp = num & (base - 1);
	while(num != 0)
	{
		sb.append(temp);
	}
	num = num >> arr;
	return sb.toString();
}
public static void main(String[] args)
{
	System.out.print(trans(6,2,1));
}
}

