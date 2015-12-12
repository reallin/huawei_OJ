package Main;
import java.util.Scanner;
import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String regex = "[0-9]+";
			Matcher m = Pattern.compile(regex).matcher(str);  
			StringBuilder builder = new StringBuilder();
	        while (m.find()) {
	            int n = m.groupCount();
	            for (int i = 0; i <= n; i++) {
	                String tempStr = m.group(i);
	               // System.out.print(tempStr);
	                int firstShowPlace = str.indexOf(tempStr);
	                int tempStrLength = tempStr.length();
	                int length = str.length();
	                String newStr = str.substring(0,firstShowPlace+tempStrLength);
	                str = str.substring(firstShowPlace+tempStrLength,length);
	                builder.append(newStr.replaceAll(tempStr,"*"+tempStr+"*"));
	            }
	        }
	        builder.append(str);
			System.out.print(builder.toString());
			scanner.close();
		}

	}

