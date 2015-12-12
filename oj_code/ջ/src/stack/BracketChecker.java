package stack;

public class BracketChecker {
	private String in;
	public BracketChecker(String in ){
		this.in = in;
		
	}
	public String check(){
		int max = in.length();
		StackX stack = new StackX(max);
		for(int i =0;i < in.length();i++){
			char ch = in.charAt(i);
			switch(ch){
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				char chx = stack.pop();
				if(!stack.isEmpty()){
				if((chx!='{'&&ch=='}')||(chx!='['&&ch==']')||(chx!='('&&ch==')')){
					return "error"+ch+"at"+i;
				}else{
					return "success";
				}
				}else{
					return "error is empty";
				}
			}
			
		}
		
		if(!stack.isEmpty()){
			//执行到此，如果有对应的符号，应该全部弹出，若不为空，说明左边符号没有相应的右边的符号
			//System.out.println("Error: missing right bracket.");
			return "Error: missing right bracket.";
		}
		return "";
	}
}
