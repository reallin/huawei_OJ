package Main;

public class Main {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append("what is you");
		String s = replaceSpace(sb);
		for(int i = 0;i < replaceSpaceByArray(sb).length;i++)
		System.out.print(replaceSpaceByArray(sb)[i]);
	}
	//用java
	    public static String replaceSpace(StringBuffer str) {
	    	String str1 = str.toString();
	        System.out.print(str1.replaceAll(" ","%20"));
	        return str1.replaceAll(" ","%20");
	    }
	    //用数组的思想来实现
	    public static char[] replaceSpaceByArray(StringBuffer str) {
	    	if(str == null||str.length()<=0){
	    		return null;
	    	}
	    	String str1 = str.toString();
	    	int length = str1.length();
	    	int spaceNum = 0;
	    	char[] finalArray;
	    	int i =  0;
	    	while(i < length){
	    		if(str1.charAt(i) == ' '){
	    			spaceNum++;
	    		}
	    		i++;
	    	}
	    	int newLength = length + spaceNum*2;
	    	finalArray = new char[newLength];
	    	int index = newLength-1;
	    	int num = length-1;
	    	while(num>=0){
	    		if(str1.charAt(num) == ' '){
	    			finalArray[index--] = '0';
	    			finalArray[index--] = '2';
	    			finalArray[index--] = '%';
	    		}else{
	    			finalArray[index--] = str.charAt(num);
	    		}
	    		num--;
	    	}
	    	return finalArray;
	    }
}
