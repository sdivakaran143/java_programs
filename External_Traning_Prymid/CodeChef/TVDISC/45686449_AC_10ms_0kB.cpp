#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int a,b,c,d,e;cin>>a;
  for(int i=0;i<a;i++){
    cin>>b>>c>>d>>e;
    
    if((b-d)>(c-e)){
      cout<<"Second"<<endl;
    }else if((b-d)<(c-e)){
      cout<<"First"<<endl;
    }else{
      cout<<"Any"<<endl;
    }
    
  }
    return 0;
}       