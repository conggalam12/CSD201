/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        int[][] b = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0}};
        graph.setData(b);
        graph.display();
        //graph.breath(0);
       // graph.depthFirst(0);
    }
}


