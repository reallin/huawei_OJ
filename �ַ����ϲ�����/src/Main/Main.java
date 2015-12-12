package Main;

import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 private static final byte[] small = {0x0A,0x0B,0x0c,0x0d,0x0e,0x0f};
 private static final char[] zimu = {'a','b','c','d','e','f'};
 public static void main(String[] args) throws IOException {
  Scanner sf = new Scanner(System.in);
  // 输入字符串
  
  String[] ssStrings = sf.nextLine().split(" ");
  
  String s1 = ssStrings[0];
  String s2 = ssStrings[1];
 

  StringBuffer ss1 = new StringBuffer();
  StringBuffer ss2 = new StringBuffer();
  ss1.append(s1);
  ss1.append(s2);
  String s3 = ss1.toString();
  ss1.setLength(0);
  for (int i = 0; i < s3.length(); i++) {
   if (i % 2 == 1) {
    ss1.append(s3.charAt(i)); // 奇数
   } else {
    ss2.append(s3.charAt(i));
   }
  }
  s1 = ss1.toString();
  s2 = ss2.toString();
  s1 = quickSort(s1);
  s2 = quickSort(s2);
  ss1.setLength(0);
  int length = s1.length();
  for (int i = 0; i < length; i++) {
   ss1.append(s2.charAt(i));
   ss1.append(s1.charAt(i));
  }
  s3 = ss1.toString();
  System.out.println(convert(s3));
 }
 
 private static String convert(String string){
  int length = string.length();
  byte[] ca = new byte[length];
  StringBuffer sBuffer = new StringBuffer();
  byte temp = 0x01;
  byte result = 0; //位倒序转换后的结果
  char c = 0;
  for (int i = 0; i < length; i++) {
   temp =(byte)string.charAt(i);
   if(temp>= 0x30 && temp<= 0x39){
    temp -= 0x30;
   }else if(temp>= 0x41 && temp<= 0x46){ //大写
    temp -= 0x41;
    temp = small[temp];
   }else if(temp>= 0x61 && temp<= 0x66){ //小写
    temp -= 0x61;
    temp = small[temp];
   }
   ca[i] = temp;
   temp = 0x01;
   for (int j = 3; j >-1; j--) {
    if((ca[i]&temp) == temp){
     result += (byte)Math.pow(2, j);	 
    }
    temp <<= 1;
   }
   temp = 0x01;
   if (result>9 && result<16) {
    c = zimu[result-10];
    sBuffer.append(c);
   }else{
    sBuffer.append(result);
   }
   
   result = 0;
  }
  
  return sBuffer.toString().toUpperCase();
  
 }

 // 对String进行快速排序，升序
 public static String quickSort(String string) {
  int n = string.length();
  int[] list = new int[n];
  for (int i = 0; i < list.length; i++) {
   list[i] = string.charAt(i);
  }
  quickSort(list, 0, list.length - 1);
  StringBuffer sbBuffer = new StringBuffer();
  for (int i = 0; i < list.length; i++) {
   char temp = (char) list[i];
   sbBuffer.append(String.valueOf(temp));
  }
  return sbBuffer.toString();
 }

 private static void quickSort(int[] list, int first, int last) {
  if (last > first) {
   int pivotIndex = partition(list, first, last);
   quickSort(list, first, pivotIndex - 1);
   quickSort(list, pivotIndex + 1, last);
  }
 }

 private static int partition(int[] list, int first, int last) {
  // 选择第一个为主元素，分开两半
  int pivot = list[first];
  int low = first + 1;
  int high = last;

  while (high > low) {
   // 从左边往前排序
   while (low <= high && list[low] <= pivot) {
    low++;
   }

   // 从右边从往后排序
   while (low <= high && list[high] > pivot) {
    high--;
   }

   // 交换两个元素
   if (high > low) {
    int temp = list[high];
    list[high] = list[low];
    list[low] = temp;
   }
  }

  while (high > first && list[high] >= pivot) {
   high--;
  }

  if (pivot > list[high]) {
   list[first] = list[high];
   list[high] = pivot;
   return high;
  } else {
   return first;
  }
 }
}
