#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a,b;
   cin>>a>>b;
    long long power=1;
    while(b--){
      power=power*a;
    }
    cout<<power<<endl;
    return 0;
}       