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
public class main {
    public static void main(String[] args) {
        my_list list = new my_list();
        Node n = new Node(4);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(20);
        list.traverse();
        //list.addAfter(n, 0);
        //System.out.println(list.deleteFromHead());
        //System.out.println(list.deleteFromTail());
        //System.out.println(list.deleteAfter(n));
        //list.dele(4);
        //System.out.println(list.search(10).x);
        //list.dele_11(4);
        //list.sort();
        //list.dele_13(n);
        //int[] a = list.toArray();
        //list.addBefore(n, 0);
        //System.out.println(list.max());
        //System.out.println(list.min());
        //System.out.println(list.sum());
        //System.out.println(list.avg());
        System.out.println(list.sorted());
        list.traverse();
    }
}
