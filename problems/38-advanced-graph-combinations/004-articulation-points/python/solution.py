class Solution:
 def articulation_points(self,n,edges):
  g=[[] for _ in range(n)]
  for u,v in edges:g[u].append(v);g[v].append(u)
  tin=[-1]*n;low=[0]*n;cut=[False]*n;time=0
  def dfs(v,p):
   nonlocal time
   tin[v]=low[v]=time;time+=1;children=0
   for to in g[v]:
    if to==p:continue
    if tin[to]>=0:low[v]=min(low[v],tin[to])
    else:
     dfs(to,v);low[v]=min(low[v],low[to]);children+=1
     if p!=-1 and low[to]>=tin[v]:cut[v]=True
   if p==-1 and children>1:cut[v]=True
  for v in range(n):
   if tin[v]<0:dfs(v,-1)
  return [i for i,x in enumerate(cut) if x]
