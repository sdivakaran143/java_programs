#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int n,a,b,c,d;
      cin>>n;
     for(int i=0;i<n;i++){
        cin>>a>>b>>c>>d;
        if(a<=c&&b<=d){
          cout<<"POSSIBLE"<<endl;
        }else{
          cout<<"IMPOSSIBLE"<<endl;
        }
     }
      
}   