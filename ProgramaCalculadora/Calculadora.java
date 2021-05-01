//Nombre: Maria Camila Correa Ardila
//Codigo: 20202020078
//Crear una aplicación en java  que simule una Calculadora y que tenga un método que reciba 3 parámetros (num1, num2, operación). En base al operación que recibe como parámetro (llamará el método correspondiente  a la operación, ej. sumar, restar,  multiplicar, dividir) y retornará el resultado e imprimirlo por consola.
import java.util.*;
import java.util.Scanner;
public class Calculadora{
//Atributos de la clase
    private static int numero1;
    private static int numero2;
    private static int operacion;
    private static int resultado;
    

  public static void main(String[] args){
    Scanner leer=new Scanner (System.in);
    System.out.println("CALCULADORA CAMILA");
    System.out.println();
    System.out.println("Ingrese el primer numero");
    numero1=leer.nextInt();
    System.out.println("Ingrese el segundo numero");
    numero2=leer.nextInt();
    System.out.println("Ingrese la operacion que desea:");
    System.out.println("1.Suma");
    System.out.println("2.Resta");
    System.out.println("3.Multiplicacion");
    System.out.println("4.Division");
    System.out.println("5.Salir");
    System.out.println();
    System.out.print("La opcion es =");
    operacion=leer.nextInt();
    Menu(numero1,numero2,operacion);
  }
  //Creamos el metodo que pide los 3 parametros principales
  public static int Menu(int num1,int num2,int op){
    //Segun la operacion nos dirigimos al metodo correspondiente
    switch (op){
      case 1: 
      System.out.println("El resultado es = "+suma(num1,num2));
      break;
      case 2:
      System.out.println("El resultado es = "+resta(num1,num2));
      break;
      case 3:
      System.out.println("El resultado es = "+multiplicacion(num1,num2));
      break;
      case 4:
      System.out.println("El resultado es = "+ division(num1,num2));
      break;
      case 5:
      System.out.println("Adios.");
      break;
      default:
      System.out.println("La opcion no existe");
      break;
    }
    return(-1);
  }
  public static int suma(int x, int y)
    {
        int resultado = x + y;
        return resultado;
    }
    public static int resta(int x, int y)
    {
        int resultado = x-y;
        return resultado;
    }
    public static int multiplicacion(int x, int y)
    {
        int resultado = x*y;
        return resultado;
    }
    public static int division(int x, int y)
    {
      if (y==0){
        System.out.println("No se puede dividir por cero");
      }
      else{ 
        int resultado = x/y;
        return resultado;
      }
      return resultado;
    }

}