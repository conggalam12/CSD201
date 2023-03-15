/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_OOP;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cong0
 */
public class My_list {
    public static void main(String[] args) throws IOException {
        BSTree tree = new BSTree();
        tree.insert("Cong", 9);
        tree.insert("Tien", 24);
        tree.insert("Mai", 21);
        tree.insert("Hung", 22);
        tree.insert("Dung", 23);
        tree.insert("Chung", 25);
        tree.insert("Bao", 100);
        tree.insert("Tung", 26);
        tree.insert("Nam",24);
//      tree.Save(tree.root);
//      tree.delete_root();
//        tree.breadth();
//        tree.inOrder(tree.root);
//        tree.breadth_AVL();
//        tree.preOrder1(tree.root);
//        tree.deleteParent();
//        tree.inOrder(tree.root);
      tree.breadth_AVL();
    }
    
}
