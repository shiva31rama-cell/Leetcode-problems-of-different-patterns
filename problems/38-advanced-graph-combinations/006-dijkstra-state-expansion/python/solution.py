import heapq
class Solution:
 def shortest_with_one_discount(self,n,edges,s,t):
  g=[[] for _ in range(n)]
  for u,v,w in edges:g[u].append((v,w))
  inf=10**30; d=[[inf]*2 for _ in range(n)];d[s][0]=0;q=[(0,s,0)]
  while q:
   dist,u,used=heapq.heappop(q)
   if dist!=d[u][used]:continue
   for v,w in g[u]:
    if dist+w<d[v][used]:d[v][used]=dist+w;heapq.heappush(q,(d[v][used],v,used))
    if not used and dist+w//2<d[v][1]:d[v][1]=dist+w//2;heapq.heappush(q,(d[v][1],v,1))
  return min(d[t])
