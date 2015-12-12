package lianxi1;

public class lianxi1 {

	public lianxi1(){
		new lianxi1("A");
	}
	public lianxi1(String s){
		System.out.println("参数为"+s);
		new lianxi1("b","c");
	}
	public lianxi1(String s,String ss){
		System.out.println("第一个为"+s+"第二个为"+ss);
	}
	public static void main(String args[]){
		new lianxi1();
	}
}