/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_OOP;

/**
 *
 * @author cong0
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BSTree {
    
    Node root;
    Person a[] = new Person[100];
    int k=0;
    public BSTree() {
        this.root = null;
    }
    
    boolean isEmpty() {
        return root == null;
    }
    
    void insert(String xName, int xAge) {
        if (xName.charAt(0) == 'B') {
            return;
        }
        a[k] = new Person(xName, xAge);
        k++;
        if (isEmpty()) {
            root = new Node(xName, xAge);
            return;
        }
        Node t, p;
        p = root;
        t = null;
        while (p != null) {
            if (p.info.name.equals(xName)) {
                System.out.println("The key " + xName + "already exists, no insertion");
                return;
            }
            t = p;
            if (p.info.name.compareTo(xName) > 0) {
                p = p.left;
            } else if (p.info.name.compareTo(xName) < 0) {
                p = p.right;
            }
            
        }
        if (t.info.name.compareTo(xName) > 0) {
            t.left = new Node(xName, xAge);
        } else {
            t.right = new Node(xName, xAge);
        }
    }
    
    int sum(Node p) {
        if (p == null) {
            return 0;
        }
        return p.info.age + sum(p.left) + sum(p.right);
    }
    
    int count(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + count(p.left) + count(p.right);
    }
    
    double average() {
        return 1.0 * sum(root) / count(root);
    }
    
    void Save_array(Node p, Double t, FileWriter a) throws IOException {
        if (p == null) {
            return;
        }
        if (p.info.age < t) {
            a.write(p.info+"\n");
        }
        Save_array(p.left, t, a);
        Save_array(p.right, t, a);
    }
    
    void Save(Node p) throws IOException {
        double t = average();
        FileWriter wt = new FileWriter("q2.txt");
        Save_array(p, t, wt);
        wt.close();
    }
    
    void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.println(p.info.toString());
    }
    void visit_AVL(Node p) {
        if (p == null) {
            return;
        }
        System.out.println(p.info.toString()+" -- AVL : "+caculator_AVL(p));
    }
    
    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    
    int heightTree(Node p) {
        if (p == null) {
            return 0;
        }
        int left = heightTree(p.left);
        int right = heightTree(p.right);
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
    int caculator_AVL(Node p){
        return Math.abs(heightTree(p.left)-heightTree(p.right));
    }
    int count_node(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + count_node(p.left) + count_node(p.right);
    }
    
    void delete_root() {
        if (isEmpty()) {
            return;
        }
        if (root.left == null) {
            root = root.right;
        } else if (root.right == null) {
            root = root.left;
        } else {
            Node copy = root.left;
            Node ParentCopy = null;
            while (copy.right != null) {
                ParentCopy = copy;
                copy = copy.right;
            }
            // copy luon khac null
            // parentcopye co the bang null
            root.info = new Person(copy.info.name, copy.info.age);
            if (ParentCopy == null) {
                root.left = copy.left;
            } else {
                ParentCopy.right = copy.left;
            }
        }
    }
    
    void delete(String x) {
        // tim Node p chua x
        // chia truong hop de xoa p
        if (isEmpty()) {
            return;
        }
        Node p = root;
        Node parent = null;
        while (p != null) {
            if (p.info.name.equals(x)) {
                break;
            }
            parent = p;
            if (p.info.name.compareTo(x) > 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        // p = null hoac la Node chua x 
        if (p == null) {
            return;
        }
        // x co trong cay , can xoa x
        // TH1 : p khong co con
        if (p.left == null && p.right == null) {
            if (parent == null) {
                root = null;
                return;
            }
            if (parent.left == p) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // TH2 : p co 1 con
        if ((p.left != null && p.right == null) || (p.left == null && p.right != null)) {
            if (p.left != null && p.right == null) {
                parent.left = p.left;
            } else {
                parent.right = p.right;
            }
        }
        // TH3 : p co 2 con
        if (p.left != null && p.right != null) {
            // tim rightmost cua p.L
            // copy info của rightmost vao p
            // xoa rightmost
            Node rm = p.left;
            Node parentRM = null;
            while (rm.right != null) {
                parentRM = rm;
                rm = rm.right;
            }
            // rm luon khac null
            // parentRM co the bang null
            p.info = new Person(rm.info.name, rm.info.age);
            if (parentRM == null) {
                p.left = rm.left;
            } else {
                parentRM.right = rm.left;
            }
        }
    }
    
    void breadth() {
//        double c = average();
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            if(a[i].age>c){
//                count++;
//                if(count==2){
//                    delete(a[i].name);
//                    k--;
//                }
//            }
//        }
        if (isEmpty()) {
            return;
        }
        int count  = 0;
        MyQueue queue = new MyQueue();
        queue.enqueue(root);
        Node cur;
        double c = average();
        while (!queue.isEmpty()) {
            cur = (Node) queue.dequeue();
            if(cur.info.age>c){
                count++;
                
            }
            if(count==2){
                    delete(cur.info.name);
                    
            }
            else{
            visit(cur);
            }
            System.out.println("");
            if (cur.left != null) {
                queue.enqueue(cur.left);
            }
            if (cur.right != null) {
                queue.enqueue(cur.right);
            }
        }
        System.out.println();
    }
    void breadth_AVL() {
        if (isEmpty()) {
            return;
        }
        MyQueue queue = new MyQueue();
        queue.enqueue(root);
        Node cur;
        while (!queue.isEmpty()) {
            cur = (Node) queue.dequeue();
            visit_AVL(cur);
            System.out.println("");
            if (cur.left != null) {
                queue.enqueue(cur.left);
            }
            if (cur.right != null) {
                queue.enqueue(cur.right);
            }
        }
        System.out.println();
    }
    // test
    Node t ;
    void preOrder1(Node p){
        if(p==null){
            return ;
        }
        else if (p.info.age>=10){
            t = p;
            return;
        }
        else{
            preOrder1(p.left);
            preOrder1(p.right);
        }
        
    }
    void deleteParent(){
       if(root==null){
           return;
       }
       Node p = root;
       Node parent = null;
       while(p!=null){
           if(p.info.name.compareTo(t.info.name)==0){
               break;
           }
           parent = p;
           if(p.info.name.compareTo(t.info.name)>0){
               p=p.left;
           }else{
               p=p.right;
           }
       }
       if(parent==null){
           return;
       }
        delete(parent.info.name);
    }
    
    
}
