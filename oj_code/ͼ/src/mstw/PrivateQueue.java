package mstw;

public class PrivateQueue {
	private Edge[] qArray;
	int current;
	public PrivateQueue(){
		qArray = new Edge[20];
		current = 0;
	}
	public void insert(Edge item){
		int i;
		for(i = 0;i < current;i++){
			if(item.distance>qArray[i].distance){ // 有序的插入
				break;
			}
		}
		for(int j = current-1;j >= i;j--){
			qArray[j+1] = qArray[j];
		}
		qArray[i] = item;
		current++;
	}
	public Edge removeMin(){//删除最小
		return qArray[--current];
	}
	public void removeN(int n){
		for(int i = n;i<current;i++){
			qArray[i] = qArray[i+1];
		}
		current--;
	}
	public Edge peek(){
		return qArray[current-1];
	}
	public Edge peekN(int n){
		return qArray[n];
	}
	public int Size(){
		return current;
	}
	public boolean isEmpty(){
		return current==0;
	}
	public int find(int dex){ //找终点的顶点
	/*	if(current == 0){
			return -1;
		}*/
		for(int j = 0;j < current;j++){
			if(qArray[j].destVert==dex){
				return j;
			}
		}
		return -1;
	}
}
