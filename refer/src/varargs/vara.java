package varargs;

public class vara {
	public void test(String...books)
	{
		for(String book:books)
		{
		System.out.println(book);
		}
		
	}
	public static void main(String[] args)
	{
		vara v = new vara();
		v.test("ÃùÈË","×ôÖú");
		
	}
}
