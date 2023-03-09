#include <iostream>
#include <queue>
#include <vector>

using namespace std;

class UndirectedGraph {
    private:
        vector<vector<int>> adj;
        bool *visited;
    public:
        UndirectedGraph(int v) {
            visited = new bool[v + 1];
            vector<int> empty;
            for (int i = 0; i <= v; i++) {
                adj.push_back(empty);
                visited[i] = false;
            }
        }

        ~UndirectedGraph() {
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
            adj[second].push_back(first);
        }

        void bfs(int begin) {
            queue<int> q;
            q.push(begin);
            visited[begin] = true;
            while (q.empty() == false) {
                int front = q.front();
                q.pop();
                for (int v : adj[front]) {
                    if (visited[v] == false) {
                        q.push(v);
                        visited[v] = true;
                    }
                }
            }
        }

        int element() {
            int count = 0;
            for (int i = 1; i < (int) adj.size(); i++) {
                if (visited[i] == false) {
                    bfs(i);
                    count++;
                }
            }
            return count;
        }
};

int main() {
    int t; cin >> t;
    while (t--) {
        int v, e;
        cin >> v >> e;
        UndirectedGraph graph(v);
        for (int i = 1; i <= e; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        cout << graph.element() << endl;
    }
    return 0;
}