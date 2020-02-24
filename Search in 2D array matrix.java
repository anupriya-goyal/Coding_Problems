// Search in 2D array matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        {
            return false;
        }
        
        int rows= matrix.length;
        int columns= matrix[0].length;
        
        int left=0;
        int right= rows*columns-1;
        
        while(left<=right)
        {
            int midpoint = left+(right-left)/2;
            
            int midpoint_element= matrix[midpoint/columns][midpoint%columns];
            
            if(midpoint_element==target)
            {
                return true;
            }
            else if(midpoint_element>target)
            {
                right= midpoint-1;
            }
            else if(midpoint_element<target)
            {
                left=midpoint+1;
            }
                
        }
            return false;
    }
}