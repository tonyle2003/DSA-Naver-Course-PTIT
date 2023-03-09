#include <iostream>
#include <queue>
#include <vector>

using namespace std;

class UndirectedGraph {
    private:
        vector<int> *adj;
        bool *visited;
    public:
        UndirectedGraph(int vertices) {
            adj = new vector<int>[vertices + 1];
            visited = new bool[vertices + 1] {false};
        }

        ~UndirectedGraph() {
            delete[] adj;
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
            adj[second].push_back(first);
        }

        void BFSPath(int begin, int end) {
            BFS(begin, end, "");
            if (visited[end] == false) {
                cout << -1 << endl;
            }
        }

        void BFS(int begin, int end, string path) {
            queue<int> q;
            q.push(begin);
            visited[begin] = true;
            queue<string> paths;
            path = to_string(begin) + " ";
            paths.push(path);
            while (q.empty() == false) {
                int front = q.front();
                q.pop();
                if (front == end) {
                    cout << paths.front() << endl;
                    break;
                }
                string temp = paths.front();
                paths.pop();
                for (int vertice : adj[front]) {
                    if (visited[vertice] == false) {
                        q.push(vertice);
                        visited[vertice] = true;
                        paths.push(temp + to_string(vertice) + " ");
                    }
                }
            }
        }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int vertices, edges, begin, end;
        cin >> vertices >> edges >> begin >> end;
        UndirectedGraph graph(vertices);
        for (int i = 1; i <= edges; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        graph.BFSPath(begin, end);
    }
    return 0;
}