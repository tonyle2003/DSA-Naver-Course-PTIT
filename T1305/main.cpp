#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int test; cin >> test;
    while (test--) {
        int n; cin >> n;
        int array[n];
        for (int i = 0; i < n; i++) {
            cin >> array[i];
        }
        sort(array, array + n);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] - array[i] > 1)
                count += array[i + 1] - array[i] - 1;
        }
        cout << count << endl;
    }
    return 0;
}