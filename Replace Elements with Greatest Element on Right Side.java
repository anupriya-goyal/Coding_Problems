//Replace Elements with Greatest Element on Right Side

/*Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

Example:
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
*/

// Not a naive solution
class Solution {
    public int[] replaceElements(int[] arr) {
 
        int arr_max= arr[arr.length-1];
        arr[arr.length-1]=-1;
        
        for(int i= arr.length-2;i>=0;i--)
        {
            int temp= arr[i];
            
            arr[i]=arr_max;
            
            if(arr_max<temp)
            {
                arr_max=temp;
            }
        }
        
        return arr;
}
    
}

/* TC: O(n)
SC: O(1)
*/