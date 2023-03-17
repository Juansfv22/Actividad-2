/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_compra;
import java.util.Scanner;
public class Ejercicio_compra {
    public static void main(String[] args) {
        String color; double valcomp,valpag,pdes;
        Scanner datos = new Scanner(System.in);
        System.out.println("Valor de la compra:");
        valcomp=datos.nextDouble();
        System.out.println("Color de la bolita:");
        color=datos.next().toLowerCase();
        if (color.equals("blanco"))
            pdes=0;
        else if (color.equals("verde"))
            pdes=10;
        else if (color.equals("amarillo"))
            pdes=25;
        else if (color.equals("azul"))
            pdes=50;
        else
            pdes=100;
        valpag=valcomp*((100-pdes)/100);
        System.out.println("El cliente debe pagar $"+valpag);
    }
}
