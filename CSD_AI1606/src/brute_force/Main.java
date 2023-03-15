/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brute_force;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cong0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string set: ");
        String stringSet = sc.nextLine();
        System.out.print("Enter string find : ");
        String stringFind = sc.nextLine();
        BruteForce(stringFind,stringSet);
    } 

    private static void BruteForce(String stringFind, String stringSet) {
        ArrayList<Integer> index = new ArrayList<>();
        if(stringSet.length()<stringFind.length()){
            System.out.println("Don found");
        }
        else{
            int t = 1;
            for (int i = 0; i < stringSet.length()-stringFind.length()+1; i++) {
                for (int j = 0; j < stringFind.length(); j++) {
                    if(stringFind.charAt(j)!=stringSet.charAt(i+j)){
                        t = 0;
                        break;
                    }
                }
                if(t==1){
                    index.add(i);
                }
                t = 1;
            }
        }
        if(index.size()>0){
            System.out.print("Found "+stringFind+" at index : ");
            for (Integer i : index) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
