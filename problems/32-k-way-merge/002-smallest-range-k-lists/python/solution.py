import heapq
class Solution:
    def smallest_range(self, nums):
        heap=[]; current_max=-10**30
        for i, arr in enumerate(nums):
            heapq.heappush(heap,(arr[0],i,0)); current_max=max(current_max,arr[0])
        best=(heap[0][0],current_max)
        while len(heap)==len(nums):
            value,i,j=heapq.heappop(heap)
            if current_max-value < best[1]-best[0]: best=(value,current_max)
            j+=1
            if j==len(nums[i]): break
            nxt=nums[i][j]; heapq.heappush(heap,(nxt,i,j)); current_max=max(current_max,nxt)
        return list(best)
