package danlianbiao;

public class TestLink {
	public static void main(String[] args) {
		PrivateLink theList = new PrivateLink();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayLink();
//		while(!theList.isEmpty()){
//			Link aLink = theList.deleteFirst();
//			System.out.print("Deleted:");
//			aLink.displayLink();
//			System.out.println();
//		}
//		theList.displayLinkList();
		Link f = theList.find(44);
		if(f!=null)
			System.out.println("Found link with key "+ f.dd);
		else
			System.out.println("can't find link ");
		
		Link d = theList.Delete(66);
		if(f!=null)
			System.out.println("Deleted link with key "+ d.id);
		else
			System.out.println("can't delete link ");
		theList.displayLink();
	}
}
