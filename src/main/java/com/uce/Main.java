package com.uce;

import com.uce.Objetos.*;

public class Main {
    public static void main(String[] args) {

        //Book b1 = new Book("El principito", "Antoine de Saint-Exupéry", 31.8, "Emece Editores", 299, 1946, 11);//

        /* 

        System.out.println(ClaseEstatica.atributoEstatico);
        System.out.println(ClaseEstatica.atributoEstatico);

        Book libro1 = new Book();

        System.out.println(ClaseEstatica.atributoEstatico);
        */

        // Calculadora con : suma, resta, multiplicacion, division, factorial, pi, num e.

        Calculadora.suma(1.1, 2.1);
        Calculadora.resta(2.3, 5.5);
        Calculadora.multiplicacion(7.7, 7.7);
        Calculadora.division(64.5, 8.5);
        Calculadora.factorial(6);

        System.out.println("Valor de pi = " + Calculadora.pi);
        System.out.println("Valor de euler = " + Calculadora.euler);

    }
}