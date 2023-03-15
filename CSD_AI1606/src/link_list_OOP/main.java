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
public class main {

    public static void main(String[] args) {
        my_list list = new my_list();
        list.addLast("Cong", 24);
        list.addLast("Mai", 10);
        list.addLast("Tien", 20);
        list.addLast("Trung", 25);
        list.addLast("Ngan", 25);
        list.addLast("Tu", 28);
        list.addLast("Anh", 25);
        list.addLast("Bui", 20);
        list.addLast("Duc", 26);
        //list.delete_20_first();
        //list.delete_20_last();
        //list.add("Suk", 25, 2);
        //list.find_second();
        //list.find_three();
        //list.sort_age();
        //list.sort_name();
        //list.display_5_first();
        //list.display_5_last();
        list.display();
    }
}
