#include <bits/stdc++.h>
using namespace std;

int main() 
{
      int a,b,c;
      cin>>a>>b>>c;
      int arr[]={a,b,c};
      sort(begin(arr), end(arr));
      cout<<arr[0]<<" "<<arr[1]<<" "<<arr[2]<<endl;
    return 0;
}   