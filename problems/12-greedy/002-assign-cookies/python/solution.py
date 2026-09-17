class Solution:
    def findContentChildren(self, greed: list[int], cookies: list[int]) -> int:
        greed.sort()
        cookies.sort()

        child = 0
        cookie = 0

        while child < len(greed) and cookie < len(cookies):
            if cookies[cookie] >= greed[child]:
                child += 1
            cookie += 1

        return child
