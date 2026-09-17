from collections import deque
class Solution:
 def path(self,n,edges,source,longest=False):
  g=[[] for _ in range(n)]; indeg=[0]*n
  for u,v,w in edges:g[u].append((v,w));indeg[v]+=1
  q=deque(i for i in range(n) if indeg[i]==0);order=[]
  while q:
   u=q.popleft();order.append(u)
   for v,_ in g[u]:indeg[v]-=1; q.append(v) if indeg[v]==0 else None
  inf=10**30; d=[-inf if longest else inf for _ in range(n)];d[source]=0
  for u in order:
   if d[u]==(-inf if longest else inf):continue
   for v,w in g[u]:d[v]=max(d[v],d[u]+w) if longest else min(d[v],d[u]+w)
  return d
