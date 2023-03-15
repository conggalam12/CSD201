/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author cong0
 */
public class my_list {

    Node head;
    Node tail;

    public my_list() {
        head = null;
        tail = null;

    }

    boolean isEmpty() {
        return head == null;
    }

    void addRandom(int a, int x) {// a la vi tri , x la gia tri can them
        Node t = new Node(x);
        Node p = head;
        Node p1 = null;
        int i = 0;
        while (p != null) {
            if (i == a) {
                break;
            }
            p1 = p;
            p = p.next;
            i++;
        }
        p1.next = t;
        t.next = p;
    }

    void delete(Node a) {
        Node p = head;
        Node p1 = null;
        int i = 0;
        while (p != null && p != a) {
            p1 = p;
            p = p.next;
            i++;
        }
        p1.next = p.next;
    }

    Node get(int i) {
        Node p = head;
        int a = 1;
        while (p != null && a != i) {
            a++;
            p = p.next;
        }
        return p;
    }

    // Homework
    void addFirst(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    void addLast(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    void addAfter(Node c, int a) {
        Node p = head;
        int i = 0;
        while (p != null&& p.x != c.x) {
//            if( p.x == c.x){
//                break;
//            }
            i++;
            p = p.next;
            
        }
        addRandom(i + 1, a);
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.x + "\t");
            p = p.next;
        }
        System.out.println("");
    }

    int deleteFromHead() {
        Node p = head;
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            head = head.next;
        }
        return p.x;
    }

    int deleteFromTail() {
        Node p = tail;
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            delete(tail);
        }
        return p.x;
    }

    int deleteAfter(Node p) {
        int i = 1;
        Node p1 = head;
        while (p1 != null) {
            i++;
            p1 = p1.next;
            if (p.x == p1.x) {
                Node t = p1.next;
                delete(p1.next);
                return t.x;
            }
        }
        return 0;
    }

    void dele(int x) {
        Node a = new Node(x);
        Node p = head;
        Node t = null;
        if (p.x != x) {
            while (p != null && p.x != x) {
                t = p;
                p = p.next;
            }
            delete(t.next);
        } else {
            deleteFromHead();
        }
    }

    Node search(int x) {
        Node p = head;
        while (p != null && p.x != x) {
            p = p.next;
        }
        return p;
    }

    int count() {
        int i = 0;
        Node p = head;
        while (p != null) {
            i++;
            p = p.next;
        }
        return i;
    }

    void dele_11(int x) {
        Node p = head;
        int i = 0;
        if (x == 1) {
            deleteFromHead();
        }
        if (x > count()) {
            System.out.println("Not exist");
        } else {
            while (p != null && i != x - 1) {
                i++;
                p = p.next;
            }
            delete(p);
        }
    }

    void sort() {
        int a;
        Node b, c;
        for (int i = 1; i <= count(); i++) {
            b = get(i);
            for (int j = 1; j < i; j++) {
                c = get(j);
                if (c.x > b.x) {
                    a = b.x;
                    b.x = c.x;
                    c.x = a;
                }
            }
        }
    }

    void dele_13(Node p) {

        try {
            dele(p.x);
        } catch (Exception e) {
            System.out.println("Not exist");
        }

    }

    int[] toArray() {
        int[] a = new int[count()];
        Node p = head;
        int i = 0;
        while (p != null) {
            a[i] = p.x;
            p = p.next;
            i++;
        }
//        for (int j : a) {
//           System.out.print(j+"\t");
//        }
        return a;
    }

    void addBefore(Node c, int x) {
        Node p = head;
        if (p.x != c.x) {
            int i = 0;
            while (p != null && p.x != c.x) {
                i++;
                p = p.next;
            }
            addRandom(i, x);
        } else {
            addFirst(x);
        }
    }

    int max() {

        Node p = head;
        int i = p.x;
        while (p != null) {
            if (i < p.x) {
                i = p.x;
                
            }p = p.next;
        }
        return i;
    }

    int min() {
        Node p = head;
        int i = p.x;
        while (p != null) {
            if (i > p.x) {
                i = p.x;
            }
            p = p.next;
        }
        return i;
    }
    int sum() {
        Node p = head;
        int i =0;
        while (p != null) {
            i+=p.x;
            p = p.next;
        }
        return i;
    }
    double avg(){
        int a = sum();
        return a*1.0/count();
    }
    boolean sorted(){
        int a,b;
        Node p = head;
        while (p.next!= null) {
            a = p.x ;
            b = p.next.x;
            if(a>b){
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
