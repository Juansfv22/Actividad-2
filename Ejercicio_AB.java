package ejercicio_ab;
import java.util.Scanner;
public class Ejercicio_AB {
    public static void main(String[] args) {
        double a,b;
        Scanner valores = new Scanner(System.in);
        System.out.println("Ingrese el valor de a:");
        a=valores.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b=valores.nextDouble();
        if (a>b)
            System.out.println("a es mayor que b");
        else if (a==b)
            System.out.println("a es igual a b");
        else
            System.out.println("a es menor que b");
    }
}
