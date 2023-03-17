package ejercicio_esferas;
import java.util.Scanner;
public class Ejercicio_esferas {
    public static void main(String[] args) {
      double pesoA,pesoB,pesoC,pesoD;
      Scanner pesos = new Scanner(System.in);
      System.out.println("Peso de la esfera A:");
      pesoA=pesos.nextDouble();
      System.out.println("Peso de la esfera B:");
      pesoB=pesos.nextDouble();
      System.out.println("Peso de la esfera C:");
      pesoC=pesos.nextDouble();
      System.out.println("Peso de la esfera D:");
      pesoD=pesos.nextDouble();
      if (pesoA==pesoB && pesoA==pesoC)
          if (pesoD>pesoA)
              System.out.println("La esfera D es la diferente y es de mayor peso");
          else
              System.out.println("La esfera D es la diferente y es de menor peso");
      if (pesoA==pesoB && pesoA==pesoD)
          if (pesoC>pesoA)
              System.out.println("La esfera C es la diferente y es de mayor peso");
          else
              System.out.println("La esfera C es la diferente y es de menor peso");
      if (pesoA==pesoD && pesoA==pesoC)
          if (pesoB>pesoA)
              System.out.println("La esfera B es la diferente y es de mayor peso");
          else
              System.out.println("La esfera B es la diferente y es de menor peso");
      if (pesoD==pesoB && pesoD==pesoC)
          if (pesoA>pesoD)
              System.out.println("La esfera A es la diferente y es de mayor peso");
          else
              System.out.println("La esfera A es la diferente y es de menor peso");
    }
}
