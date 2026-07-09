// Last updated: 09/07/2026, 09:50:01
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int x = pq.poll();//largest
            int y = pq.poll();//second largest

            if(x==y){
                continue;
            }
            if(x!=y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
        
    }
}