#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int n;
      string s;
      string out;
      cin>>n;
      for(int i=1;i<=n;i++){
        cin>>s;
        if(10>=s.length()){
        cout<<s<<endl;
          continue;
        }
        out=s[0]+to_string(s.length()-2)+s[s.length()-1];
        cout<<out<<endl;
      }  
      
}   