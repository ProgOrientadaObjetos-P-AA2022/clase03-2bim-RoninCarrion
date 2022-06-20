/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(ArrayList<Policia> b, String a) {
        super(a);
        lista = b;
    }

    public void establecerPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
        promedioEdades += lista.get(i).getEdad();
        }
        promedioEdades /= lista.size();
    }

    public void establecerLista(ArrayList<Policia> a) {
        lista = a;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tREPORTE POLICIAS");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Edades: %.2f"
                , cadena, promedioEdades);

        return cadena;
    }

}
