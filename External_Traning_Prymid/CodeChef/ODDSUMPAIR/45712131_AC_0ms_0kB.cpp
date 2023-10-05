#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int n,a,b,c,d;cin>>n;
      for(int i=0;i<n;i++){
        d=0;
        cin>>a>>b>>c;
        if((a+b)%2==1){
          d++;
        }
        if((b+c)%2==1){
          d++;
        }
        if((a+c)%2==1){
          d++;
        }
        if(d>=2){
          cout<<"YES\n";
        }else{
          cout<<"NO\n";
        }
      }
}   