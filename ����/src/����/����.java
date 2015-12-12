package 数组;

public class 数组 {
	
	public static void main(String[] args)
	{
	 String[][] cod = new String[][]{new String[3],new String[]{"书","歌"}};
    for(int i =0;i<3;i++ )
    {
	cod[0][i] = "爱"+i+"一个人";	
    }
    for(int k=0;k<3;k++)
    	for(int j=0;j<3;j++)
    	{
    		System.out.println(cod[k][j]);
    		
    	}
	}    
}
