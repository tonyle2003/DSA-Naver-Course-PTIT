#include <iostream>
#include <vector>

using namespace std;

class UndirectedGraph {

    private:
        vector<int> *adj;
        bool *visited;
        vector<int> *path;

    public:

        UndirectedGraph(int v) {
            adj = new vector<int>[v + 1];
            visited = new bool[v + 1] {false};
            path = new vector<int>;
        }
        
        ~UndirectedGraph() {
            delete[] adj;
            delete[] visited;
            delete path;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
            adj[second].push_back(first);
        }

        void dfs(int begin, int end) {
            if (visited[end] == true) {
                return;
            }
            visited[begin] = true;
            path->push_back(begin);
            for (int v : adj[begin]) {
                if (visited[v] == false) {
                    dfs(v, end);
                }
            }
        }

        void dfsPath(int begin, int end) {
            dfs(begin, end);
            if (path->back() == end) {
                for (int v : *path) {
                    cout << v << " ";
                }
                cout << endl;
            } else {
                cout << -1 << endl;
            }
        }
};

int main() {
    int t; cin >> t;
    while (t--) {
        int v, e, begin, end;
        cin >> v >> e >> begin >> end;
        UndirectedGraph graph(v);
        for (int i = 1; i <= e; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        graph.dfsPath(begin, end);
    }
    return 0;
}