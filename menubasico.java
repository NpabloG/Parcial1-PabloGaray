package com.pabloParcial1;

public class menubasico {

    int opcion;
    boolean salirBasic = false;

    public menubasico() {
        opcion = 0;
    } //constructor


    public void CalcuBasic(){
        lectura read = new lectura();
        salirBasic = false;
        do{
            System.out.println("\n\t Calculadora Basica ");
            System.out.println("\t--------------------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir del programa");
            System.out.print("\ndigite una opcion: ");
            int opcion = read.lecturaEntero();

            switch(opcion){

                case 1: { lectura read_dos = new lectura();

                    principal men = new principal();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    calc resultado = new calc(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resultado de la suma es " + numeroCalculadora + " + " + numero2Calculadora + " = " + resultado.sumar());
                }break;

                case 2: { lectura read_dos = new lectura();

                    principal men = new principal();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    calc resultado = new calc(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resultado de la resta es " + numeroCalculadora + " - " + numero2Calculadora + " = " + resultado.restar());
                }break;

                case 3:{ lectura read_dos = new lectura();

                    principal men = new principal();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    calc resultado = new calc(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resultado de la multiplicacion es " + numeroCalculadora + " * " + numero2Calculadora + " = " + resultado.multiplicar());
                } break;

                case 4:{lectura read_dos = new lectura();

                    principal men = new principal();

                    men.mensajeDatoUno();
                    int numeroCalculadora = read_dos.lecturaEntero();
                    men.mensajeDatoDos();
                    int numero2Calculadora = read_dos.lecturaEntero();

                    calc resultado = new calc(numeroCalculadora, numero2Calculadora);
                    System.out.println("El resltado de la division es " + numeroCalculadora + " / " + numero2Calculadora + " = " + resultado.dividir());} break;

                case 5:
                    principal men = new principal();
                    men.mensajeSalir(); salirBasic = true; break;

                default:
                    principal men_dos = new principal();
                    men_dos.mensaje(); break;
            }
        } while(!salirBasic);
    }
}
