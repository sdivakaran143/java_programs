#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int count=0;
    string s;
    char ch;
    getline(cin,s);
    for(int i=0;i<s.length();i++){
      if(!isdigit(s[i])){
        cout<<"No";
        return 0;
      }
    }
    cout<<"Yes";
    return 0;
}