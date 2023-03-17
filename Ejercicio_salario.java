package ejercicio_salario;
import java.util.Scanner;
public class Ejercicio_salario {
    public static void main(String[] args) {
        String nombre; double horas_semana,pago_hora,horas_extra,salario;
        Scanner datos = new Scanner(System.in);
        System.out.println("Nombre del trabajador:");
        nombre=datos.nextLine();
        System.out.println("Horas trabajadas en la semana:");
        horas_semana=datos.nextDouble();
        System.out.println("Dinero recibido por una hora:");
        pago_hora=datos.nextDouble();
        horas_extra=horas_semana-40;
        if (horas_extra>0)
            if (horas_extra>8)
                salario=(40*pago_hora)+(8*pago_hora*2)+((horas_semana-48)*pago_hora*3);
            else
                salario=(40*pago_hora)+(horas_extra*pago_hora*2);
        else
            salario=horas_semana*pago_hora;
        System.out.println("El trabajador "+nombre+" devengo $"+salario);
    }
}
