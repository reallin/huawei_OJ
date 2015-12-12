package doubly;

public class DoublyApp {
	public static void main(String[] args) {
		DoublyLinkList theList = new DoublyLinkList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		theList.displayForword();
		theList.displayBack();
		theList.deleteFirst();
		theList.displayForword();
		theList.deleteLast();
		theList.displayForword();
		theList.insertAfter(44, 88);
		theList.displayForword();
		theList.deleteAfter(88);
		theList.displayForword();
	}
}
