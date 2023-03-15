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
public class My_list {
    public static void main(String[] args) {
        BSTree Tree  = new BSTree();
        Tree.insert(10);
        Tree.insert(12);
        Tree.insert(9);
        Tree.insert(11);
        Tree.insert(18);
        Tree.insert(30);
        Tree.insert(20);
        Tree.insert(19);
        Tree.insert(23);
        Tree.insert(21);
        Tree.insert(34);
        
/*                 
                                         10 
                                 9             12 
                                                     18
                                                             30
                                                        20        34
                                                     19    23
                                                         21
                   
*/
//        Node p = Tree.search(10);
//        System.out.println(p.value);
//        run test
//        Tree.clear();
//        Tree.delete(12);
//        Tree.inOrder(Tree.root);
//        Tree.postOrder(Tree.root);
//        Tree.preOrder(Tree.root);
//        System.out.println(" Node : " + Tree.count());
//        System.out.println(" Min : " +Tree.min().value);
//        System.out.println(" Max : " +Tree.max().value);
//        System.out.println(" Sum : "+Tree.sum());
//        System.out.println(" Average : "+ Tree.avg());
//        System.out.println(Tree.heightTree(Tree.root));
//        System.out.println(Tree.MaxCost(Tree.root));
    }
    
}
