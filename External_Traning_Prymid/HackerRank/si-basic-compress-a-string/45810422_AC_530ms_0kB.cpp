#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    int count=0;
    cin>>s;
    s=s+" ";
    for(int i=0;i<s.length()-1;i++){
      if(s[i]==s[i+1])
        count++;
      else{
        cout<<s[i]<<count+1;
        count=0;
      }
    }
    return 0;
}