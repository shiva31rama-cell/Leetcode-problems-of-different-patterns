import java.util.*;
public class Solution {
 int time; int[] tin,low; boolean[] cut; List<Integer>[] g;
 public List<Integer> articulationPoints(int n,int[][] edges){g=new ArrayList[n];for(int i=0;i<n;i++)g[i]=new ArrayList<>();for(int[]e:edges){g[e[0]].add(e[1]);g[e[1]].add(e[0]);}tin=new int[n];low=new int[n];cut=new boolean[n];Arrays.fill(tin,-1);for(int i=0;i<n;i++)if(tin[i]<0)dfs(i,-1);List<Integer>a=new ArrayList<>();for(int i=0;i<n;i++)if(cut[i])a.add(i);return a;}
 void dfs(int v,int p){tin[v]=low[v]=time++;int children=0;for(int to:g[v]){if(to==p)continue;if(tin[to]>=0)low[v]=Math.min(low[v],tin[to]);else{dfs(to,v);low[v]=Math.min(low[v],low[to]);if(p!=-1&&low[to]>=tin[v])cut[v]=true;children++;}}if(p==-1&&children>1)cut[v]=true;}
}