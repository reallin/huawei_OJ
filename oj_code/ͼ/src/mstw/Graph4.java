package mstw;

import graph.Stack;


public class Graph4 {
	public int[][] curMax;
	public int mSize;
	private Vertex[] vertex;
	private PrivateQueue queue;
	private int current;
	private int index ;
	private int nTree;
	private int INFINITY = 10000;
	public Graph4(int size){
		this.mSize = size;
		queue = new PrivateQueue();
		current = 0;
		vertex = new Vertex[size];
		curMax = new int[size][size];
		for(int i = 0;i < size;i++){ //初始化矩阵都为0，没有边
			for(int j = 0;j < size;j++){
				curMax[i][j] = INFINITY;
			}
		}
	}
	public void insertVertex(char label){//添加节点
		vertex[current++] = new Vertex(label);
	}
	public void insertEdge(int start,int end,int weight){//添加边
		curMax[start][end] = weight;
		curMax[end][start] = weight;
	}
	public void displayVertex(int v){
		System.out.print(vertex[v].label + "");
	}
	//最小生成树算法
	public void mstw(){
		index = 0;
		while(nTree<current-1){
			vertex[index].isIntree=true;
			nTree++;
			for(int j = 0;j< current;j++){
				if(j==index)continue;
				if(vertex[j].isIntree)continue;
				int distance = curMax[index][j];
				if(distance == INFINITY){
					continue;
				}
				putInPQ(j,distance);
			}
			if(this.queue.Size()==0){
				return;
			}
			Edge edge = queue.removeMin();
			int sourceVert = edge.srcVert;
			index = edge.destVert;
			System.out.print(vertex[sourceVert].label);
			System.out.print(vertex[index].label);
			System.out.print(" ");
		}
			
		for(int j=0; j<current; j++)
			vertex[j].isIntree=false;//全部还原到初始状态
	}
	//把边放入优先级队列
	public void putInPQ(int newVert,int newDist){
		int index = queue.find(newVert);
		if(index != -1){
			Edge temp = queue.peekN(index);
			int oldDist = temp.distance;
			if(oldDist>newDist){
				queue.removeN(index);
				Edge edge = new Edge(current-1,newVert,newDist);
				queue.insert(edge);
			}
		}else{
			Edge edge = new Edge(current-1,newVert,newDist);
			queue.insert(edge);
		}
	}
	
	
}
