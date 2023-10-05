#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long int a;cin>>a;
    if(a<0){
      a=a*-1;
    }
    string s=to_string(a);
    cout<<s[0];
    return 0;
}   