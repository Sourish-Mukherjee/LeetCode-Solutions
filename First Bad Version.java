/*
  Author: Sourish Mukherjee
  Date: 06-05-2020
  Link: https://leetcode.com/problems/first-bad-version/
*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
    }
}