#include <iostream>

using namespace std;

int main() {
    int t; cin >> t;
    while (t--) {
        int n; cin >> n;
        int a[n - 1];
        int map[n + 1] = {0};
        for (int i = 0; i < n - 1; i++) {
            cin >> a[i];
            map[a[i]] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            if (map[i] == 0) {
                cout << i << endl;
            }
        }
    }
    return 0;
}