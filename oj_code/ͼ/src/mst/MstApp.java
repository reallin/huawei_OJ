package mst;


public class MstApp {
	public static void main(String[] args) {
	Graph2 graph = new Graph2(20);
	
	graph.insertVertex('A');
	graph.insertVertex('B');
	graph.insertVertex('C');
	graph.insertVertex('D');
	graph.insertVertex('E');
	graph.insertEdge(0, 1);
	graph.insertEdge(0, 2);
	graph.insertEdge(0, 3);
	graph.insertEdge(1, 4);
	
	System.out.print("Visits:");
	graph.dfs();//深度优先搜索
	}
}
