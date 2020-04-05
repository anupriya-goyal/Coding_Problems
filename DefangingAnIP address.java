/* Defanging an IP address
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example: Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

*/

/* 1st Method: withput using replaceAll method*/

class Solution {
    public String defangIPaddr(String address) {
  
        
           StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        String s=sb.toString();
        return s;

    }
}

/* Using replaceAll Method
The computation time increases by using replaceAll method.
It is slow method therefore prefer to use Method 1.
*/
class Solution {
    public String defangIPaddr(String address) {
  
 //     return address.replaceAll("\\.", "[.]");


    }
}