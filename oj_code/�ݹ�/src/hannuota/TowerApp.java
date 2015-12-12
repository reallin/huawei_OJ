package hannuota;

public class TowerApp {
	public static void main(String[] args){
		doTower(4,'A','B','C');
	}
	public static void doTower(int top,char from,char inner,char to){
		if(top == 1){
			System.out.println(top+"from"+from+"to"+to);
		}else{
			doTower(top-1,from,to,inner);
			System.out.println(top+"from"+from+"to"+to);
			doTower(top-1,inner,from,to);
		}
	}
}
