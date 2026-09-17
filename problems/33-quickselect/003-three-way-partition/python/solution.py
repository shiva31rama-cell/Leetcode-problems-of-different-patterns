import random
class Solution:
    def kth_smallest(self, nums, k):
        target=k-1; left=0; right=len(nums)-1
        while left<=right:
            pivot=nums[random.randint(left,right)]
            lt=i=left; gt=right
            while i<=gt:
                if nums[i]<pivot: nums[lt],nums[i]=nums[i],nums[lt]; lt+=1; i+=1
                elif nums[i]>pivot: nums[i],nums[gt]=nums[gt],nums[i]; gt-=1
                else: i+=1
            if target<lt: right=lt-1
            elif target>gt: left=gt+1
            else: return pivot
        raise ValueError('k out of range')
