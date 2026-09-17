from functools import lru_cache
class Solution:
    def count(self,n,mod):
        if n<0:return 0
        digits=list(map(int,str(n)))
        @lru_cache(None)
        def dfs(pos,tight,started,r):
            if pos==len(digits): return int(started and r==0)
            limit=digits[pos] if tight else 9; ans=0
            for x in range(limit+1):
                nt=tight and x==limit
                ns=started or x!=0
                nr=(r*10+x)%mod if ns else 0
                ans+=dfs(pos+1,nt,ns,nr)
            return ans
        return dfs(0,True,False,0)
