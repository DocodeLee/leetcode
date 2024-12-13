/*
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station 
to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index 
if you can travel around the circuit once in the clockwise direction, otherwise return -1.
If there exists a solution, it is guaranteed to be unique.

Example 1:

Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
Therefore, return 3 as the starting index.


The key point in solving this problem is tha
if the total amount of gas is greater than or eaqul to costs, 
then even if gas runs out midway, starting from a different location will allow a full circuit.
*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost =0; //set the value as 0 > gas and cost
        for(int i =0; i < gas.length; i++){ // length is same so you can use any length
            totalGas += gas[i]; // add all value
            totalCost += cost[i]; // add all value
        }
        if (totalGas < totalCost){
            return -1; // if the cost is bigger there will be the insufficient point so return -1
        }
        // from here, the total gas is same ore more than cost situation
        int currentGas = 0; // set new value to check whether we can go to next point
        int start = 0; // start point chceck from the 0

        for( int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i]; // check we can go to next station
            if(currentGas < 0){ // if less than cost
                currentGas =0; // reset
                start = i +1; // reset the start point
            }
        }
        return start;
    }
}
