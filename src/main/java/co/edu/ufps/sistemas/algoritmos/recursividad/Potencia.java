/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemas.algoritmos.recursividad;

/**
 *
 * @author lvicentealbarracin
 */
public class Potencia {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Potencia " + potencia(n));
    }

    private static int potencia(int n) {
        if (n==0){
            return 1;
        }else{
            return 2 * potencia(n-1);
        }
    }
}
