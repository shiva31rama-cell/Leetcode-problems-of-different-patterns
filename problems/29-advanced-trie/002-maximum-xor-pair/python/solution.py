class Solution:
    def find_maximum_xor(self, nums: list[int]) -> int:
        if len(nums) < 2:
            return 0

        root: dict[int, dict] = {}

        def insert(value: int) -> None:
            node = root
            for bit in range(30, -1, -1):
                current_bit = (value >> bit) & 1
                node = node.setdefault(current_bit, {})

        def best_xor(value: int) -> int:
            node = root
            result = 0

            for bit in range(30, -1, -1):
                current_bit = (value >> bit) & 1
                wanted_bit = current_bit ^ 1

                if wanted_bit in node:
                    result |= 1 << bit
                    node = node[wanted_bit]
                else:
                    node = node[current_bit]

            return result

        answer = 0
        insert(nums[0])

        for value in nums[1:]:
            answer = max(answer, best_xor(value))
            insert(value)

        return answer
