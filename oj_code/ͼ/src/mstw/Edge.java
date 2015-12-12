package mstw;

public class Edge {
	public int srcVert;
	public int destVert;
	public int distance;
	public Edge(int sv,int dv,int d){
		this.srcVert = sv;
		this.destVert = dv;
		this.distance = d;
	}
}
