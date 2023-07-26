package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradateclado= new Scanner(System.in);
        String nombre;
        String apellidos;
        String cedulaCiudadania;
        int valorboleta = 450000;
        int cantidadDeboletasCompradas;
        String ciudadResidencia;
        int edad;

        System.out.println("--Bienvenido--");

        System.out.println("Digite su nombre: ");
        nombre= entradateclado.nextLine();

        System.out.println("Digite sus apellidos: ");
        apellidos= entradateclado.nextLine();

        System.out.println("Ingrese su cedula de ciudadania: ");
        cedulaCiudadania= entradateclado.nextLine();

        System.out.println("Ingrese su ciudad de residencia: ");
        ciudadResidencia= entradateclado.nextLine();

        System.out.println("Ingrese su edad: ");
        edad= entradateclado.nextByte();

        System.out.println("Ingrese la cantidad de boletas a comprar:");
        cantidadDeboletasCompradas= entradateclado.nextInt();

        if (edad<18){
            System.out.println("Usted no cumple con la edad minima vigente");
        }else if (cantidadDeboletasCompradas>4){
            System.out.println("Por politicas usted solo puede comprar como maximo 4 boletas");
        }else {
         int total= cantidadDeboletasCompradas*valorboleta;
            System.out.println("Su total es: "+total);
        }



    }
}