package youxulianbiao;

public class Link {
	double dd;
	Link next;
	public Link(long dd){

		this.dd = dd;
	
	}
	public void displayLink(){
		System.out.print("--"+dd+"---" );
	}
}
