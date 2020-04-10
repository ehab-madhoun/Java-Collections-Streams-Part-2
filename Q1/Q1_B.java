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
import java.util.function.Function;


public class Q1_B {

    public static void main(String[] args) {
        Function<String, String> toUpper_lambda = String::toUpperCase;
        System.out.println(toUpper_lambda.apply("fgdfg"));
    }
}
