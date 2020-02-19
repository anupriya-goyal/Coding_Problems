//Longest Word Dictionary

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        
        HashSet <String> set= new HashSet<>();
        
        String result ="";
        
        for(String w: words)
        {
            if(w.length()==1 || set.contains(w.substring(0,w.length()-1)))
            {
                if(w.length()>result.length())
                {
                result=w;
                    
                }
                set.add(w);
            }
            
        }
        
        return result;
    }
}