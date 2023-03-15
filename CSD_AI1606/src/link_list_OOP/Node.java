/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list_OOP;

import link_list.*;

public class Node {
    person info;
    Node next ;

    public Node(String a,int x) {
        this.info = new person(a, x);
        next = null;
    }
    
}
