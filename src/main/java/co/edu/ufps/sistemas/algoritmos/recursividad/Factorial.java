/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.ufps.sistemas.algoritmos.recursividad;

/**
 *
 * @author lvicentealbarracin
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 6;
        System.out.println("El factorial es: " + factorial(n));
    }

    private static int factorial(int n) {
        if(n==0 || n == 1)
            return 1;
        else{
            return n * factorial(n-1);
        }
    }
}
