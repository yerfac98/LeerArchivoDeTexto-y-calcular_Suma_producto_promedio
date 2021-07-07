/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miultimosuspirodelexamen_gerardofacundodelangel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Gerardo Fac
 */
public class GuardarDatos {

    //metodo para leer los datos
    public void guardar(String nombreArchivo, String info) {
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(info);
            salida.close();
        } catch (IOException ioe) {
            System.err.println("Error");
        }
    }

}
