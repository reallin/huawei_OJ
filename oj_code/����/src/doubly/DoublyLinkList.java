package doubly;

public class DoublyLinkList {
	Link first;
	Link last;
	public DoublyLinkList(){
		first = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void insertFirst(long key){
		Link k = new Link(key);
	/*	Link current = first;
		Link pre = null;*/
		if(isEmpty()){
			last = k;
		}else{
			first.previous = k;
			//current = k.next;
		}
		k.next = first;
		first = k;
	}
	public void insertLast(long key){
		Link k = new Link(key);
		if(isEmpty()){
			first = k;
		}else{
			last.next = k;	
			k.previous = last;
		}
		last = k;
	}
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
			first = first.next;
		}
		return temp;
	}
	public Link deleteLast(){
		Link temp = last;
		if(first.next == null){
			first = null;
		}else{
			last.previous.next = null;
			last = last.previous;
		}
		return temp;
	}
	public boolean insertAfter(long key,long dd){
		Link k  = new Link(dd);
		Link current = first;
		while(current.dd != key){
			current = current.next;
			if(current == null){
				return false;
			}
		}
		if(current == last){
			k.next = null;
			last = k;
		}else{
			k.next  = current.next ;
			current.next.previous = k;
		}
		k.previous = current;
		current.next = k ;
		return true;
	}
	
	public Link deleteAfter(long key){
		Link temp;
		Link current = first;
		while(current.dd != key){
			current = current.next;
			if(current == null){
				return null;
			}
		}
		if(current == first){
			first = current.next;
		}else{
			current.previous.next = current.next ;
		}
		if(current == last){
			last = current.previous ;
		}else{
			current.previous = current.next .previous;
		}
		return current;
	}
	public void displayBack(){
		Link current = last;
		while(current != null){
			current.display();
			current = current.previous;
		}
	}
	public void displayForword(){
		Link current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
}
