#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int a,b,n,k,l;
      cin>>n;
      for(int i=0;i<n;i++){
        cin>>a>>b;
        k=(a>b)?a:b;
        l=(a>b)?b:a;
        cout<<k-l<<endl;
      }
      
}   