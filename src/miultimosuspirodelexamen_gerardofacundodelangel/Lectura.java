/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miultimosuspirodelexamen_gerardofacundodelangel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Lectura {

    public static String datos1 = "";
    public static int contador, con;
    public int numDato;

    public int contarDatos() {
        final String nomFich = "file.in.txt";
        int numero = 0;
        Scanner in = null;

        try {

// abre el fichero
            in = new Scanner(new FileReader(nomFich));

// lee números
            while (in.hasNextInt()) {
                // lee un double
                int d = in.nextInt();
                numero++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo el fichero "
                    + nomFich);
        } finally {
            if (in != null) {
                in.close();
            }
        } // try

        return numero;
    }

    public String[] llenar() {

        final String nomFich = "file.in.txt";
        String Vector[] = new String[contarDatos()]; //cuenta el numero de datos en el texto
        Scanner in = null;
        int contador = 0;

        try {

            // abre el fichero
            in = new Scanner(new FileReader(nomFich));

            while (in.hasNextInt()) {// lee los numeros
                // lee un double
                int d = in.nextInt();
                Vector[contador] = String.valueOf(d);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo el fichero "
                    + nomFich);
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return Vector;
    }
}
