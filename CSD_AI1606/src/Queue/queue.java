/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();// khai báo cấu trúc queue bình thường
        for (int i = 1; i <=5; i++) {
           queue.add(i); // thêm vào cuối 
        }
        System.out.println(queue.size());
        
        System.out.println(queue);
        System.out.println(queue.peek());// lấy phần tử đầu nhưng không xóa
        queue.remove(); // trả về phần tử đầu và xóa phần tử đầu 
        System.out.println(queue);
        queue.poll(); // giống remove()
        System.out.println(queue.contains(4)); // check có chứa phần tử 
        System.out.println(queue);
        queue.clear();// xóa mọi phần tử
        System.out.println(queue);
        
    }
}
