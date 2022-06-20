/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\nLista de Estudiantes",
                nombre,
                carrera,
                ciclo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s", cadena, lista.get(i));
        }
        cadena = String.format("%s\nEl total de Matriculas es: %.2f"
                , cadena, obtenerTotalMatriculasDistancia());
        return cadena;
        

        }

//        String cadena = String.format("%s\nCarrera: %s \n"
//                + "Ciclo: %s\nLista de Estudiantes\n", 
//                nombre,
//                carrera,
//                ciclo);
//        for (int i = 0; i < lista.size(); i++) {
//        cadena = String.format("%s\n\nNombre: %s\n"
//                + "Apellido: %s\n"
//                + "Identificación: %s\n"
//                + "Edad: %d\n"
//                + "Costo Asignatura: %.2f\n"
//                + "Total Matricula: %.2f"
//                + "", cadena, lista.get(i).nombresEstudiante
//        , lista.get(i).apellidosEstudiante
//        , lista.get(i).identificacionEstudiante
//        , lista.get(i).edadEstudiante
//        , lista.get(i).costoAsignatura
//        , lista.get(i).matriculaDistancia);
//        
//           
//        }
//        cadena = String.format("%s\n\nEl total de matriculas es: %.2f\n",cadena
//                , obtenerTotalMatriculasDistancia());
        /*
        Reporte Distancia
Carrera: Derecho 
Ciclo: Sexto

Lista de Estudiantes

Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Asignatura: 100,20
Número de Asignaturas: 1
Total Matricula: 100,20

Nombre: Joseph
Apellido: White
Identificación: 212234
Edad: 24
Costo Asignatura: 100,20
Número de Asignaturas: 5
Total Matricula: 501,00

Nombre: Catherine
Apellido: Reyes
Identificación: 212235
Edad: 25
Costo Asignatura: 100,20
Número de Asignaturas: 8
Total Matricula: 801,60


El total de matriculas es: 1402,80*/

}
