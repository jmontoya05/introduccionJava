// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto Scanner para solicitar datos al usuario
        Scanner teclado = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Ejercicio #1 (Número ganador)");
        System.out.println("Por favor ingrese un número entero");
        int numero = teclado.nextInt();

        if (numero == 1000) {
            System.out.println("Ganaste un premio");
        } else {
            System.out.println("Sigue participando");
        }
        System.out.println("--------");
        System.out.println("Ejercicio #2 (Número menor)");
        System.out.println("Ingrese el número 1");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número menor es el " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("El número menor es el " + numero1);
        } else {
            System.out.println("Los números son iguales");
        }

        System.out.println("--------");
        System.out.println("Ejercicio #3 (Par o impar)");
        System.out.println("Por favor ingrese un número entero");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

        System.out.println("--------");
        System.out.println("Ejercicio #4 (De 0 a 100)");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");
        }

        System.out.println("--------");
        System.out.println("Ejercicio #5 (Suma números del 100 al 200)");
        int suma = 0;

        for (int i = 100; i <= 200; i++) {
            suma += i;
        }
        System.out.print("La suma de los número del 100 al 200 es " + suma);

        System.out.println("--------");
        System.out.println("Ejercicio #6 (1 al 10 al revés)");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " - ");
        }

        System.out.println("--------");
        System.out.println("Ejercicio #7 (1 al 10 al revés)");

    }
}