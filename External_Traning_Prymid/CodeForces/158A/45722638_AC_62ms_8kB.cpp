#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    int participants[n];
    for (int i = 0; i < n; i++) {
        cin >> participants[i];
    }
    int count = 0;
    int kth_score = participants[k - 1];
    for (int i = 0; i < n; i++) {
        if (participants[i] >= kth_score && participants[i] > 0) {
            count++;
        } else 
            break;  
    }
    cout << count << endl;
    return 0;
}
