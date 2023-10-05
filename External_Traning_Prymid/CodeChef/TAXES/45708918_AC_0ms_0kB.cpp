#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n,a;
    cin>>n;
    for(int i=0;i<n;i++){
      cin>>a;
        if(a>100){
          a-=10;
        }
      cout<<a<<endl;
    }
   return 0;
}       