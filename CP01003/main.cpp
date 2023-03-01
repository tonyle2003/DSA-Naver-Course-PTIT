#include <iostream>
#include <math.h>

using namespace std;

bool isPrime(int number) {
    if (number == 1 || number == 0) {
        return false;
    }
    if (number == 2 || number == 3) {
        return true;
    }
    for (int i = 2; i <= sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}

bool isNaturalPrime(int number) {
    int sum = 0;
    int box = number;
    while (number != 0) {
        if (isPrime(number % 10) == false) {
            return false;
        }
        sum += number % 10;
        number /= 10;
    }
    return isPrime(sum) && isPrime(box);
}

int main() {
    int test;
    cin >> test;
    while (test--) {
        int a, b;
        cin >> a >> b;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isNaturalPrime(i)) {
                count++;
            }
        }
        cout << count << endl;
    }
    return 0;
}