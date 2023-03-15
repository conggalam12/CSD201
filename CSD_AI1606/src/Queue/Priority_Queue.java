/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class Priority_Queue {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> priorityQueue1 = new PriorityQueue<>();
        for (int i = 1; i <=10; i++) {
            priorityQueue.add(i); // luu tru co thu tu 
        }
        for (int i = 10; i >0; i--) {
            priorityQueue1.add(i); // luu khong co thu tu , có thể thay thế bằng offer(i)
        }
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue1: "+priorityQueue1);
        System.out.println("The head : "+priorityQueue.peek());
        System.out.print("PriorityQueue using poll() :" );
        while (!priorityQueue.isEmpty()) {
           System.out.print(priorityQueue.poll()+"  "); // xóa theo giá trị 
        }
        System.out.print("\nPriorityQueue1 using poll() :" );
        while (!priorityQueue1.isEmpty()) {
           System.out.print(priorityQueue1.poll()+"  "); // xóa theo giá trị 
        }
        System.out.println("\n");
        
    }
}
