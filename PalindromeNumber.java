// Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
        {
            return true;
        }
        
        if(x<0|| x%10==0)
        {
            return false;
        }
        
        int reversed_int =0;
        while(x>reversed_int)
        {
            int pop= x%10;
            x/=10;
            
            reversed_int=(reversed_int*10)+pop;
        }
        
        if(reversed_int==x|| x==reversed_int/10)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
 // Time Complexity - O(log(n))
 // Space Complexity - O(1)   
    
  /*  public boolean isPalindrome(int num){
   if(num < 0) return  false; 
   int reversed = 0, remainder, original = num;
   while(num != 0) {
        remainder = num % 10; // reversed integer is stored in variable
        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
        num  /= 10;  //the last digit is removed from num after division by 10.
    }
    // palindrome if original and reversed are equal
    return original == reversed;
    
    // Time Complexity - O(n)
    // Space Complexity - O(1)
}*/
}