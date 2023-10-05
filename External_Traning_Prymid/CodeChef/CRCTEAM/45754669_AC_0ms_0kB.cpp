#include <bits/stdc++.h>
using namespace std;

int main() 
{
   long n ,a;cin>>n;
    while(n--){
      int even=0,odd=0;
      cin>>a;
      for (int i=1;i<=a;i++){
        if(a%i==0&&i%2==0){
          even++;
        }
        else if(a%i==0&&i%2==1){
          odd++;
        }
      }
      if(even==odd){
        cout<<1<<endl;
      }else{
        cout<<0<<endl;
      }
    
    }
    return 0;
}       