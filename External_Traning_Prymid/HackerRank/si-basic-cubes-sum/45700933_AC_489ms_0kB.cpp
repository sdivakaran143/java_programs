#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a,sum=0;
    cin>>a;
    for(int i=1;i<=a;i++){
      sum+=i*i*i;
    }
   cout<<sum;
   return 0;
}       