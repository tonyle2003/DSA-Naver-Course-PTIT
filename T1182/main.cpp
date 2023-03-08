#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class DirectedGraph {
    private:
        vector<int> *adj;
        bool *visited;
    public:
        DirectedGraph(int vertices) {
            adj = new vector<int>[vertices + 1];
            visited = new bool[vertices + 1] {false};
        }

        ~DirectedGraph() {
            delete[] adj;
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
        }

        void breadthFirstSearch(int begin) {
            queue<int> q;
            q.push(begin);
            visited[begin] = true;
            while (q.empty() == false) {
                int front = q.front();
                q.pop();
                cout << front << " ";
                for (int vertice : adj[front]) {
                    if (visited[vertice] == false) {
                        q.push(vertice);
                        visited[vertice] = true;
                    }
                }
            }
            cout << endl;
        }
};

int main() {
    int t; cin >> t;
    while (t--) {
        int vertices, edges, begin;
        cin >> vertices >> edges >> begin;
        DirectedGraph graph(vertices);
        for (int i = 1; i <= edges; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        graph.breadthFirstSearch(begin);
    }
    return 0;
}