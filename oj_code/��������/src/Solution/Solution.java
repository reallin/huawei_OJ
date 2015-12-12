package Solution;

import java.util.LinkedList;

public class Solution {
	public int evalRPN(String[] tokens) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+") | tokens[i].equals("-")
					| tokens[i].equals("*") | tokens[i].equals("/")) {
				int num2 = stack.pop();
				int num1 = stack.pop();
				int result = cal(num1,num2,tokens[i]);
				stack.push(result);
			}else{
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		return stack.pop();
	}
	public int cal(int i,int j,String str){
		int result = 0;
		switch(str){
		case "+":result = i+j;break;
		case "=":result = i-j;break;
		case "*":result= i*j;break;
		case "/":result = i/j;break;
		}
		return result;
	}
}
