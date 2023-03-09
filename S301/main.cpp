#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class DirectedGraph {
    private:
        vector<vector<int>> adj;
        bool *visited;
    public:
        DirectedGraph(int v) {
            vector<int> empty;
            visited = new bool[v + 1];
            for (int i = 0; i <= v; i++) {
                adj.push_back(empty);
                visited[i] = false;
            }
        }

        ~DirectedGraph() {
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
        }

        void bfs(int begin, int end) {
            queue<int> q;
            q.push(begin);
            queue<string> queuePath;
            queuePath.push(to_string(begin));
            visited[begin] = true;
            while(q.empty() == false) {
                int front = q.front();
                q.pop();
                string temp = queuePath.front();
                queuePath.pop();
                if (front == end) {
                    cout << temp << endl;
                    break;
                }
                for (int v : adj[front]) {
                    if (visited[v] == false) {
                        q.push(v);
                        visited[v] = true;
                        queuePath.push(temp + " -> " + to_string(v));
                    }
                }
            }
        }

        void bfsPath(int begin, int end) {
            bfs(begin, end);
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
        DirectedGraph graph(v);
        for (int i = 1; i <= e; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        graph.bfsPath(begin, end);
    }
    return 0;
}