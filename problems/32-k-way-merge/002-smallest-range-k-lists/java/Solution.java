import java.util.*;
public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.size();i++) { int v=nums.get(i).get(0); pq.add(new int[]{v,i,0}); max=Math.max(max,v); }
        int bestL=pq.peek()[0], bestR=max;
        while (pq.size()==nums.size()) {
            int[] cur=pq.poll(); int min=cur[0];
            if ((long)max-min < (long)bestR-bestL) { bestL=min; bestR=max; }
            int ni=cur[2]+1;
            if (ni==nums.get(cur[1]).size()) break;
            int v=nums.get(cur[1]).get(ni); pq.add(new int[]{v,cur[1],ni}); max=Math.max(max,v);
        }
        return new int[]{bestL,bestR};
    }
}