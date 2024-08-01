import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Write the number of the lines you want to have for your christmas tree:");


//        lineas del árbol:
        int altura = teclado.nextInt();
        System.out.println("--------------------------------------");


        // bucle para altura arbol
        for (int fila = 0; fila < altura; fila++) {

            // bucle espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            // bucle asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println("");


        }

        // tronco
        int largoTronco = 2;
        for (int base = 0; base < largoTronco; base++) {

            //espacios en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }

            // barras tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }

            System.out.println("");

        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("From the author, Memo Sainz: ");
        System.out.println("The Lord and His Holy Spirit bless you in this Christmas dude :)");
    }
}