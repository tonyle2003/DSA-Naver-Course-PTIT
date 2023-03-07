#include <iostream>
#include <vector>

using namespace std;

class Graph {
    private:
        vector<vector<int>> adjacency;
    public:
        Graph(int vertices) {
            for (int i = 0; i <= vertices; i++) {
                vector<int> newElement;
                adjacency.push_back(newElement);
            }
        }

        void add(int begin, int end) {
            adjacency[begin].push_back(end);
        }

        void show() {
            for (int i = 1; i < (int)adjacency.size(); i++) {
                cout << i << ": ";
                for (int element : adjacency[i]) {
                    cout << element << " ";
                }
                cout << endl;
            }
        }
};

int main() {
    int t; cin >> t;
    while (t--) {
        int v, e;
        cin >> v >> e;
        Graph graph(v);
        while (e--) {
            int begin, end;
            cin >> begin >> end;
            graph.add(begin, end);
        }
        graph.show();
    }
    return 0;
}