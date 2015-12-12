package RuntimeDemo;

public class RuntimeDemo {
    public static void main(String[] args) throws Exception
    {
    	Runtime a = Runtime.getRuntime(); //µ¥ÀýÉè¼Æ
    	Process r = a.exec("notepad");
    	Thread.sleep(4000);
    	r.destroy();
    }
}
