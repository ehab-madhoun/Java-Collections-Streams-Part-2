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
public class Q1_C {

    public static void main(String[] args) {
        Operation print = () -> {
            return "Welcome to lambdas";
        };
        System.out.println(print.display());
    }

    private interface Operation {

        String display();
    }
}
