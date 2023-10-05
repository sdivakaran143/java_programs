#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int a,n,b;cin>>n;
      float c;
      for(int i=0;i<n;i++){
        cin>>a>>b;
        if(a<b){
          cout<<0<<"\n";
          continue;
        }
        c=a-b;
        c=ceil(c/4);
        cout<<c<<"\n";
      }
}   