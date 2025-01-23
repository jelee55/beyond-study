package com.beyond.graph;

import com.beyond.graph.practice.LinkedListGraph;
import com.beyond.graph.practice.MatrixGraph;

public class Application {
    public static void main(String[] args) {
        // 인접 행렬 테스트
        MatrixGraph matrixGraph = new MatrixGraph(4);

        // addEdge() 메소드
        matrixGraph.addEdge(0, 1, 30);
        matrixGraph.addEdge(0, 2, 20);
        matrixGraph.addEdge(1, 2, 50);
        matrixGraph.addEdge(2, 3, 70);

        System.out.println(matrixGraph);
        System.out.println();

        // removeEdge() 메소드
        matrixGraph.removeEdge(0, 1);
        System.out.println(matrixGraph);
        System.out.println();


        // 인접 리스트 테스트
        LinkedListGraph listGraph = new LinkedListGraph(4);

        // addEdge() 메소드
        listGraph.addEdge(0, 1, 30);
        listGraph.addEdge(0, 2, 30);


        System.out.println(listGraph);
        System.out.println();


        // removeEdge() 메소드
        listGraph.removeEdge(0, 1);
        listGraph.removeEdge(0, 2);


        System.out.println(listGraph);
        System.out.println();

        // 그래프 탐색
        listGraph.addEdge(0, 1, 30);
        listGraph.addEdge(0, 2, 40);
        listGraph.addEdge(1, 2, 50);
        listGraph.addEdge(2, 0, 60);
        listGraph.addEdge(2, 3, 70);
        listGraph.addEdge(3, 3, 80);

        System.out.println(listGraph);
        System.out.println();

        // 깊이 우선 탐색 (시작 꼭짓점 2)
        listGraph.depthFirstSarch(2);
        System.out.println();

        // 너비 우선 탐색 (시작 꼭짓점은 2 )
        listGraph.breadthFirstSearch(2);
        System.out.println();
    }
}
