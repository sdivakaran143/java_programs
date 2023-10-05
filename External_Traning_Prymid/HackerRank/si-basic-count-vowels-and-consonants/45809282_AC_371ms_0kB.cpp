#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int count=0,v=0,c=0;
    string s;
    string vowels="aeiou";
    getline(cin,s);
    for(int i=0;i<s.length();i++){
      char ch=tolower(s[i]);
      if (vowels.find(ch) != std::string::npos) {
        v++;
        continue;
      }
      c++;
    }
    cout<<v<<" "<<c;
    return 0;
}