 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;
 

import java.util.function.Consumer;

/**
 *
 * @author Ehab Elmadhoun 120163399
 */

public class Q1_A {
    public static void main(String[] args) {
        Consumer<Integer> print = value -> System.out.println(value);
        print.accept(20);
    }
}
