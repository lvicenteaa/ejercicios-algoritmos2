/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemas.algoritmos.recursividad;

/**
 *
 * @author lvicentealbarracin
 */
public class Ejemplo5 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("El resultado es " + suma(n));
    }

    private static int suma(int n) {
        if(n == 1){
            return 1;
        }else{
            return n + suma(n-1);
        }
    }
}
