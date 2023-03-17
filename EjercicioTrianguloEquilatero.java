/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.triangulo.equilatero;
import java.util.Scanner;
public class EjercicioTrianguloEquilatero {
    public static void main(String[] args) {
        double lado,perimetro,area,altura;
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el valor de un lado del triangulo equilatero en centimetros: ");
        lado=valor.nextDouble();
        perimetro=3*lado;
        altura=(Math.sqrt(3)/2)*lado;
        area=(lado*altura)/2;
        System.out.println("El perimetro del triangulo es de "+perimetro+" centimetros");
        System.out.println("La altura del triangulo es de "+altura+" centimetros");
        System.out.println("El area del triangulo es de "+area+" centimetros cuadrados");
        
    }
    
}
