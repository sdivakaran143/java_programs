#include <bits/stdc++.h>
using namespace std;

int main() 
{
     float n,a,b;
     float o;
     cin>>n;
     for(int i=0;i<n;i++){
        cin>>a>>b;
        o=(a/100)*107.0;
        if(b<=o){
          cout<<"YES\n";
        }else{
          cout<<"NO\n";
        }
     }
}   