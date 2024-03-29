/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(ArrayList<Docente> a, String b) {
        super(b);
        lista = a;
    }

    public void establecerPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
        promedioSueldos += lista.get(i).getSueldo();
        }
        promedioSueldos /= lista.size();
        
    }

    public void establecerLista(ArrayList<Docente> a) {
        lista = a;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tREPORTE DOCENTES");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Edades: %.2f"
                , cadena, promedioSueldos);
        
        return cadena;
    }
    
    
    
}
