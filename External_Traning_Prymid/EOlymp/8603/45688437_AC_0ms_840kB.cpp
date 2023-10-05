#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int a,sum=0,product=1;
  cin>>a;
  while(a!=0){
    int n=a%10;
    sum+=n;
    product*=n;
    a=a/10;
  }
    cout<<sum<<" "<<product;
    return 0;
}       