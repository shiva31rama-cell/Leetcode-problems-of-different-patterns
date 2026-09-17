import java.util.*;
public class Solution {
    private int[] d; private int mod; private long[][][][] memo;
    public long count(long n,int mod){ if(n<0)return 0; this.mod=mod; d=Long.toString(n).chars().map(c->c-'0').toArray(); memo=new long[d.length][2][2][mod]; for(long[][][] a:memo)for(long[][] b:a)for(long[] c:b)Arrays.fill(c,-1); return dfs(0,1,0,0); }
    private long dfs(int p,int tight,int started,int r){ if(p==d.length)return started==1&&r==0?1:0; if(memo[p][tight][started][r]!=-1)return memo[p][tight][started][r]; long ans=0; int lim=tight==1?d[p]:9; for(int x=0;x<=lim;x++){int nt=tight==1&&x==lim?1:0; int ns=started==1||x!=0?1:0; int nr=ns==1?(r*10+x)%mod:0; ans+=dfs(p+1,nt,ns,nr);} return memo[p][tight][started][r]=ans; }
}