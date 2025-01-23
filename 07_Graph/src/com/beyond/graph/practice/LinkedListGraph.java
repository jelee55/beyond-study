package com.beyond.graph.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListGraph {
    private int numOfVertices;
    List<List<Edge>> vertices;

    public LinkedListGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.vertices = new LinkedList<>();

        for (int i = 0; i < numOfVertices; i++) {
            this.vertices.add(new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        vertices.get(src).add(new Edge(dest, weight));

    }


    public void removeEdge(int src, int dest) {
        List<Edge> verice = vertices.get(src);

        for (Edge edge : verice) {
            if (edge.vertex == dest) {
                vertices.get(src).remove(edge);
                break;
            }
        }
//        for (Edge edge : vertices.get(src)) {
//            if (edge.vertex == dest) {
//                vertices.get(src).remove(edge);
//                break;
//            }
//        }
    }


    public void depthFirstSarch(int vertex) {
        boolean[] visited = new boolean[numOfVertices];

        depthFirstSarch(vertex, visited);
    }

    private void depthFirstSarch(int vertex, boolean[] visited) {
        System.out.print(vertex + " ");
        visited[vertex] = true;

        for (Edge edge : vertices.get(vertex)) {
            if (!visited[edge.vertex]) {
                depthFirstSarch(edge.vertex, visited);
            }
        }
    }

    public void breadthFirstSearch(int vertex) {
        boolean[] visited = new boolean[numOfVertices];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(vertex);
        while (!queue.isEmpty()) {
            vertex = queue.poll();

            System.out.print(vertex + " ");

            visited[vertex] = true;
            for (Edge edge : vertices.get(vertex)) {
                if (!visited[edge.vertex]) {
                    queue.add(edge.vertex);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vertices.size(); i++) {
            for (Edge edge : vertices.get(i)) {
                sb.append(String.format("Vertex %d -> Vertex %d (weight: %d)\n", i, edge.vertex, edge.weight));
            }
        }

        return sb.toString();
    }



    // int vertex, int weightprivate record Edge(int vertex, int weight){ }
    private static class Edge{
        private int vertex;
        private int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
