#include <bits/stdc++.h>
using namespace std;
int main() 
{
    long int r,c,count=0;cin>>r>>c;
    vector<vector<int>> v(r,vector<int>(c));
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        cin>>v[i][j];
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
            if(v[i][j]==0) count++;
      }
    }
    if(count>((r*c)-count)){
      cout<<"Yes";
    }else{
      cout<<"No";
    }
    return 0;
}