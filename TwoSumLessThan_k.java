/* using two pointer approach */

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int ans = -1;
        while (i < j) {
            if (A[i] + A[j] >= K) {
                j --;  //j represent pointer moving from right side of array
            } else {
                ans = Math.max(ans, A[i] + A[j]);
                i ++; //i represent pointer moving from left side of array
            }
        }
        return ans;
    }
    }
