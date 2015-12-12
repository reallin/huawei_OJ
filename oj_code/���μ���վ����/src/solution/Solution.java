package solution;
/**
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.

【题意】

环形路线上有N个加油站，每个加油站有汽油gas[i]，从每个加油站到下一站消耗汽油cost[i]，问从哪个加油站出发能够回到起始点，如果都不能则返回-1（注意，解是唯一的）。
 *
 *
 *思路：从任一个加油站开始转圈，如果出现到j油不够，就从j+1开始继续转（因为j之前都不合格），直到转完圈，返回
 */
public class Solution {
	 public int canCompleteCircuit(int[] gas, int[] cost) {  
	        int sum = 0;  
	        int total = 0;  
	        int j = -1;  
	        for (int i = 0; i < gas.length; i++) {  
	            sum += gas[i] - cost[i];  
	            total += gas[i] - cost[i];  
	            if(sum < 0) {   //之前的油量不够到达当前加油站  
	                j = i;  
	                sum = 0;  
	            }  
	        }  
	        if (total < 0) return -1;    //所有加油站的油量都不够整个路程的消耗  
	        else return j + 1;  
	    }  
}
