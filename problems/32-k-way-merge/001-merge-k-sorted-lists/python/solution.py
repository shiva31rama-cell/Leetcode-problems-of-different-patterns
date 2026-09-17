import heapq


def merge_k_sorted_lists(lists: list[list[int]]) -> list[int]:
    heap = []
    result = []

    for list_id, values in enumerate(lists):
        if values:
            heapq.heappush(heap, (values[0], list_id, 0))

    while heap:
        value, list_id, index = heapq.heappop(heap)
        result.append(value)
        next_index = index + 1
        if next_index < len(lists[list_id]):
            heapq.heappush(heap, (lists[list_id][next_index], list_id, next_index))

    return result
