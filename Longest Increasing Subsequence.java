/*
  Author: Sourish Mukherjee
  Date: 28-04-2020
*/

/*
  We have to use Patience sort, just like in the game of solitare.
  Link: https://en.wikipedia.org/wiki/Patience_sorting
  YouTube Link: https://www.youtube.com/watch?v=TocJOW6vx_I
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] piles = new int[nums.length]; //Creating Total number of piles possible in array
        int numPiles = 0; // Total Piles is 0 at starting
        for (int num: nums) {
            int dest = Arrays.binarySearch(piles, 0, numPiles, num); // Look for the position in the numpiles where it should exist
            if (dest < 0) { // If it does not exists in the array, calculate the position where it should be.
                dest = -(dest + 1); // Arrays.binarySearch() method returns index of the search key, 
                                    //if it is contained in the array, else it returns (-(insertion point) - 1)
            }
            piles[dest] = num; // We replace or put it in the specified index and increase the length.
            if (dest == numPiles) {
                numPiles++;
            }
        }
        return numPiles;
    }
}
