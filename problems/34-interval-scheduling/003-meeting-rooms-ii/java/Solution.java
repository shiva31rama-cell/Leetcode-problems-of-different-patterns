import java.util.*;
public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> ends = new PriorityQueue<>();
        int answer=0;
        for(int[] meeting:intervals){
            while(!ends.isEmpty() && ends.peek()<=meeting[0]) ends.poll();
            ends.add(meeting[1]); answer=Math.max(answer,ends.size());
        }
        return answer;
    }
}