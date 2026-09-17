import heapq
class Solution:
    def min_meeting_rooms(self, intervals):
        intervals.sort()
        ends=[]
        answer=0
        for start,end in intervals:
            while ends and ends[0] <= start: heapq.heappop(ends)
            heapq.heappush(ends,end)
            answer=max(answer,len(ends))
        return answer
