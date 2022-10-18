/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemas.algoritmos.recursividad;

/**
 *
 * @author lvicentealbarracin
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println("Sum is: " + xMethod(5));
    }

    private static int xMethod(int i) {
        if(i==1)
            return 1;
        else
            return i + xMethod(i-1);
    }
}
