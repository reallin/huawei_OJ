package bfs;

import graph.Stack;
import graph.Vertex;

public class Graph1 {
	public int[][] curMax;
	public int mSize;
	private Vertex[] vertex;
	private Quene quene;
	private int current = 0;
	public Graph1(int size){
		this.mSize = size;
		quene = new Quene(size);
		vertex = new Vertex[size];
		curMax = new int[size][size];
		for(int i = 0;i < size;i++){ //初始化矩阵都为0，没有边
			for(int j = 0;j < size;j++){
				curMax[i][j] = 0;
			}
		}
	}
	public void insertVertex(char label){//添加节点
		vertex[current++] = new Vertex(label);
	}
	public void insertEdge(int start,int end){//添加边
		curMax[start][end] = 1;
		curMax[end][start] = 1;
	}
	public void displayVertex(int v){
		System.out.print(vertex[v].label + "");
	}
	//广度优先搜索
	public void dfs(){

		displayVertex(0);
		vertex[0].wasVisited=true;
		quene.insert(0);
		int temp = 0;
		int m = 0;
		while(!quene.isEmpty()){
			m = quene.remove();//从队头取出第一个顶点
			while((temp=getAdjUnvisitedVertex(m))!=-1){
				quene.insert(temp);
				vertex[temp].wasVisited=true;
				displayVertex(temp);
			}
		}		
		for(int j=0; j<current; j++)
			vertex[j].wasVisited=false;//全部还原到初始状态
	}
	//获取指定顶点相邻接且未被访问过的顶点
	public int getAdjUnvisitedVertex(int v){
		for(int i = 0;i < current;i++){
			if(curMax[v][i]==1&&vertex[i].wasVisited==false){
				return i;
			}
		}
		return -1;
	}
}
