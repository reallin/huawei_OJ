package twoTree;

import java.util.Stack;

public class Tree {
	private Node root ;
	public Tree(){
		root = null;
	}
	public void insert(int id,double dd){
		Node current = null;
		Node parent = null;
		Node newNode = new Node();
		newNode.id = id;
		newNode.dd = dd;
		if(root == null){
			root = newNode;
			return;
		}
		current = root;
		while(true){
			parent = current;
			if(id < current.id){ //插入点比节点小，往左边找
				current = current.leftNode;
				if(current == null){
					parent.leftNode = newNode;
					return;
				}
			}
			else {//插入点比节点大，往右边找
				current = current.rightNode;
				if(current == null){
					parent.rightNode = newNode;
					return;
				}
			}
		}
	}
	
	public boolean delete(int id){
		Node current = root;
		boolean left = true;
		Node parent = null;
		if(root == null){
			return false;
		}
		while(true){
			while(id != current.id){	
				parent = current;
				if(id<current.id){ //住左边找
					current = current.leftNode;	
					left = true;
				}else {//住右边找
					current = current.rightNode;
					left = false;
				}
				if(current == null){ //没找到
					return false;
				}
			}
		if(current.leftNode == null&&current.rightNode==null){ //当前节点是叶子节点
			if(current == root){
				root = null;
			}
			if(left){ // 是父节点的左子节点
			parent.leftNode = null;
			}else{
				parent.rightNode = null;
			}
		}else if(current.leftNode == null){//只有右节点
			if(current == root){
				root = current.rightNode;
			}else if(left){
				parent.leftNode = current.rightNode;
			}
			else {
				parent.rightNode = current.rightNode;
			}
		}else if(current.rightNode == null){//只有左节点
			if(current == root){
				root = current.leftNode;
			}else if(left){
				parent.leftNode = current.leftNode;
			}
			else {
				parent.rightNode = current.leftNode;
			}
		}
		else{ //有两个节点
			Node successor = getSuccessor(current);
			if(root == current){
				root = successor;
			}else if(left){
				parent.leftNode = successor;
			}else{
				parent.rightNode = successor;
			}
			successor.leftNode = current.leftNode;//处理删除节点的左节点，绑定successor
		}
		return true;
		}
		
	}
	public Node getSuccessor(Node del){//寻找继承节点(删除节点第一个右节点的最左子节点)
		Node successorParent = del;
		Node successor = del;
		Node current = del.rightNode;
		//successor = del.rightNode;//
		while(current!=null){
			successorParent = successor;
			successor = current;
			current = current.leftNode;
		}
		if(successor != del.rightNode){ //如果不是删除结点的右节点
			successorParent.leftNode = successor.rightNode; //如果successor有右子节点，放到successorParent左子节点中
			successor.rightNode = del.rightNode; //把删除右节点放到继承节点右节点下
		}
		return successor;
	}
	public Node find(int id){ //找节点
		Node current = root;
		if(root == null){
			return null;
		}
		while(true){
			while(id != current.id){		
				if(id<current.id){ //住左边找
					current = current.leftNode;				
				}else {//住右边找
					current = current.rightNode;
				}
				if(current == null){ //没找到
					return null;
				}
			}
			return current;
		}
	}
	public void display(){
		
	}
	public void traverse(int num){ //遍历
		switch(num){
		case 1://从上往下，从左到右
			preOder(root);
			break;
		case 2://从下往上，从左到右
			inOrder(root);
			break;
		case 3://从下往上，从右到左
			postOrder(root);
			break;
		}
	}
	private void preOder(Node node){
		if(node != null){
			System.out.print(node.id+" ");
			preOder(node.leftNode);
			preOder(node.rightNode);
		}
	}
private void inOrder(Node node){
	if(node != null){
		inOrder(node.leftNode);
		System.out.print(node.id+" ");		
		inOrder(node.rightNode);
	}
	}
private void postOrder(Node node){
	if(node != null){
		postOrder(node.leftNode);
		postOrder(node.rightNode);
		System.out.print(node.id+" ");		
		
	}
}
/*public void displayTree(){
	Stack golbal = new Stack();
	golbal.push(root);
	int n = 32;
	boolean isRowEmpty = false;
	while(isRowEmpty==false){
		Stack local = new Stack();
		isRowEmpty = true;
		for(int i=0;i<n;i++){
			System.out.print(" ");
			while(golbal.isEmpty()==false){
				Node temp =(Node)golbal.pop();
				if(temp!=null){
					System.out.print(temp.id);
					local.push(temp.leftNode);
					local.push(temp.rightNode);
					if(temp.leftNode!=null||temp.rightNode!=null){
						isRowEmpty=false;
					}else{
						System.out.print("--");
						local.push(null);
						local.push(null);
					}
					for(int j= 0;j<n*2-2;j++){
						System.out.print(" ");
					}
				}
				System.out.println();
				n/=2;
				while(local.isEmpty()==false){
					golbal.push(local.pop());
				}
			}
		}
	}
	
}*/

}
