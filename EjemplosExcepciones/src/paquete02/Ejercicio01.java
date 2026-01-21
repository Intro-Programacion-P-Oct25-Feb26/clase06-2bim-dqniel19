/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = obtenerValor();
        int b = obtenerValor();

    }
    
    public static void obtenerValor() {
        boolean bandera = true;
        int a;
        while(bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese un valor");
                a = entrada.nextInt();
                if (a %2 == 0 || a >= 0) {
                    bandera = false;} // Si a cumple con las condiciones requeridas el ciclo terminará
                if (a %2 != 0) {
                    throw new Exception("Número impar");
                } else if (a < 0) {
                    throw new Exception("Valor menor a 0");
                }
            } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }

    System.out.printf("%d", a);    
    }
    
}
