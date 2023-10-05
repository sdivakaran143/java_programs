#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long long n,val,temp=-1;cin>>n>>val;
   vector <int> v(n);
   for(int i=0;i<n;i++){
      cin>>v[i];
   }
   
   for(int i=0;i<n;i++){
      if(val==v[i]){
        temp=i;
        break;
      }
   }
    cout<<temp<<endl;
    return 0;
}       