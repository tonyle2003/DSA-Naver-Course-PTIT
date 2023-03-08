#include <iostream>
#include <vector>

using namespace std;

class UndirectedGraph {

    private:
        vector<int> *adj;
        bool *visited;

    public:

        UndirectedGraph(int v) {
            adj = new vector<int>[v + 1];
            visited = new bool[v + 1];
            for (int i = 0; i <= v; i++) {
                visited[i] = false;
            }
        }
        
        ~UndirectedGraph() {
            delete[] adj;
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
            adj[second].push_back(first);
        }

        void dfs(int begin, int end, string path) {
            path += to_string(begin) + " ";
            visited[begin] = true;
            if (visited[end] == true) {
                cout << path << endl;
                return;
            }
            for (int v : adj[begin]) {
                if (visited[v] == false && visited[end] == false) {
                    dfs(v, end, path);
                }
            }
        }

        void dfsPathFinding(int begin, int end) {
            dfs(begin, end, "");
            if (visited[end] == false) {
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
        graph.dfsPathFinding(begin, end);
    }
    return 0;
}