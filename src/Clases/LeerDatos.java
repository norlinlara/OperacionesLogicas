package Clases;

import java.util.Scanner;

public class LeerDatos {
    public void leerDatos(){
        Scanner sc= new Scanner(System.in); //Leer desde teclado

        System.out.println("Numero");
        int num = sc.nextInt();
        System.out.println("Numero: ");
        double num2 = sc.nextFloat();

        System.out.print("Texto: ");
        String texto = sc.next();

        System.out.println("Entero, "+ num + "Decimal" + num2 + "Texto:" + texto);
    }

}
