import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre="Daniel";
        String tipoCuenta="Corriente";
        double saldo=1500;
        int opcion=0;
        System.out.println("\n*********************************************");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo es: $"+saldo);
        System.out.println("***********************************************");
        String menu="*** Escriba el número de la opción deseada *** \n 1. Consultar saldo \n 2. Retirar \n 3. Depositar \n 9. Salir ";
        //LECTURA
        Scanner entrada=new Scanner(System.in);
        //ciclo
        while (opcion!=9){
            System.out.println(menu);
            opcion=entrada.nextInt();
        }

    }
}