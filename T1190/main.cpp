#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

class DirectedGraph {
    private:
        vector<int> *adj;
        bool *visited;
        int v;
    public:
        DirectedGraph(int v) {
            adj = new vector<int>[v + 1];
            visited = new bool[v + 1];
            for (int i = 1; i <= v; i++) {
                visited[i] = false;
            }
            this->v = v;
        }

        ~DirectedGraph() {
            delete[] adj;
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
        }

        void dfs(int begin) {
            visited[begin] = true;
            for (int v : adj[begin]) {
                if (visited[v] == false) {
                    dfs(v);
                }
            }
        }

        bool isStronglyConnected() {
            for (int i = 1; i <= v; i++) {
                dfs(i);
                for (int j = 1; j <= v; j++) {
                    if (visited[j] == false) {
                        return false;
                    }
                }
                for (int j = 1; j <= v; j++) {
                    visited[j] = false;
                }
            }
            return true;
        }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int v, e;
        cin >> v >> e;
        DirectedGraph graph(v);
        for (int i = 1; i <= e; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        if (graph.isStronglyConnected() == true) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}