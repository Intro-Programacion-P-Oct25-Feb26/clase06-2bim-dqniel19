/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        boolean bandera = true;
        while (bandera) {
            valor1 = obtenerValor();
            valor2 = obtenerValor();
            if (valor2 > 0) {
            bandera = false;}
        }
        
        int suma = obtenerSuma(valor1, valor2);
        
        String msj = obtenerReporte(valor1, valor2, suma);
        
        imprimir(msj);

    }
    
    public static int obtenerValor() {
        boolean bandera = true;
        int a = 0;
        while(bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese un valor");
                a = entrada.nextInt();
                if (a %2 == 0 && a >= 0) {
                    bandera = false;} // Si a cumple con las condiciones requeridas el ciclo terminará
                if (a < 0) {
                    throw new Exception("Valor menor a 0");
                } else if (a %2 != 0) {
                    throw new Exception("Número impar");
                }
            } catch (InputMismatchException e) { // otro tipo =! int
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
            } catch (Exception e) { // impar o menor a 0
            System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }

    return a;    
    }
    
    public static int obtenerSuma(int a, int b) {
        return a + b;
    }
    
    public static String obtenerReporte(int a, int b, int ab) {
        String mensaje = String.format("La suma de %d y %d es de: %d\n", 
                a, b, ab);
        
        return mensaje;
    }
    
    public static void imprimir(String a) {
        System.out.printf(a);
    }
}
