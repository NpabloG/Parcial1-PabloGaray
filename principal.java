package com.pabloParcial1;

public class principal {

    int opcion;
    boolean salir;

    public principal() {
        opcion = 0;
    } //constructor

    public void menuprincipal() {

        lectura read = new lectura(); //invocamos la funcion lectura
        salir = false;

        do {
            encabezado();
            System.out.println("\tCalculadora");
            System.out.println("1. C. Basica");
            System.out.println("2. C. Avanzada");
            System.out.println("3. exit");
            System.out.print("\nSelecciona una opcion: ");
            int opcion = read.lecturaEntero();

            switch (opcion) {

                case 1:
                    menubasico Basico = new menubasico();
                    Basico.CalcuBasic();
                    break;

                case 2:
                    menuavanzado Profesional = new menuavanzado();
                    Profesional.CalcuProf();
                    break;

                case 3: mensajeSalir(); salir = true; break;

                default: mensaje(); break;
            }
        }while (!salir);
    }


    public void mensaje(){
        System.out.println("______________");
        System.out.println("| Sintaxis erronea! opcion no encontrada |");
        System.out.println("______________\n");
    }

    public void encabezado(){
        System.out.println("\n\t*");
        System.out.println("\t* welcome*");
        System.out.println("\t*\n");
    }

    public void mensajeDatoUno(){ System.out.print("\ndigite el primer numero: "); }

    public void mensajeDatoDos(){ System.out.print("\ndigite el segundo numero: "); }

    public void mensajeSalir(){
        System.out.println("\n\t*");
        System.out.println("\t salio.");
        System.out.println("\t*");

    }
}
