#include <bits/stdc++.h>
using namespace std;
int main() 
{
    long int r,c;cin>>r>>c;
    vector<vector<int>> v(r,vector<int>(c));
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        cin>>v[i][j];
      }
    }
    for(int i=0;i<c;i++){
      long sum=0;
      for(int j=0;j<r;j++){ 
        sum+=v[j][i];
      }
      cout << sum <<"\n";
    }
    return 0;
}