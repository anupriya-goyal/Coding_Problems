class Solution {
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
        
        for(int[] item:items)
        {
            int id= item[0];
            int score= item[1];
            
            if(treeMap.containsKey(id))
            {
                PriorityQueue<Integer> heap= treeMap.get(id);
                
                heap.offer(score);
                if(heap.size()>5)
                {
                    heap.poll();
                }
                treeMap.put(id,heap);
            }
            else
            {
                PriorityQueue<Integer> heap= new PriorityQueue();
                heap.offer(score);
                treeMap.put(id,heap);
            }
            
            
        }
        
        int[][] result= new int[treeMap.size()][2];
        for(int id: treeMap.keySet())
        {
            PriorityQueue<Integer> heap= treeMap.get(id);
            int sum=0;
            
            while(!heap.isEmpty())
            {
                sum+=heap.poll();
            }
            
            result[id-1][0]=id;
            result[id-1][1]=sum/5;
        }
        
        return result;
    }
}