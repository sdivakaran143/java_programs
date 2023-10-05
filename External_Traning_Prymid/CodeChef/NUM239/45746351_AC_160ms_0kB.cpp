#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int s;
    long int m,n;
   cin>>s;
    while(s--){
      int count=0;
      cin>>m>>n;
      for(int i=m;i<=n;i++){
        string s=to_string(i);
        if(s[s.length()-1]=='2'||s[s.length()-1]=='3'||s[s.length()-1]=='9'){
          count++;
        }
      }
      cout<<count<<"\n";
    }
    return 0;
}       