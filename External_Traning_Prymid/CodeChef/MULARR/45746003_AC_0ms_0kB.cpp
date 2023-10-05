#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long long int n,s,m;
   cin>>n;
    while(n--){
      long product=1;
      cin>>s;
      while(s--){
        cin>>m;
        product*=m;
      }
    cout<<product<<endl;
    }
    return 0;
}       