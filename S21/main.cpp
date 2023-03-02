#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int n; cin >> n;
    long sum = 0;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
        sum += a[i] + abs(a[i]);
    }
    cout << sum << endl;
    return 0;  
}