class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }

        boolean visited[]=new boolean[numCourses];
        boolean stack[]=new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, visited, stack, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(ArrayList<ArrayList<Integer>> graph,boolean[] visited,boolean[] stack,int curr) {

        visited[curr] = true;
        stack[curr] = true;

        for (int neighbor : graph.get(curr)) {

            if (!visited[neighbor]) {
                if (hasCycle(graph, visited, stack, neighbor)) {
                    return true;
                }
            }
            else if (stack[neighbor]) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
}