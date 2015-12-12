package mstw;

import mst.Graph2;

public class MstwApp {
	public static void main(String[] args) {
		Graph4 graph = new Graph4(20);
		
		graph.insertVertex('A');
		graph.insertVertex('B');
		graph.insertVertex('C');
		graph.insertVertex('D');
		graph.insertVertex('E');
		graph.insertVertex('F');
		graph.insertEdge(0, 1,6);
		graph.insertEdge(0, 2,4);
		graph.insertEdge(2,3,10);
		graph.insertEdge(1, 3,7);
		graph.insertEdge(0, 3,8);
		graph.insertEdge(2,3,8);
		graph.insertEdge(2, 4,5);
		graph.insertEdge(2, 5,6);
		graph.insertEdge(3,4,12);
		graph.insertEdge(4,5,7);
		
		System.out.print("Visits:");
		graph.mstw();//深度优先搜索
		}
}
