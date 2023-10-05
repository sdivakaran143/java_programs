#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n,output=0;cin>>n;
    string s=to_string(n);
    int length=s.length();
    for(int i=0;i<length;i++){
      output=(output)+pow(s[i]-'0',length);
    }
    string out=(output==n)?"Yes":"No";
    cout<<out;
    return 0;
}   