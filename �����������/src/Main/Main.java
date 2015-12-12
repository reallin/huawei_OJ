package Main;

import java.math.BigInteger;//利用BigInteger中的add方法。求两具超长数str与str1的和
import java.util.Scanner;

public class Main {
	public String AddLongInteger(String addend, String augend) {
		BigInteger a = new BigInteger(addend);
		BigInteger b = new BigInteger(augend);
		BigInteger c = a.add(b);
		return (String.valueOf(c));// 将BigInteger转为字符串返回
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();// 传入字符串
		Main mi = new Main();
		System.out.print(mi.AddLongInteger(str, str1));
		sc.close();
	}
}
