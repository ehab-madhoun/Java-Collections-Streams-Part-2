/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author Ehab Elmadhoun 120163399
 */
public class Q1_D {

    public static void main(String[] args) {
        Operation<Integer> print = value -> System.out.printf("%d\n", value);
        print.display(20);
    }

    private interface Operation<T> {

        void display(T t);
    }

}

