package Clases;

public class CicloWhile {
    public static void cicloWhile() {
        int i = 1;

        //Mientras la condicion sea verdadera, se ejecutara el ciclo
        while (i <= 10) {
            System.out.println(2*i);
            i++; // Incrementa el contador
        }
        System.out.println("Fin del ciclo");

    }
}