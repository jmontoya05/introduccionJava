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
        System.out.println("La suma de los número del 100 al 200 es " + suma);

        System.out.println("--------");
        System.out.println("Ejercicio #6 (1 al 10 al revés)");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " - ");
        }
        System.out.println(" ");

        System.out.println("--------");
        System.out.println("Ejercicio #7 (Edad usuario)");
        int anoActual = 2023;
        System.out.println("Por favor ingrese su edad");
        int edad = teclado.nextInt();
        int anosCumplidos = anoActual - edad + 1;

        for (int i = 1; i <= edad; i++) {
            System.out.println("En el año " + anosCumplidos + " cumplió " + i + " años");
            anosCumplidos += 1;
        }

        System.out.println("--------");
        System.out.println("Ejercicio #8 (Calificaciones)");
        System.out.println("Por favor ingrese una calificación entre A y F");
        String calificacion = teclado.next();

        switch (calificacion.toUpperCase()){
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Sobresaliente");
                break;
            case "C":
                System.out.println("Bueno");
                break;
            case "D":
                System.out.println("Aceptable");
                break;
            case "E":
                System.out.println("Insuficiente");
                break;
            case "F":
                System.out.println("Deficiente");
                break;
            default:
                System.out.println("Ingresó una calificación invalida");
        }

        System.out.println("--------");
        System.out.println("Ejercicio #9 (Venta de sillas)");
        double valorSilla = 40000;
        double descuento = 0, valorPagar, valorTotalConDescuento = 0;
        System.out.println("Ingrese el número de sillas que desea comprar");
        int cantidadSillas = teclado.nextInt();
        valorPagar = valorSilla * cantidadSillas;
        if (cantidadSillas <= 0){
            System.out.println("Cantidad invalida para la compra");
        } else if (cantidadSillas <= 5) {
            valorTotalConDescuento = valorPagar - descuento;
        } else if (cantidadSillas <= 12){
            descuento = valorPagar * 0.1;
            valorTotalConDescuento = valorPagar - descuento;
        } else if (cantidadSillas <= 40) {
            descuento = valorPagar * 0.2;
            valorTotalConDescuento = valorPagar - descuento;
        } else {
            descuento = valorPagar * 0.3;
            valorTotalConDescuento = valorPagar - descuento;
        }

        if (cantidadSillas >= 0){
            System.out.println("El valor de la compra fue de " + valorPagar + ", se le aplicó un descuento de " + descuento + ", por lo tanto el total a pagar es de " + valorTotalConDescuento);
        }

        System.out.println("--------");
        System.out.println("Ejercicio #10 (Validar tributo)");
        System.out.println("Por favor ingrese su edad");
        edad = teclado.nextInt();
        System.out.println("Por favor ingrese sus ingresos mensuales");
        double ingresos = teclado.nextDouble();

        if (edad >= 16 && ingresos >= 5000000){
            System.out.println("Debes tributar");
        } else {
            System.out.println("No debes tributar");
        }

    }
}