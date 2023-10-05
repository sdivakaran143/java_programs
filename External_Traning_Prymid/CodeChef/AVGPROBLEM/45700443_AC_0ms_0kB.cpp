#include <bits/stdc++.h>
using namespace std;

int main() 
{
  float n,a,b,c;cin>>n;
    for(int i=0;i<n;i++){
      cin>>a>>b>>c;
      if(((a+b)/2)>c){
        cout<<"YES"<<endl;
      }else{
        cout<<"NO"<<endl;
      }
    }
    return 0;
}       