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

    public class MyGraph {

    int[][] a; //ma trận liền kề
    int n;// số lượng đỉnh(ssoo lương các dideemet trên dwuongd đi)(0-n-1)
    char[] v; // tên của đỉnh

    public MyGraph() {
        v = "ABCDEFGHIKLMN".toCharArray(); //A-0 B-1 C-2
    }

    public void setData(int[][] b) {

        n = b.length;
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + ": ");
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.print(v[j] + " ");
                }

            }
            System.out.println();

        }
    }

    void visit(int k) {
        System.out.print(v[k] + " ");
    }

    void breath(boolean[] enqueued, int k) {
        MyQueue q = new MyQueue();
        q.enqueue(new Integer(k));
        enqueued[k] = true;
        int h;
        while (!q.isEmpty()) {
            h = Integer.parseInt((q.dequeue()).toString().trim());
            visit(h);
            for (int i = 0; i < n; i++) {
                if ((!enqueued[i]) && a[h][i] > 0) {
                    q.enqueue(new Integer(i));
                    enqueued[i] = true;
                }
            }
        }
    }

    void breath(int k) {
        MyQueue q = new MyQueue();
        boolean[] enqueued = new boolean[n];
        for (int i = 0; i < n; i++) {
            enqueued[i] = false;
        }
        breath(enqueued, k);
        for (int i = 0; i < n; i++) {
            if (!enqueued[i]) {
                breath(enqueued, i);
            }
        }
        System.out.println();

    }

    void depthFirst(boolean visited[], int i) {
        visit(i);
        visited[i] = true;
        int j;
        for (j = 0; j < n; j++) {
            if (a[i][j] > 0 && (!visited[j])) {
                depthFirst(visited, j);
            }
        }
    }

    void depthFirst(int k) {
        int i;
        boolean[] visited = new boolean[20];
        for (i = 0; i < n; i++) {
            visited[i] = false;
        }
        depthFirst(visited, k);
        for (i = 0; i < n; i++) {
            if (!visited[i]) {
                depthFirst(visited, i);
            }
        }
        System.out.println();
    }
}

