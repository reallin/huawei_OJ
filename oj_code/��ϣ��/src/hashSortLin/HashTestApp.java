package hashSortLin;

public class HashTestApp {
	public static void main(String[] args){
		HashSortLin hash = new HashSortLin(60);
		hash.insert(100);
		hash.insert(50);
		hash.insert(33);
		hash.insert(0);
		hash.insert(3);
		hash.insert(49);
		hash.insert(60);
		hash.insert(120);
		hash.delete(60);
		
		hash.display();
		System.out.println();
		System.out.print(hash.find(120));
	}
}
