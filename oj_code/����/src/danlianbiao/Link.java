package danlianbiao;

public class Link {
	public int id;
	public double dd;
	public Link next;
	public Link(int id,double dd){
		this.id= id;
		this.dd = dd;
	}
	public void displayLink(){
		System.out.print("{"+id+","+dd+"}" );
	}

}
