package ejercicio_universidad;
import java.util.Scanner;
public class Ejercicio_universidad {
    public static void main(String[] args) {
        String NI,NOM; double PAT,EST,PAGMAT=50000;
        Scanner datos = new Scanner(System.in);
        System.out.println("Numero de inscripcion del estudiante:");
        NI=datos.next();
        datos.nextLine();
        System.out.println("Nombre del estudiante:");
        NOM=datos.nextLine();
        System.out.println("Patrimonio del estudiante:");
        PAT=datos.nextDouble();
        System.out.println("Estrato del estudiante:");
        EST=datos.nextDouble();
        if (PAT>2000000 && EST>3)
            PAGMAT+=PAT*0.03;
        System.out.println("El estudiante con numero de inscripcion "+NI+" y nombre "+NOM+" debe pagar $"+PAGMAT);
    }
}
