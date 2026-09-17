def find_kth_largest(nums: list[int], k: int) -> int:
    target = len(nums) - k
    left, right = 0, len(nums) - 1

    while left <= right:
        pivot = partition(nums, left, right)
        if pivot == target:
            return nums[pivot]
        if pivot < target:
            left = pivot + 1
        else:
            right = pivot - 1
    raise ValueError("k is out of range")


def partition(nums: list[int], left: int, right: int) -> int:
    pivot_value = nums[right]
    store = left
    for i in range(left, right):
        if nums[i] <= pivot_value:
            nums[i], nums[store] = nums[store], nums[i]
            store += 1
    nums[store], nums[right] = nums[right], nums[store]
    return store
