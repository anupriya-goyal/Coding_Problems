class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int N= nums.length;
        
        int[] left_products=new int[N];
        int[] right_products= new int[N];
        int[] output_array= new int[N];
        
        left_products[0]=1;
        right_products[N-1]=1;
        
        for(int i=1;i<N;i++)
        {
            left_products[i]=nums[i-1]*left_products[i-1];
        }
        
        for(int i=N-2;i>=0;i--)
        {
            right_products[i]=nums[i+1]*right_products[i+1];
        }
        
        for(int i=0;i<N;i++)
        {
            output_array[i]=left_products[i]*right_products[i];
        }
        
        return output_array;
        
    }
}