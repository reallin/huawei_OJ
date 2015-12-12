package heap;

public class Node {
	private long dd;
	public Node left;
	public Node right;
	public Node(long dd){
		this.dd = dd;
	}
	public long getData(){
		return dd;
	}
	public void setData(long dd){
		this.dd = dd;
	}
}
