package topo;

public class TopoApp {
	public static void main(String[] args) {
		Graph3 graph = new Graph3(20);
		graph.insertVertex('A');
		graph.insertVertex('B');
		graph.insertVertex('C');
		graph.insertVertex('D');
		graph.insertVertex('E');
		graph.insertEdge(0, 1);
		graph.insertEdge(2, 1);
		graph.insertEdge(3, 4);
		graph.insertEdge(1, 4);
		
		System.out.print("Visits:");
		graph.topo();//深度优先搜索
	}
}
