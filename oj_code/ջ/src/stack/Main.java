package stack;

public class Main {
	public static void main(String[] args){
		String in = "{a[b](c)}";
		BracketChecker b = new BracketChecker(in);
		System.out.print(b.check());
	}
}
