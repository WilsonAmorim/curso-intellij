package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo Número: ");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subitrair = subitrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a,b);

        System.out.println("Soma: " + somar);
        System.out.println("Sub; " + subitrair);
        System.out.println("Mult; " + multiplicar);
        System.out.println("Div; " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subitrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}
