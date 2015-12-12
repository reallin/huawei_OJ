package reference;

class DataWrap
{
	public int a;
	public int b;
}
public class refer {

	public static void swap(DataWrap dp)
	{
		int temp = dp.a;
		dp.a = dp.b ;
		dp.b = temp;
		System.out.println("输出的a值为"+dp.a+"b值为"+dp.b);
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a= 6;
		dw.b=9;
		swap(dw);
		System.out.println("输出傎a为"+dw.a+"b傎为"+dw.b);
		
	}
}
