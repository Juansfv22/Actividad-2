/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_ecuacion;
import java.util.Scanner;
public class Ejercicio_ecuacion {
    public static void main(String[] args) {
        double A,B,C;
        Scanner parametros = new Scanner(System.in);
        System.out.println("Valor de A: ");
        A=parametros.nextDouble();
        System.out.println("Valor de B: ");
        B=parametros.nextDouble();
        System.out.println("Valor de C: ");
        C=parametros.nextDouble();
        System.out.println("La solución X1 de la ecuación es: "+(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A));
        System.out.println("La solución X1 de la ecuación es: "+(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A));
    }
}