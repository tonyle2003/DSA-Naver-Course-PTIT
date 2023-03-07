#include <iostream>
#include <vector>

using namespace std;

class Graph {
    private:
        vector<vector<int>> adjacency;
    public:
        Graph(int vertices) {
            for (int i = 0; i <= vertices; i++) {
                vector<int> newVector;
                adjacency.push_back(newVector);
            }
        }

        void add(int begin, int end) {
            adjacency[begin].push_back(end);
        }

        void show() {
            for (int i = 1; i < (int) adjacency.size(); i++) {
                for (int element : adjacency[i]) {
                    cout << element << " ";
                }
                cout << endl;
            }
        }
};

int main() {
    int n;
    cin >> n;
    Graph graph(n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int data; cin >> data;
            if (data == 1) {
                graph.add(i + 1, j + 1);
            }
        }
    }
    graph.show();
    return 0;
}