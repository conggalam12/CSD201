/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list_OOP;

import link_list.*;

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

//    void addRandom(int a, String name, int age) {// a la vi tri , x la gia tri can them
//        Node t = new Node(name, age);
//        Node p = head;
//        Node p1 = null;
//        int i = 0;
//        while (p != null) {
//            if (i == a) {
//                break;
//            }
//            p1 = p;
//            p = p.next;
//            i++;
//        }
//        p1.next = t;
//        t.next = p;
//    }

    void add(String name, int age, int a) {// a la index
        Node p = head;
        int i = 0;
        while (p != null) {
            if (i == a) {
                p.info = new person(name, age);
                break;
            }
            i++;
            p = p.next;
        }
    }

    void delete_20_first() {
        Node p = head;
        Node p1 = null;
        while (p != null && p.info.age != 20) {
            p1 = p;
            p = p.next;
        }
        p1.next = p.next;
    }
    void delete_20_last() {
        Node p = head;
        Node p1 = null;
        int a = 0 ;
        int i = 0;
        while (p != null ) {
            if(p.info.age==20){
                a+=1;
            }
            p = p.next;
        }
        p = head;
        while (p!=null) { 
            p1 = p;
            p = p.next;
            if(p.info.age==20){
                i+=1;
            }
            if(i==a){
                break;
            }
            
            
        }
        p1.next = p.next;
    }
//    Node get(int i) {
//        Node p = head;
//        int a = 1;
//        while (p != null && a != i) {
//            a++;
//            p = p.next;
//        }
//        return p;
//    }

    // Homework
//    void addFirst(String name,int age) {
//        Node p = new Node(name, age);
//        if (isEmpty()) {
//            head = tail = p;
//        } else {
//            p.next = head;
//            head = p;
//        }
//    }
    void addLast(String name, int age) {
        Node p = new Node(name, age);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    void display_5_first(){
        int count = 0;
        Node p = head;
        while (p != null && count != 5) {
            if (p.info.age > 22) {
                System.out.println(p.info.toString());
                count++;
            }
            p = p.next;
        }
    }
    void display_5_last(){
        int count = 0,i=0;
        Node p = head;
        while (p != null) {
            if (p.info.age > 22) {
               count++;
            }
            p = p.next;
        }
        p = head;
        person a[] = new person[count+1];
        while (p!=null) {            
             if (p.info.age > 22) {
               a[i] = p.info;
               i++;
            }
            p = p.next;
        }
        System.out.println("Info last 5 person having age > 22 : ");
        for (int j = count-5; j <count; j++) {
            System.out.println(a[j].toString());
            
        }
        
    }
    void display() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info.toString());
            p = p.next;
        }
    }

    void find_second() {
        int max = 0;
        int second_max = 0;
        Node p = head;
        while (p != null) {
            if (max < p.info.age) {
                second_max = max;
                max = p.info.age;
            }
            else if(p.info.age>second_max){
                second_max = p.info.age;
            }
            p = p.next;
        }
        p = head;
        while (p != null) {
            if (p.info.age == second_max) {
                System.out.println(p.info.toString());
                break;
            }
            p = p.next;
        }
    }

    void find_three() {
        Node p = head;
        int max = p.info.age;
        int second_max = p.info.age;
        int three_max = p.info.age;
        while (p != null) {
            if (max < p.info.age) {
                three_max = second_max;
                second_max = max;
                max = p.info.age;
            }
            else if(p.info.age>second_max){
                three_max = second_max;
                second_max = p.info.age;
            }
            else if(p.info.age>three_max){
                three_max = p.info.age;
            }
            p = p.next;
        }
        System.out.println("Three max : " + three_max);
    }

    void sort_age() {
        String a;
        int x;
        Node p = head;
        Node p1;
        while (p != null) {
            p1 = p;
            while (p1 != null) {
                if (p1.info.age > p.info.age) {
                    a = p1.info.name;
                    p1.info.name = p.info.name;
                    p.info.name = a;
                    x = p1.info.age;
                    p1.info.age = p.info.age;
                    p.info.age = x;
                }
                p1 = p1.next;
            }
            p = p.next;
        }
    }
    void sort_name(){
        String a;
        int x;
        Node p = head;
        Node p1;
        while (p != null) {
            p1 = p;
            while (p1 != null) {
                if (p1.info.name.compareTo(p.info.name)<0) {
                    a = p1.info.name;
                    p1.info.name = p.info.name;
                    p.info.name = a;
                    x = p1.info.age;
                    p1.info.age = p.info.age;
                    p.info.age = x;
                }
                p1 = p1.next;
            }
            p = p.next;
        }
    }
    void sort(int startIndex, int endIndex ){
        
    }
}
