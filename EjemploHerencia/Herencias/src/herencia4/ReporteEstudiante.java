/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(ArrayList<Estudiante> b, String a) {
        super(a);
        lista = b;
    }

    public void establecerPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas += lista.get(i).getMatricula();
        }
        promedioMatriculas /= lista.size();

    }

    public void establecerLista(ArrayList<Estudiante> a) {
        lista = a;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tREPORTE ESTUDIANTES");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Matriculas: %.2f"
                , cadena, promedioMatriculas);
        return cadena;
    }

}
