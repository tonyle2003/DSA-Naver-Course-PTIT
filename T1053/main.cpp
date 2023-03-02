#include <iostream>
#include <algorithm>

using namespace std;

int binarySearch(int array[], int key, int begin, int end) {
    if (begin > end) {
        return -1;
    }
    int mid = (begin + end) / 2;
    if (array[mid] == key) {
        return mid + 1;
    } else if (array[mid] > key) {
        return binarySearch(array, key, begin, mid - 1);
    } else {
        return binarySearch(array, key, mid + 1, end);
    }
}

int main() {
    int test; cin >> test;
    while (test--) {
        int n, key;
        cin >> n >> key;
        int array[n];
        for (int i = 0; i < n; i++) {
            cin >> array[i];
        }
        int index = binarySearch(array, key, 0, n);
        if (index != -1) {
            cout << index << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}