/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase4 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Digite un valor numerico:");

        /*
        double valor = t.nextDouble();
        double res = valorAbsoluto(valor);
        double res2 = valorAbsoluto2(valor);
        System.out.println(res + "\n" + res2);
        imprimirNumero(valor);
         */
        /*
        System.out.println("Digite un valor a:");
        double a = t.nextDouble();
        System.out.println("Digite un valor b:");
        double b = t.nextDouble();

        System.out.println("El numero mayor es =" + max(a, b));
         */
        
        /*boolean p, q;
        System.out.println("digite el valor booleano de P:");
        p = t.nextBoolean();
        System.out.println("digite el valor booleano de Q:");
        q = t.nextBoolean();
        System.out.println("p -> q :" + condicional(p, q));
         */
        System.out.println(pagoFinal(36, 2000));
        System.out.println(esVocalMinuscula('e'));

    }

    //-----------VALOR ABSOLUTO DE UN NUMERO------
    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } else {
            valor = -x;
        }
        return valor;
    }

    //---------------MAXIMO ENTRE 2 VALORES NUMERICOS----
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //----VALOR ABSOLUTO CON ?: ----------
    public static double valorAbsoluto2(double x) {
        double valor;
        valor = (x >= 0) ? x : -x;
        return valor;
    }

    //----SIGNO DE NUMERO--------------------
    public static void imprimirNumero(double x) {
        if (x > 0.0) {
            System.out.print("+");
        }
        System.out.println(x);
    }

    //----P entonces Q condional tabla de verdad----
    public static boolean condicional(boolean p, boolean q) {
        if (p == true && q == false) {
            return false;
        } else {
            return true;

        }
    }

    //----DESCUENTO DE COMPRAS------------------------
    public static double pagoFinal(int n, double precio) {
        double valor;
        if (n <= 5) {
            valor = n * precio;
        } else if (5 < n && n <= 10) {
            valor = n * precio * 0.95;
        } else if (10 < n && n <= 20) {
            valor = n * precio * 0.90;
        } else {
            valor = n * precio * 0.80;
        }
        return valor;
    }

    //----determinar si es letra minuscula--------
    public static boolean esVocalMinuscula(char ch) {
        boolean value;
        switch (ch) {
            case 'a':
                value = true;
                break;
            case 'e':
                value = true;
                break;
            case 'i':
                value = true;
                break;
            case 'o':
                value = true;
                break;
            case 'u':
                value = true;
                break;
            default:
                value = false;
                break;
        }
        return value;
    }
    
    //---------
    
}
