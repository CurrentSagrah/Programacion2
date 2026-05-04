package com.uce.Objetos;

public class Calculadora {

    public static double suma (double a, double b){
        double resultado = a + b;
        System.out.println("S U M A | " + a + " + " + b + " = " + resultado);
        return resultado;

    }

    public static double resta (double a, double b){
        double resultado = a - b;
        System.out.println("R E S T A | " + a + " - " + b + " = " + resultado);
        return resultado;

    }

    public static double multiplicacion (double a, double b){
        double resultado = a * b;
        System.out.println("MULTIPLICACIÓN | " + a + " * " + b + " = " + resultado);
        return resultado;

    }

    public static double division (double a, double b){
        double resultado = 1;

        if (b != 0){
            resultado = a / b;
            System.out.println("DIVISIÓN | " + a + " / " + b + " = " + resultado);
            return resultado;
        }
        else{
            System.out.println("No se puede dividir para 0 !");
            return 0;
        }

    }

    public static int factorial (int a){
        int resultado = 1;
        for(int i = 1; i <= a; i++){
            resultado *= i;
        }
        System.out.println("FACTORIAL de " + a + " = " + resultado);
        return resultado;
    }

    public static final double pi = 3.14159;
    public static final double euler = 2.71828;


    
}
