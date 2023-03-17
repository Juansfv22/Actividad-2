/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cualquier_triangulo;
import java.util.Scanner;
public class Ejercicio_cualquier_triangulo {
    public static void main(String[] args) {
        double lado1,lado2,lado3,perimetro,semiperimetro,area;
        Scanner lados = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado 1 del triangulo en centimetros: ");
        lado1=lados.nextDouble();
        System.out.println("Ingrese el valor del lado 2 del triangulo en centimetros: ");
        lado2=lados.nextDouble();
        System.out.println("Ingrese el valor del lado 3 del triangulo en centimetros: ");
        lado3=lados.nextDouble();
        perimetro=lado1+lado2+lado3;
        semiperimetro=perimetro/2;
        area=Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        System.out.println("El perimetro del triangulo es de "+perimetro+" centimetros");
        System.out.println("El semiperimetro del triangulo es de "+semiperimetro+" centimetros");
        System.out.println("El area del triangulo es de "+area+" centimetros cuadrados");
    }
}
