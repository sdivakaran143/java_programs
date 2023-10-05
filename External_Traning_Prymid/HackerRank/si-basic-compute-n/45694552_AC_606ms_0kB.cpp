#include <bits/stdc++.h>
using namespace std;
int main() 
{
    int a,sum=1;
    cin>>a;
    for(int i=2;i<=a;i++){
      sum*=i;
    }
    cout<<sum;
    return 0;
}