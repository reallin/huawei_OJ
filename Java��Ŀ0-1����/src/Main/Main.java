package Main;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] intArray = new int[arrayLength];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = sc.nextInt();
        }
         
        boolean isSplitTwoEqualArrays = Main.isSplitTwoEqualArray(intArray);
        System.out.println(isSplitTwoEqualArrays);
    }
     
    public static boolean isSplitTwoEqualArray(int[] intArray){
        int multipleOfFiveSum = 0;
        int multipleOfThreeSum = 0;
        ArrayList<Integer> otherInts = new ArrayList<Integer>();
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] % 5 == 0){
                multipleOfFiveSum += intArray[i];
            } else if(intArray[i] % 3 == 0){
                multipleOfThreeSum += intArray[i];
            } else {
                otherInts.add(intArray[i]);
            }
        }
         
        int difference = multipleOfFiveSum - multipleOfThreeSum;
        ArrayList<Integer> accumulationSum = new ArrayList<Integer>();
        accumulationSum.add(0);
        for (Integer otherInt : otherInts) {
            accumulationSum = Main.expressionsAccumulation(accumulationSum, otherInt);
        }
        for (Integer sum : accumulationSum) {
            if((sum == difference) || (sum == difference * (-1)))
                return true;
        }
         
        return false;
    }
     
    public static ArrayList<Integer> expressionsAccumulation(ArrayList<Integer> preSums, int extraInt){
        ArrayList<Integer> accumulationSum = new ArrayList<Integer>();
        for (Integer preSum : preSums) {
            accumulationSum.add(preSum + extraInt);
            accumulationSum.add(preSum - extraInt);
        }
        return accumulationSum;
    }
}
