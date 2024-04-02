import javax.swing.*;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class operacionConCiclos {
    public static void main (String[] args){


int suma=0;
        int i=0;
        int n=0;
int opciones=0;
                          JOptionPane.showInputDialog("por favor seleccione una opcion 1.ciclo while, 2.ciclo dowhile, 3.ciclo for");




        switch (opciones) {
            case 1:
                n= Integer.parseInt(JOptionPane.showInputDialog("por favor digite un numero"));
                while (i<=0);{
                int multiplicacion = i * i;
             suma=i+multiplicacion;}

            showInputDialog("el resultado de la suma es "+suma);
            break;

                case 2:
                    n= Integer.parseInt(JOptionPane.showInputDialog("por favor digite un numero"));



                do {
                     suma = i * i;
                    i++;
                    showInputDialog("la suma de los numeros cuadrados es" + suma);
                } while (i <= n);
                break;
            case 3:
                n= Integer.parseInt(JOptionPane.showInputDialog("por favor digite un numero"));
                for ( i= 1; i <= i; i++) {
                   suma = i * i;
                    i++;
                    showInputDialog("el resultado de la suma es" + suma);
                }
                break;




        }



        }

    }

