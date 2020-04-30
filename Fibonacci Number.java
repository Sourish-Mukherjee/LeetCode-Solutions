/*
  Author: Sourish Mukherjee
  Date: 30-05-2020
  Link: https://leetcode.com/problems/fibonacci-number/
  Resource: https://demonstrations.wolfram.com/GeneralizedFibonacciSequenceAndTheGoldenRatio/
*/

class Solution {
    public int fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2; 
        return (int) Math.round(Math.pow(phi, n)  
                        / Math.sqrt(5)); 
    }
}
