package bfs;

public class Quene {
	public int mSize;
	public int current;
	public int real;
	public int[] quene;
	public Quene(int size){
		this.mSize = size;
		current = -1;
		real = 0;
		quene = new int[size];
	}
	public void insert(int i){
		if(current==mSize-1){
			current=-1;
		}
		quene[++current] = i;
	}
	public int remove(){
		int temp = quene[real++];
		if(real==mSize)
			real=0;
		return temp;
	}
	public boolean isEmpty(){
		return (current+1==real || real+mSize-1==current);
	}
}
