#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int a,n,max=INT_MIN;cin>>n;
   for(int i=0;i<n;i++){
      cin>>a;
      if(a>max){
        max=a;
      }
   }
   cout<<max<<"\n";
    return 0;
}       