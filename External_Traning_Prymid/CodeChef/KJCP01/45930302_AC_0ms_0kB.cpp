#include <bits/stdc++.h>

using namespace std;
map<int,pair<int,int>>mp ;
bool comp(int a,int b)
{
    if(mp[a].first!=mp[b].first)
         return mp[a].first > mp[b].first;
    else
       return mp[a].second < mp[b].second;
}
int main()
{
  int i,n,m;
     cin>>n>>m;
      vector<int>v(n);
      for(i=0;i<n;i++)
      {
          cin>>v[i];
          mp[v[i]].first++;
          if(mp[v[i]].first==1)
          mp[v[i]].second=i;
      }
      sort(v.begin(),v.end(),comp);
      for(int i : v)
      {
          cout<<i<<" ";
      }
    return 0;
}