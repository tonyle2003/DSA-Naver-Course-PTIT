#include <iostream>
#include <vector>

using namespace std;

class UndirectedGraph {
    private:
        vector<int> *adj;
        bool *visited;
        int vertices;
    public:
        UndirectedGraph(int vertices) {
            adj = new vector<int>[vertices + 1];
            visited = new bool[vertices + 1] {false};
            this->vertices = vertices;
        }

        ~UndirectedGraph() {
            delete[] adj;
            delete[] visited;
        }

        void addEdge(int first, int second) {
            adj[first].push_back(second);
            adj[second].push_back(first);
        }

        void dfs(int begin) {
            visited[begin] = true;
            for (int vertice : adj[begin]) {
                if (visited[vertice] == false) {
                    dfs(vertice);
                }
            }
        }

        int element() {
            int count = 0;
            for (int i = 1; i <= vertices; i++) {
                if (visited[i] == false) {
                    dfs(i);
                    count++;
                }
            }
            return count;
        }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int vertices, edges;
        cin >> vertices >> edges;
        UndirectedGraph graph(vertices);
        for (int i = 1; i <= edges; i++) {
            int first, second;
            cin >> first >> second;
            graph.addEdge(first, second);
        }
        cout << graph.element() << endl;
    }
    return 0;
}