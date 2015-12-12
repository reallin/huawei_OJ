package topo;

public class Graph3 {
	public int[][] curMax;
	public int mSize;
	private Vertex[] vertex;
	private char[] sortArray;
	//private Stack mStack;
	private int current = 0;
	public Graph3(int size){
		this.mSize = size;
		//mStack = new Stack(size);
		vertex = new Vertex[size];
		curMax = new int[size][size];
		sortArray= new char[size];
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
		//curMax[end][start] = 1;
	}
	public void displayVertex(int v){
		System.out.print(vertex[v].label + "");
	}
	//寻找没有后节点的节点
	public int findNode(){
		
		boolean flag;
		for(int row = 0;row < current;row++){
			flag = false;
		for(int i = 0;i < current;i++){
			if(curMax[row][i]>0){
				flag = true;
			}
		}
		if(!flag){
			return row;
		}
		}
		return -1;
	}
	public void topo(){
		int c = current;
		while(current>0){
		int v = findNode();
		if(v == -1){
			System.out.print("no node");
			return;	
		}
		sortArray[current-1] =  vertex[v].label;
		delete(v);
		}
		System.out.print("the order");
		for(int i = 0;i < c;i++){
			System.out.print(sortArray[i]);
		}
	}
	public void delete(int position){
		if(position != current-1){
			for(int i = position;i < current-1;i++){
				vertex[i] = vertex[i+1];			
			}
			for(int i = position;i < current-1;i++){ //移动行
				for(int j = 0;j<current;j++){
					curMax[position][j] = curMax[position+1][j];
				}
				
			}
			for(int i = position;i < current-1;i++){ // 移动列
				for(int j = 0;j<current;j++){
					curMax[j][position] = curMax[j][position+1];
				}
			}
		}
		current--;
	}
	/*//深度优先搜索
	public void dfs(){
		vertex[0].wasVisited=true;
		displayVertex(0);
		mStack.push(0);
		while(!mStack.isEmpty()){
		int status = getAdjUnvisitedVertex(mStack.peek());
		if(status != -1){
			mStack.push(status);
			vertex[status].wasVisited=true;
			displayVertex(status);
		}else{
			mStack.pop();
		}
		}
		for(int j=0; j<current; j++)
			vertex[j].wasVisited=false;//全部还原到初始状态
	}*/
	//获取指定顶点相邻接且未被访问过的顶点
	/*public int getAdjUnvisitedVertex(int v){
		for(int i = 0;i < current;i++){
			if(curMax[v][i]==1&&vertex[i].wasVisited==false){
				return i;
			}
		}
		return -1;
	}*/
}
