package youxulianbiao;

public class LinksortList {
	private Link first;
	public LinksortList(){
		first = null;
	}
	public LinksortList(Link[] k){
		first = null;
		for(int i = 0;i < k.length;i++){
			insert(k[i]);
		}
		
	}
	public void insert(Link k){
		
		Link current = first;
		Link previous = null;
		while(current !=null&&current.dd<k.dd){
			previous = current;
			current = current.next;
		}
		if(previous==null)//没找到后面的插入位置
			first = k;
		else
		previous.next = k;
		k.next = current;
		
	}
	public void insert(long key){
		Link link = new Link(key);
		Link current = first;
		Link previous = null;
		while(current !=null&&current.dd<key){
			previous = current;
			current = current.next;
		}
		if(previous==null)//没找到后面的插入位置
			first = link;
		else
		previous.next = link;
		link.next = current;
		
	}
	public Link delete(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	public void display(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
}
