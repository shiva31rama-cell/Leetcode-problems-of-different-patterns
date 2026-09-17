from functools import lru_cache


def num_dup_digits_at_most_n(n: int) -> int:
    digits = str(n)

    @lru_cache(maxsize=None)
    def dfs(pos: int, mask: int, tight: bool, started: bool) -> int:
        if pos == len(digits):
            return 1 if started else 0

        bound_digit = int(digits[pos])
        limit = bound_digit if tight else 9
        total = 0

        for digit in range(limit + 1):
            next_tight = tight and digit == bound_digit
            if not started and digit == 0:
                total += dfs(pos + 1, mask, next_tight, False)
            elif not (mask & (1 << digit)):
                total += dfs(pos + 1, mask | (1 << digit), next_tight, True)

        return total

    unique = dfs(0, 0, True, False)
    return n - unique
