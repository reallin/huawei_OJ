package graph;

public class Stack {
	public int[] stack;
	public int mSize;
	public int current = -1;
	
	public Stack(int size){
		stack = new int[size];
		this.mSize = size;
	}
	public void push(int v){
		stack[++current] = v;
	}
	public int pop(){
		if(current>=0)
		return stack[current--];
		else
			return -1;
	}
	public int peek(){
		if(current>=0)
			return stack[current];
			else
				return -1;
	}
	public boolean isEmpty(){
		return current==-1;
	}
}
