package stack;

public class StackX {
	char[] stackArray;
	int pop;
	int maxSize;
	public StackX(int s){
		maxSize=s;
		stackArray=new char[maxSize];
		pop=-1;
	}
	public void push(char top){
		this.stackArray[++pop] = top;
	}
	public char pop(){
		return this.stackArray[pop--];
	}
	public char peek(){
		return this.stackArray[pop];
	}
	public boolean isEmpty(){
		return pop == -1;
	}
	public boolean isFull(){
		return pop == maxSize-1;
	}
}
