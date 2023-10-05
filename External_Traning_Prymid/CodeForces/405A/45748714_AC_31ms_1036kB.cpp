#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int s;cin>>s;
    vector<int> v(s);
    for(int i=0;i<s;i++){
      cin>>v[i];
    }
    sort(v.begin(),v.end());
    for(int i:  v){
      cout<<i<<" ";
    }
    return 0;
}       