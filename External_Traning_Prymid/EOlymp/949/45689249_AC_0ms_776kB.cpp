#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int a;
   cin>>a;
   string b =to_string(a);
   cout<<((b[1]-'0')*10)+b[2]-'0';
    
    return 0;
}       