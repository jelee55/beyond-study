package com.beyond.graph.practice;

import java.util.Arrays;

public class MatrixGraph {
    private int numOfVertices; // 정점 개수
    private int[][] matrix; // 인접 행력로 사용될 2차원 2차원 배열

    public MatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        matrix = new int[numOfVertices][numOfVertices];
        
    }

    public void addEdge(int src, int dest, int weight) {
        // 행이 시작 꼭짓점
        // 열이 도착 꼭짓점
        this.matrix[src][dest] = weight;

        // 그래프가 방향이 없는 경우
        // this.matrix[dest][src] = weight;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void removeEdge(int src, int dest) {
        // 연경이 안 된 꼭짓점들은 0으로 표현
        this.matrix[src][dest] = 0;

        // 그래프가 방햐이 없는 경우
        // this.matrix[dest][src] = 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= 0) {
                    continue;
                }
                sb.append(String.format("Vertex %d -> Vertex %d(weigth : %d)\n", i, j, this.matrix[i][j]));
            }
        }
        return sb.toString();
    }
}
