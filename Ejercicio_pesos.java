/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_pesos;
import java.util.Scanner;
public class Ejercicio_pesos {
    public static void main(String[] args) {
        double esferaA,esferaB,esferaC;
        Scanner pesos = new Scanner(System.in);
        System.out.println("Peso de la esfera A: ");
        esferaA=pesos.nextDouble();
        System.out.println("Peso de la esfera B: ");
        esferaB=pesos.nextDouble();
        System.out.println("Peso de la esfera C: ");
        esferaC=pesos.nextDouble();
        if (esferaA>esferaB && esferaA>esferaC)
            System.out.println("La esfera A es la de mayor peso");
        else if (esferaB>esferaA && esferaB>esferaC)
            System.out.println("La esfera B es la de mayor peso");
        else
            System.out.println("La esfera C es la de mayor peso");
    }
}