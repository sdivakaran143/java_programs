#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int a,n;cin>>n;
      for(int i=0;i<n;i++){
        cin>>a;
        a=a*50;
        cout<<a-((a/10)*2+(a/10)*2+(a/10)*3)<<endl; 
      }
}   