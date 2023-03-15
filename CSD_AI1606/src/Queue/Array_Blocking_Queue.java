/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author cong0
 */
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue ;
public class Array_Blocking_Queue {
    public static void main(String[] args) {
        int capacity = 4; // số lượng phần tử max
  
        // create object of ArrayBlockingQueue
        Queue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
  
        // add  numbers
        abq.add(1);
        abq.add(3);
        abq.add(2);
        abq.add(4);
        //abq.add(5);
        System.out.println("Size: "+abq.size());
        System.out.println("Head : "+abq.peek()); 
        System.out.println(abq);
        System.out.print("Order of deletion :  ");
        while(!abq.isEmpty()){
            System.out.print(abq.poll()+"  "); // có thể dùng remove
        }
        System.out.println("");
    }
}
