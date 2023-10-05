#include <bits/stdc++.h>
using namespace std;
int main() 
{
    int a,b,sum=1;
    cin>>a;
    for(int i=1;i<=a;i++){
      cin>>b;
      if(b<10){
        cout<<"Thanks for helping Chef!"<<endl;
      }else{
        cout<<"-1"<<endl;
      }
    }
    return 0;
}