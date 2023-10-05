#include <bits/stdc++.h>
using namespace std;

int main() 
{
     string s;
     cin>>s;
     int od=s[s.length()-1]-'0';
     int td=((s[s.length()-2]-'0')*10)+od;
     int thd=((s[s.length()-3]-'0')*100)+td;
    if(od%2==0)
      cout<<"Yes\n";
    else
      cout<<"No\n";
    if(td%4==0)
      cout<<"Yes\n";
    else
      cout<<"No\n";
    if(thd%8==0)
      cout<<"Yes\n";
    else
      cout<<"No\n";

  return 0;
} 