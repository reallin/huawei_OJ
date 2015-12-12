package doubly;

public class Link {
	long dd;
	Link next;
	Link previous;
	public Link(long dd){
		this.dd =dd ;
	}
	public void display(){
		System.out.print("--"+dd+"--");
	}
}
