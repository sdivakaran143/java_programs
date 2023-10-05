#include <bits/stdc++.h>
using namespace std;

int main() 
{
    long long int a;cin>>a;
    string s=to_string(a);
    char ch=s[0];
    s[0]=s[s.length()-1];
    s[s.length()-1]=ch;
    a=stoi(s);
    cout<<a;
    return 0;
}   