from collections import Counter
import heapq


class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        frequency = Counter(nums)

        # Keep only the k most frequent values.
        heap = []
        for value, count in frequency.items():
            heapq.heappush(heap, (count, value))

            if len(heap) > k:
                heapq.heappop(heap)

        return [value for count, value in heap]
