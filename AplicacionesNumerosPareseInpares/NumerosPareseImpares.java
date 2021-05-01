import java.util.*;
import java.util.Scanner;
public class NumerosPareseImpares{
//Atributos de la clase
    private static int numero1;
    private static int numero2;

  public static void main(String[] argv){
    Scanner leer=new Scanner (System.in);
    System.out.println("NUMEROS PARES E IMPARES");
    System.out.println();
    System.out.println("Ingrese el limite inferior: ");
    numero1=leer.nextInt();
    System.out.println("Ingrese el limite superior: ");
    numero2=leer.nextInt();
    System.out.println();
    System.out.println("NUMEROS PARES");
    for (int i=numero1;i<=numero2;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
    System.out.println();
    System.out.println("NUMEROS IMPARES");
    int i=numero1;
    while( i<=numero2){
      if(i%2!=0){
        System.out.println(i);
      }
      i=i+1;
    }

  }


}