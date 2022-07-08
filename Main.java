import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        operacionSR opsr = new operacionSR();

        System.out.println("Ingrese el primer numero");
        double a = respuesta.nextInt();
        System.out.println("ingrese el segundo numero");
        double b = respuesta.nextInt();
        System.out.println("El resultado de la suma es: " +  opsr.suma(a,b));



    }
}