package ejercicio.empleado;
import java.util.Scanner;
public class EjercicioEmpleado {
    public static void main(String args[]){
        String codigo,nombres; double horas_al_mes,valor_por_hora,retencion_fuente,salario_bruto,salario_neto;
        Scanner datos = new Scanner(System.in);
        System.out.println("Codigo del empleado:");
        codigo=datos.next();
        datos.nextLine();
        System.out.println("Nombres del empleado:");
        nombres=datos.nextLine();
        System.out.println("Horas trabajadas al mes:");
        horas_al_mes=datos.nextDouble();
        System.out.println("Valor de hora trabajada:");
        valor_por_hora=datos.nextDouble();
        System.out.println("Porcentaje de retencion en la fuente (sin el signo %):");
        retencion_fuente=datos.nextDouble();
        salario_bruto=horas_al_mes*valor_por_hora;
        salario_neto=salario_bruto*(1-(retencion_fuente/100));
        System.out.println("El nombre del empleado es: "+nombres);
        System.out.println("El codigo del empleado es: "+codigo);
        System.out.println("El salario bruto del empleado es: "+salario_bruto+"$");
        System.out.println("El salario neto del empleado es: "+salario_neto+"$");
    }
    
}
