package FindChar;


	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			char p = '.';
			System.out.print(FindChar(str,p));
			
			sc.close();
		}
		public static char FindChar(String pInputString,char pChar)
		{
			char[] temp = pInputString.toCharArray();
			int[] num = new int[temp.length];
			for(int i=0;i<pInputString.length();i++)
			{
				for(int j=0;j<pInputString.length();j++)
				{
					if(temp[i]==temp[j])
					{
						num[i]++;
					}
				}
				
			}

			for(int i=0;i<num.length;i++)
			{
				if(num[i]==1)
				{
					pChar = temp[i];		
					return pChar;
				}
			}
			return '.';
			
			
		}
	}

