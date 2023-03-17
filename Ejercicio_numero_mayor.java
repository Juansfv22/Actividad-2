/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_numero_mayor;
import java.util.Scanner;
public class Ejercicio_numero_mayor {
    public static void main(String[] args) {
        double n1,n2,n3,mayor1,mayor2;
        Scanner valores = new Scanner(System.in);
        System.out.println("Ingrese el valor de n1:");
        n1=valores.nextDouble();
        System.out.println("Ingrese el valor de n2:");
        n2=valores.nextDouble();
        System.out.println("Ingrese el valor de n3:");
        n3=valores.nextDouble();
        mayor1=Math.max(n1, n2);
        mayor2=Math.max(mayor1, n3);
        System.out.println("El valor mayor entre "+n1+", "+n2+" y "+n3+" es "+mayor2);
    }
}
