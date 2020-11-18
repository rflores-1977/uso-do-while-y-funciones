package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);


        // EL DO-WHILE PRIMERO EJECUTA UN CICLO Y DESPUES VERIFICA LA CONDICION, SI ES VERDADERA VUELVE A EJECUTAR EL CICLO.
        /*char ingreso;
        ingreso = 'm';

        do {
            System.out.println("Ingrese una Vocal");
            ingreso = rd.next().charAt(0);

            switch (ingreso) {
                case 'a':
                case 'A':
                    System.out.println("Angely");
                    System.out.println("Angel");
                    System.out.println("Angelina");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Elefante");
                    System.out.println("Elegante");
                    System.out.println("Enano");
                    break;
                case 'i':
                case 'I':
                    System.out.println("Iguana");
                    System.out.println("Igual");
                    System.out.println("Imaginario");
                    break;
                case 'o':
                case 'O':
                    System.out.println("Otro");
                    System.out.println("Ojo");
                    System.out.println("Oso");
                    break;
                case 'u':
                case 'U':
                    System.out.println("Uva");
                    System.out.println("Unidad");
                    System.out.println("Uno");
                    break;
                default:
                    ingreso = 'c';

            }
        }while (ingreso != 'c') ;*/

        //PARA LLAMAR LA FUNCION MENU
    /*menu();
    imprimir("Rodolfo");
    int num = getNumero();
        System.out.println("Me Retorno "+num);
    int s = suma(5,'h',10);
        System.out.println("La suma es: "+s);
    int num1 = getNumero();
        System.out.println("Me Retorno "+num1);*/

   /* double c = conversiones(0,0.0);
        System.out.println("La conversion es: "+c);
        System.out.println("");

    double d = conversiones1(0,0.0);
        System.out.println("La conversion es: "+d);*/

    double e = conversiones3();

    }



    // CREACION DE FUNCIONES


    // FUNCIONES, SE CREAN DENTRO DEL PUBLIC CLASS MAIN

    // FUNCION MENU NO RECIBE PARAMETROS Y NO DEVUELVE NADA

    public static void menu() {
        System.out.println("a para vocal");
        System.out.println("b para numero");
        System.out.println("c para caracter");
        System.out.println("d para salir");
    }

    // FUNCION IMPRIMIR RECIBE PARAMETROS Y NO DEVUELVE NADA

    public static void imprimir(String nombre){
        System.out.println(nombre);
    }

    //SOBRE CARGA DE FUNCIONES,SON FUNCIONES CON EL MISMO NOMBRE PERO CAMBIA EL PARAMETRO QUE RECIBIRA

    public static int getNumero(Scanner r){
        System.out.println("Dame un Numero");
        int numero = r.nextInt();
        return numero;

   }

    //FUNCION PARA LEER UN NUMERO, DEVUELVE UN VALOR PERO NO RECIBE PARAMETRO

    public static int getNumero(){
        Scanner rd = new Scanner(System.in);
        System.out.println("Dame un Numero");
        int numero = rd.nextInt();
        return numero;
    }



    //LA FUNCION SUMA RECIBE PARAMETROS Y DEVUELVE VALOR

    public static int suma(int v1, char c, int v2){

        int r = v1 + v2;
        return r;
    }

    // FUNCION DE CONVERSIONES DE MASA

    public static double conversiones(int d1,Double d2){
        Scanner rd = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Seleccione 1 para pasar Kg a Lbs");
        System.out.println("Seleccione 2 para pasar Lbs a kg");
        d1 = rd.nextInt();

        switch(d1){
            case 1:
                System.out.println("Ingrese el valor en Kg");
                d2 = rd.nextDouble();
                resultado = d2*2.2;
                break;

            case 2:
                System.out.println("Ingrese el valor en Lbs");
                d2 = rd.nextDouble();
                resultado = d2/2.2;
                break;
            default:
                System.out.println("Seleccion incorrecta");

        }
        return resultado;
    }


    // FUNCION DE CONVERSIONES DE VELOCIDAD
    public static double conversiones1(int d1,Double d2){
        Scanner rd = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Seleccione 1 para pasar millas a Km");
        System.out.println("Seleccione 2 para pasar Km a millas");
        d1 = rd.nextInt();

        switch(d1){
            case 1:
                System.out.println("Ingrese el valor en millas");
                d2 = rd.nextDouble();
                resultado = d2*1.6;
                break;

            case 2:
                System.out.println("Ingrese el valor en Km");
                d2 = rd.nextDouble();
                resultado = d2/1.6;
                break;
            default:
                System.out.println("Seleccion incorrecta");

        }
        return resultado;
    }

    //FUNCION MENU PARA CONVERSIONES

    public static void menu1() {
        System.out.println("Ingrese 1 para conversion de masa");
        System.out.println("Ingrese 2 para conversion de Velocidad");
        System.out.println("Ingrese 3 para salir");
        System.out.println("");

    }

    //FUNCION PARA RECIBIR UN DOUBLE

    public static double getDouble(Scanner rd){
        System.out.println("Dame un Numero");
        double numero = rd.nextDouble();
        return numero;
    }
    //FUNCION PARA RECIBIR UN STRING
    public static String getString(Scanner rd){
        System.out.println("Dame un Numero");
        String palabra = rd.nextLine();
        return palabra;
    }


    //FUNCION GENERAL PARA CONVERSIONES DE MASA Y VELOCIDAD

    public static double conversiones3 (){
        Scanner rd = new Scanner(System.in);
        int sel;
       do {
           menu1();
           sel = rd.nextInt();
           switch (sel) {
               case 1:
                   System.out.println("");
                   double c = conversiones(0, 0.0);
                   System.out.println("La conversion es: " + c);
                   System.out.println("");
                   break;

               case 2:
                   System.out.println("");
                   double d = conversiones1(0, 0.0);
                   System.out.println("La conversion es: " + d);
                   System.out.println("");
                   break;

               default:


           }
       }while (sel !=3);
        return 0;
    }
}