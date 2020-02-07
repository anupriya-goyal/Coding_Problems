
//COurse Schedule Leetcode Problem using DFS (determing cycle in the given list of courses)
class Solution {
    int n;
    int[] indegree;
    Map<Integer,List<Integer>> adj = new HashMap<>();
   
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     
        n = numCourses;
        indegree = new int[n];
        for(int[] pr : prerequisites){
            List<Integer> l =  adj.getOrDefault(pr[1], new ArrayList<>());
            l.add(pr[0]); indegree[pr[0]]++;
            adj.put(pr[1], l);
        }
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0) q.add(i); 
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            if(indegree[cur] == 0)count++;
            if(!adj.containsKey(cur)) continue;
            for(int nei : adj.get(cur)){
                indegree[nei]--;
                if(indegree[nei]== 0) q.add(nei);
            }

        }

        return count == n;
    }
}