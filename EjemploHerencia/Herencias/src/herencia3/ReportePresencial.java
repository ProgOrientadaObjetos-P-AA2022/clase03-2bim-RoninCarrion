/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePresencial extends Reporte {

    private ArrayList<EstudiantePresencial> lista;
    private double totalMatriculaPresencial;
    private double promedioGeneral;

    public ReportePresencial(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudiantePresencial> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasPresencial() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaPresencial = totalMatriculaPresencial
                    + lista.get(i).obtenerMatriculaPresencial();
        }
    }

    public void establecerPromedioGeneral() {

        for (int i = 0; i < lista.size(); i++) {
            promedioGeneral = promedioGeneral
                    + lista.get(i).obtenerPromedio();
        }
        promedioGeneral = promedioGeneral / lista.size();
    }

    public ArrayList<EstudiantePresencial> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaPresencial;
    }

    public double obtenerPromedioGeneral() {
        return promedioGeneral;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Carrera: %s\n"
                + "Ciclo: %s\n"
                + "Lista de Estudiantes\n", nombre, carrera, ciclo);

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));

        }
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n"
                + "Promedio General: %.2f\n", cadena,
                 obtenerTotalMatriculasDistancia(),
                 obtenerPromedioGeneral());
        return cadena;
        /* Salida
----------------------
Reporte Presencial
Carrera: Alimentos 
Ciclo: Segundo

Lista de Estudiantes

Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Crédito: 100,20
Número de Créditos: 1
Total Matricula: 100,20
Promedio:  9,20

Nombre: Nancy
Apellido: Ayala
Identificación: 212234
Edad: 21
Costo Crédito: 100,20
Número de Créditos: 2
Total Matricula: 200,40
Promedio:  8,20

Nombre: Alvaro
Apellido: Narvaez
Identificación: 212235
Edad: 19
Costo Crédito: 100,20
Número de Créditos: 3
Total Matricula: 300,60
Promedio:  7,20


El total de matriculas es: 601,20
Promedio General: 8,200
         */
    }

}
