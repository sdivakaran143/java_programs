#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long long a,n,temp=0;cin>>n;
   vector <int> v(n);
   for(int i=0;i<n;i++){
      cin>>v[i];
   }
   for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(v[i]==v[j]){
          cout<<v[i];
          i=n;
          break;
        }
    }
   }
    return 0;
}       