// Pairs of Songs With Total Durations Divisible by 60

class Solution {
    public int numPairsDivisibleBy60(int[] time) { 
        int count = 0;
        int l = time.length;
        int []temp = new int[60];
        // count every number from 0 to 59
        for (int i = 0; i < l; i++) 
            temp[ time[i] % 60 ]++;
        
         // special number
        count = temp[0] * ( temp[0] - 1 ) / 2 + temp[30] * ( temp[30] - 1 ) / 2;
        
        for (int j = 1; j < 30; j++) // normal pair
            count = count + temp[j] * temp[60 - j];
        
        return count;
    }
}