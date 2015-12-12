package Main;

import java.util.Scanner;

/**
 * 
 * 定义一个二维数组N*M（其中2<=N<=10;2<=M<=10），如5 × 5数组下所示： 

int maze[5][5] = {

        0, 1, 0, 0, 0,

        0, 1, 0, 1, 0,

        0, 0, 0, 0, 0,

        0, 1, 1, 1, 0,

        0, 0, 0, 1, 0,

};

它表示一个迷宫，其中的1表示墙壁，0表示可以走的路，只能横着走或竖着走，不能斜着走，要求编程序找出从左上角到右下角的最短路线。入口点为[0,0],既第一空格是可以走的路。
 *
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrs = str.split(" ");
		int[] nums = new int[arrs.length];
		int count = 2;
		for(int i = 0;i < arrs.length;i++){
			nums[i] = Integer.parseInt(arrs[i]);
		}
		int[][] migong = new int[nums[0]][nums[1]];
		for(int i = 0; i < nums[0];i++){ //给数组定义
			for(int j = 0; j < nums[1];j++){
				migong[i][j] = nums[count];
				count++;					
			}
		}
		
	}
	public boolean check(int[][]nums,int x,int y ){
		int(nums[x+1]!=1 && )
	}
	public void move(int x,int y,int endx,int endy){
		if(x!=endx&&y!=endy){
			move
		}
	}
}
