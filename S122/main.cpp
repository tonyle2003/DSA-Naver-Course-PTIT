#include <iostream>
#include <set>
#include <algorithm>
#include <sstream>
#include <cstring>

using namespace std;

void getArrayWord(set<string> &set, string s) {
    stringstream ss{s};
    string word;
    while (ss >> word) {
        set.insert(word);
    }
}

int main() {
    string s1, s2;
    getline(cin, s1);
    getline(cin, s2);

    for (int i = 0; i < (int)s1.length(); i++) {
        s1[i] = tolower(s1[i]);
    }
    for (int i = 0; i < (int)s2.length(); i++) {
        s2[i] = tolower(s2[i]);
    }

    set<string> set1;
    getArrayWord(set1, s1);
    set<string> set2;
    getArrayWord(set2, s2);

    set<string> uniWords;

    for (string word : set1) {
        // if (set2.find(word) == set2.end()) {
            uniWords.insert(word);
        // }
    }
    for (string word : set2) {
        // if (set1.find(word) == set1.end()) {
            uniWords.insert(word);
        // }
    }

    for (string word : uniWords) {
        cout << word << " ";
    }
    cout << endl;

    for (string word : set1) {
        if (set2.find(word) != set2.end()) {
            cout << word << " ";
        }
    }
    cout << endl;

    return 0;
}