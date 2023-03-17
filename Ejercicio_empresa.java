package ejercicio_empresa;
import java.util.Scanner;
public class Ejercicio_empresa {
    public static void main(String[] args) {
        double VD1,VD2,VD3,salario,porven,salario1,salario2,salario3;
        Scanner valores = new Scanner(System.in);
        System.out.println("Ventas del departamento 1:");
        VD1=valores.nextDouble();
        System.out.println("Ventas del departamento 2:");
        VD2=valores.nextDouble();
        System.out.println("Ventas del departamento 3:");
        VD3=valores.nextDouble();
        System.out.println("Salario de los vendedores");
        salario=valores.nextDouble();
        porven=(VD1+VD2+VD3)*0.33;
        if (VD1>porven)
            salario1=salario*1.2;
        else
            salario1=salario;
        if (VD2>porven)
            salario2=salario*1.2;
        else
            salario2=salario;
        if (VD3>porven)
            salario3=salario*1.2;
        else
            salario3=salario;
        System.out.println("Salario vendedores departamento 1: $"+salario1);
        System.out.println("Salario vendedores departamento 2: $"+salario2);
        System.out.println("Salario vendedores departamento 3: $"+salario3);
    }
}
