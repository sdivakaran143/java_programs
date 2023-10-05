#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long long int n,l,s;
   cin>>n;
   for(int i=0;i<n;i++){
      string output="";    
      cin>>l;
      vector <int> v(l);
      for(int j=0;j<l;j++){
        cin>>v[j];
      }
      sort(v.begin(),v.end());
      
      for(int j=0;j<l;j++){
        if((output.find(to_string(v[j]))==string::npos)){
          output+=to_string(v[j])+" ";
        };
      }
    cout<<output;
    cout<<"\n";
   }
    return 0;
}       