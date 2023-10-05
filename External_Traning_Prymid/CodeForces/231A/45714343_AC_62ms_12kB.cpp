#include <bits/stdc++.h>
using namespace std;

int main() 
{
     int n,a,b,c;
     cin>>n;
     int isize=0; 
     for(int i=1;i<=n;i++){
        cin>>a>>b>>c;
        if((a+b+c)>1)
          isize++;
     }
     cout<<isize;
}   