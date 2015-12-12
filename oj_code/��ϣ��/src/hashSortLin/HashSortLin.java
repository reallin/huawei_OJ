package hashSortLin;

public class HashSortLin {
	DataItem[] dataItem ;
	private int mSize;
	DataItem none = new DataItem(-1);
	public HashSortLin(int Size){
		dataItem=new DataItem[Size];
		this.mSize = Size;
	}
	public void insert(long data){
		int current = getPosition1(data);
		int step = 5-current%5;
		DataItem newData = new DataItem(data);
		while(dataItem[current]!=null&&dataItem[current].getData()!=-1){
			current+=step;
			current = current%mSize;			
		}
		dataItem[current] = newData;
		
	}
	public boolean delete(long data){
		int current = getPosition1(data);
		int step = 5-current%5;
		while(dataItem[current]!=null){
			if(dataItem[current].getData()==data){
				dataItem[current] = none;
				return true;
			}else{
				current+=step;
				current = current%mSize;
			}	
	}
		return false;
	}
	public int find(long data){
		int current = getPosition1(data);
		int step = 5-current%5;
		while(dataItem[current]!=null){
			//if(dataItem[current]!=null){
				if(dataItem[current].getData()!=data){
					current+=step;
					current = current%mSize;
			}else{				
				return current;
			}		
	}
		return -1;
	}
	public int getPosition1(long data){//第一次哈希化
		return (int)data%mSize;
	}
	public int getPosition2(long data){ //再哈希
		return (int)data%mSize;
	}
	public void display(){
		for(int i = 0;i < dataItem.length;i++){
			if(dataItem[i]==null){
				System.out.print("** ");
			}else if(dataItem[i].getData()==-1){
				System.out.print("** ");
			}else{
				System.out.print(dataItem[i].getData()+" ");
			
			}
		}
	}
}
