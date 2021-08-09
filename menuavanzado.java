package com.pabloParcial1;

public class menuavanzado {
    int opcion;
    boolean salirPro = false;

    public menuavanzado(){
        opcion = 0;
    }

    public void CalcuProf(){
        lectura read_tres = new lectura();
        salirPro = false;

        do{
            System.out.println("\n\t Calculadora Avanzada ");
            System.out.println("\t-");
            System.out.println("1.R. cuadrada");
            System.out.println("2.Potencia");
            System.out.println("3.Seno");
            System.out.println("4.Coseno");
            System.out.println("5.Tangente");
            System.out.println("6.Salir del programa");
            System.out.print("\ndigite una opcion: ");
            int opcion = read_tres.lecturaEntero();

            switch(opcion){

                case 1: { lectura read = new lectura();
                    principal men = new principal();

                    men.mensajeDatoUno();
                    int resultCalcone = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcone = read.lecturaEntero();

                    propiocalc resultado = new propiocalc(resultCalcone);
                    propiocalc resultado_2 = new propiocalc(DresultCalcone);

                    System.out.println("\nEl resultado de la raiz cuadrada de " + resultCalcone + " es: " + resultado.raizCuadradas());
                    System.out.println("\nEl resultado de la raiz cuadrada de " + DresultCalcone + " es: " + resultado_2.raizCuadradas());

                }break;

                case 2: { lectura read = new lectura();

                    System.out.print("Ingrese el numero base: ");
                    int numeroCalculadora = read.lecturaEntero();

                    System.out.print("Ingrese el numero potencia: ");
                    int numero2Calculadora = read.lecturaEntero();

                    calc resultado = new calc(numeroCalculadora, numero2Calculadora);

                    System.out.println("El resltado de la base " + numeroCalculadora + " elevado a " + numero2Calculadora + " = " + resultado.potencias());
                }break;

                case 3:{ lectura read = new lectura();
                    principal men = new principal();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    propiocalc resultado = new propiocalc(resultCalcudoraIndiviual);
                    propiocalc resultado_2 = new propiocalc(DresultCalcudoraIndiviual);

                    System.out.println("El resultado del seno de " + resultCalcudoraIndiviual + " es: " +  resultado.sen());
                    System.out.println("El resultado del seno de " + DresultCalcudoraIndiviual + " es: " + resultado_2.sen());

                } break;

                case 4:{lectura read = new lectura();
                    principal men = new principal();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    propiocalc resultado = new propiocalc(resultCalcudoraIndiviual);
                    propiocalc resultado_2 = new propiocalc(DresultCalcudoraIndiviual);

                    System.out.println("El resultado del coseno de " + resultCalcudoraIndiviual + " es: " +  resultado.cos());
                    System.out.println("El resultado del coseno de " + DresultCalcudoraIndiviual + " es: " + resultado_2.cos());

                } break;

                case 5: {lectura read = new lectura();
                    principal men = new principal();

                    men.mensajeDatoUno();
                    int resultCalcudoraIndiviual = read.lecturaEntero();

                    men.mensajeDatoDos();
                    int DresultCalcudoraIndiviual = read.lecturaEntero();

                    propiocalc resultado = new propiocalc(resultCalcudoraIndiviual);
                    propiocalc resultado_2 = new propiocalc(DresultCalcudoraIndiviual);

                    System.out.println("El resultado de la tangente de " + resultCalcudoraIndiviual + " es: " +  resultado.tan());
                    System.out.println("El resultado de la tangente de " + DresultCalcudoraIndiviual + " es: " + resultado_2.tan());

                }break;

                case 6:
                    principal men = new principal();
                    men.mensajeSalir(); salirPro = true; break;

                default:
                    principal men_2 = new principal();
                    men_2.mensaje(); break;
            }
        } while(!salirPro);
    }
}
