package bfs;

public class Vertex {
	public char label;
	public boolean wasVisited;
	public Vertex(char label){
		this.label = label;
		wasVisited = false;
	}
}
