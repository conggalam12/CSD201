/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author cong0
 */
import java.util.Queue ;
public class BSTree {

    Node root;

    public BSTree() {
        this.root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void clear() {
        root = null;
    }

    Node search(int x) {
        if (isEmpty()) {
            return null;
        }
        Node p = root;
        while (p != null) {
            if (p.value == x) {
                return p;
            }
            if (p.value < x) {
                p = p.left;
            }
            if (p.value > x) {
                p = p.right;
            }
        }
        return null;
    }

    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node t, p;
        p = root;
        t = null;
        while (p != null) {
            if (p.value == x) {
                System.out.println("The key " + x + "already exists, no insertion");
                return;
            }
            t = p;
            if (x < p.value) {
                p = p.left;
            } else if (x > p.value) {
                p = p.right;
            }

        }
        if (x < t.value) {
            t.left = new Node(x);
        } else {
            t.right = new Node(x);
        }
    }

    void breadth() {
        if(isEmpty()) return;
        MyQueue q = new MyQueue();
        
    }

    void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.println(" " + p.value);
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    int count_node(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + count_node(p.left) + count_node(p.right);
    }

    int count() {
        return count_node(root);
    }

    Node min() {
        Node p, f = null;
        p = root;
        while (p != null) {
            f = p;
            p = p.left;
        }
        return f;
    }

    Node max() {
        Node p, f = null;
        p = root;
        while (p != null) {
            f = p;
            p = p.right;
        }
        return f;
    }

    int count_sum(Node p) {
        if (p == null) {
            return 0;
        }
        return p.value + count_sum(p.left) + count_sum(p.right);
    }

    int sum() {
        return count_sum(root);
    }

    double avg() {
        return 1.0 * sum() / count();
    }

    void delete(int x) {
        // tim Node p chua x
        // chia truong hop de xoa p
        if (isEmpty()) {
            return;
        }
        Node p = root;
        Node parent = null;
        while (p != null) {
            if (p.value == x) {
                break;
            }
            parent = p;
            if(p.value>x){
                p = p.left;
            }else{
                p = p.right;
            }
        }
        // p = null hoac la Node chua x 
        if(p==null){
            return;
        }
        // x co trong cay , can xoa x
        // TH1 : p khong co con
        if(p.left==null && p.right==null){
            if(parent==null){
                root = null;
                return; 
            }
            if(parent.left==p){
                parent.left= null ;
            }
            else{
                parent.right = null;
            }
        }
        // TH2 : p co 1 con
         if((p.left!=null && p.right==null) ||(p.left==null && p.right!=null)) {
            if(p.left!=null && p.right==null){
                parent.left = p.left;
            }
            else{
                parent.right = p.right;
            }
        }
        // TH3 : p co 2 con
        if(p.left!=null && p.right!=null){
            // tim rightmost cua p.L
            // copy info của rightmost vao p
            // xoa rightmost
            Node rm = p.left;
            Node parentRM = null;
            while(rm.right!=null){
                parentRM = rm;
                rm = rm.right;
            }
            // rm luon khac null
            // parentRM co the bang null
            p.value= rm.value ;
            if(parentRM == null){
                p.left = rm.left;
            }
            else
                parentRM.right = rm.left;
        }
    }
    int heightTree(Node p){
        if(p == null){
            return 0;
        }
        int left = heightTree(p.left);
        int right = heightTree(p.right);
        if(left>right){
            return left +1;
        }else{
            return right+1 ;
        }
    }
    Node rotateRight(Node par){ // check null
        if(par==null || par.left==null){
            return null;
        }
        Node temp = par.left;
        Node c = temp.right;
        temp.right = par;
        par.left = c;
        return temp;
        
    }
    Node rotateLeft(Node par){
        if(par==null || par.right==null){
            return null;
        }
        Node temp = par.right;
        Node c = temp.left;
        temp.left = par;
        par.right = c;
        return temp;
    }
    int MaxCost(Node p){
        if(p == null){
            return 0;
        }
        int left = p.value+MaxCost(p.left);
        int right =p.value+ MaxCost(p.right);
        if(left>right){
            return left ;
        }
        return right;
    }
    boolean CheckAVL(Node p){
        if(p==null){
            return false;
        }
        else{
            if(Math.abs(heightTree(p.left)-heightTree(p.right))>=2){
                return false;
            }
        }
        return true;
    }
    // test
}
