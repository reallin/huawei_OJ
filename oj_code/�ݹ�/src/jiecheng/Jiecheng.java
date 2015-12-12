package jiecheng;

public class Jiecheng {
	public static void main(String[] args){
		
		System.out.print(doMulit(4)+"");
	}
	public static int doMulit(int n){
		if(n==1){
			return 1;
		}else{
			return n*doMulit(n-1);
		}
	}
}
