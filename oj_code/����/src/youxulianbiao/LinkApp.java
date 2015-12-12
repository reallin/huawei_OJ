package youxulianbiao;

public class LinkApp {
	public static void main(String[] args){
		LinksortList theList = new LinksortList();
		theList.insert(20);
		theList.insert(40);
		theList.display();
		theList.insert(10);
		theList.insert(50);
		theList.insert(30);
		theList.display();
		theList.delete();
		theList.display();
		System.out.println("*************************************************");
		int size = 10;
		Link[] linkArr = new Link[size];
		for(int j=0;j<size;j++){
			int n=(int)(java.lang.Math.random()*99);
			Link newLink = new Link(n);
			linkArr[j] = newLink;
		}
		System.out.print("Unsorted array: ");
		for(int j=0;j<size;j++)
			System.out.print(linkArr[j].dd+" ");
		System.out.println();
		LinksortList theSortList=new LinksortList(linkArr);
		theSortList.display();
		System.out.print("Sorted array: ");
		for(int j=0; j<size;j++)
			linkArr[j]=theSortList.delete();
		for(int j=0; j<size;j++)
			System.out.print(linkArr[j].dd+" ");
		System.out.println();
	}
}
