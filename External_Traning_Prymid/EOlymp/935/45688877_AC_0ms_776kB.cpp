#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int a,reverse=0;
    cin>>a;
    if(a<0) a=a*(-1);
    string s=to_string(a);
    for(int i=0;i<3;i++){
      cout<<s[i]<<endl;
    }
    return 0;
}       