package danlianbiao;

public class PrivateLink {
	public Link first = null;
	public Link insertFirst(int id ,double dd){
		Link temp = new Link(id,dd);
		temp.next = first;
		first=temp;
		return first;
	}
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		//first=temp;
		return temp;
	}
	public void displayLink(){
		System.out.print("this link is" );
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		
	}
	public Link find(int key){
		Link current = first;
		while(current.id != key){
			if(current.next == null){
				return null;
			}else{
				current = current.next;
			}
			
		}
		return current;
	}
	public Link Delete(int key){
		Link current = first;
		Link previous = first;
		while(current.id != key){
			if(current.next == null){
				return null;
			}else{
				previous = current;
				current = current.next;
			}
			
		}
		if(current == first)
			first = first.next;
		else{
		previous.next = current.next;
		
		}
		return current;
	}
/*	public void insert(int key){
		Link temp = new Link(id,dd);
		temp.next = first;
		first=temp;
		return first;
	}*/
}
