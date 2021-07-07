/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miultimosuspirodelexamen_gerardofacundodelangel;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class ClasePrincipal extends GuardarDatos {

    public ClasePrincipal() {
    }

    public static void main(String[] args) {

        Lectura lectura = new Lectura();

        String vector[] = new String[lectura.contarDatos()];

        vector = lectura.llenar();

        int suma = 0;
        // posicion  del vector en el archivo de texto
        int multi = Integer.parseInt(vector[0]) * Integer.parseInt(vector[1]);
        for (int i = 0; i < vector.length; i++) {
            suma = suma + Integer.parseInt(vector[i]);

            if (i > 1) {
                multi = multi * Integer.parseInt(vector[i]);
            }

        }

        float promedio = suma / lectura.contarDatos();

        String informacion = "Suma: " + suma + "\nProducto: " + multi + "\nPromedio: " + promedio;

        GuardarDatos gd = new GuardarDatos();
        gd.guardar("file.out.txt", informacion);

        System.out.println("Datos guardados en el archivo de texto:\n" + informacion);

    }

}
