package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.println("Abraham Alonso Garcia Rosas ");
        int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en java";
        char miCaracter = 'a';
        Scanner miEscanner = new Scanner(System.in);

        int numero;
        numero = miEscanner.nextInt();

        System.out.println(" Mi numero que acabo de ingresar es : " + numero);*/

        //desarrollar un programa en java que lea 2 numeros , los sume y me muestre el resultado
        /*Scanner Escanner = new Scanner(System.in);


        int numero1;
        int numero2;


        numero1 = Escanner.nextInt();
        numero2 = Escanner.nextInt();


        int suma = numero1*numero2;




        System.out.println(" El resultado de la suma es: "+suma);*/
        //desarrollar un programa que le pida al usuario , su nombre ,  su edad, su peso y su altura , que calcule el imc y que me de una carta de tod lo visto

        Scanner Escanner = new Scanner(System.in);

        String Nombre;
        int Edad;
        double Peso;
        double Altura;

        System.out.println("Ingrese su nombre");
        Nombre = Escanner.nextLine();
        System.out.println("Ingrese su edad");
        Edad = Escanner.nextInt();
        System.out.println("Ingrese su Altura");
        Altura = Escanner.nextDouble();
        System.out.println("Igrese su peso");
        Peso = Escanner.nextDouble();


        double imc = Peso/Math.pow(Altura,2);
        System.out.println("El resultado de el Imc es:"+imc);




        System.out.println(" El nombre es:"+Nombre);
        System.out.println("La edad es:"+Edad);
        System.out.println(" La altura es:"+Altura);
        System.out.println("El peso es :"+Peso);
























    }
}