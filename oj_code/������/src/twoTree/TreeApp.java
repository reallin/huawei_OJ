package twoTree;

public class TreeApp {
public static void main(String[] args){
	int value;
	Tree tree = new Tree();
	tree.insert(50, 1.1);
	tree.insert(60, 1.9);
	tree.insert(70, 1.7);
	tree.insert(30, 1.6);
	tree.insert(11, 1.3);
	tree.insert(23, 1.5);
	tree.insert(46, 1.7);


	tree.traverse(1);
	tree.traverse(2);
	tree.traverse(3);
	System.out.print("’“µΩ£∫"+tree.find(50).dd);
	System.out.print("’“µΩ£∫"+tree.delete(46));
	System.out.print("’“µΩ£∫"+tree.delete(46));
	
}
}
