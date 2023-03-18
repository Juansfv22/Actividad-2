package ejercicio_empleado22;
import java.util.Scanner;
public class Ejercicio_empleado22 {
    public static void main(String[] args) {
        String nombre; double salario_hora,horas_mes,salario_mes;
        Scanner datos = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        nombre=datos.nextLine();
        System.out.println("Salario basico por hora: ");
        salario_hora=datos.nextDouble();
        System.out.println("Horas trabajadas en el mes: ");
        horas_mes=datos.nextDouble();
        salario_mes=salario_hora*horas_mes;
        if (salario_mes>450000)
            System.out.println("El salario mensual de "+nombre+" es de $"+salario_mes);
        else
            System.out.println("nombre del empleado: "+nombre);
    }
    
}
