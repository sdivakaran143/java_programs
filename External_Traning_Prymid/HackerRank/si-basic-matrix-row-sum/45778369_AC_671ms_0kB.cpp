#include <bits/stdc++.h>
using namespace std;
int main() 
{
    long int r,c;cin>>r>>c;
    vector<vector<int>> v(r,vector<int>(c));
    for(int i=0;i<r;i++){
      long sum=0;
      for(int j=0;j<c;j++){ 
        cin>>v[i][j];
        sum+=v[i][j];
      }
      std::cout << sum << std::endl;
    }
    return 0;
}