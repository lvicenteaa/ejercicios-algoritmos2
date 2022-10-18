/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemas.algoritmos.recursividad;

/**
 *
 * @author lvicentealbarracin
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        xMethod(1234567);
    }

    private static void xMethod(int n) {
        if(n>0){
            System.out.println(n%10);
            xMethod(n/10);
        }
    }
}
