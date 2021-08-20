import java.util.Scanner;

public class Edad{
 public static void main(String args[]){
 
    Scanner screen = new Scanner(System.in);
    String Nombre = "";
    int NumUno = 0, NumDos = 2019, Resultado = 0;

    System.out.println("¿Hola cual es tu nombre?"); 
    Nombre = screen.nextLine();

    System.out.println("¿En que ano naciste?");
    NumUno = screen.nextInt();

    Resultado = NumUno - NumDos;
 
    System.out.println("Hola" + Nombre + "ahora se que tienes" + Resultado + "años");
 }
}