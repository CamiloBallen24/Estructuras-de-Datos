/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

/**
 *
 * @author andre
 */
public class mainHeap {
    public static void main(String[] args) {
        Integer[] nodos = {10, 12, 1, 14, 6, 5, 8, 15, 3, 9, 7, 4, 11, 13, 2};
        BinaryHeap<Integer> heap = new BinaryHeap<>(nodos);
        
        heap.printHeap();
        
    }
           
}
