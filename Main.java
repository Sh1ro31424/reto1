import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        operacionSR opsr = new operacionSR();
        OperacionesBinarias opbin= new OperacionesBinarias();

        System.out.println("un num1: ");
        int num1=leer.nextInt();
    
        System.out.println("un num2: ");
        int num2=leer.nextInt();

        double resul = opbin.multiplicacion(num1,num2);

        System.out.println("el resultado es: " + resul);
        System.out.println("El resultado de la suma es: " +  opsr.suma((double)num1,(double)num2));
    }
}