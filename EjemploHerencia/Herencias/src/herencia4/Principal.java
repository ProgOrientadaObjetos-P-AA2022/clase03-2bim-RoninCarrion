/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import herencia2.Estudiante;
import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000); 
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000); 
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        
        ArrayList<Docente> listaDocentes = new ArrayList<>();
        listaDocentes.add(doc1);
        listaDocentes.add(doc2);
        
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        // agregar elementos
        listaEstudiantes.add(est1);
        listaEstudiantes.add(est2);

        
        
        ArrayList<Policia> listaPolicias = new ArrayList<>();
        // agregar elementos
        listaPolicias.add(pol1);
        listaPolicias.add(pol2);
        
        
        ReporteDocente rd = new ReporteDocente(listaDocentes, "0001Doc");
        rd.establecerPromedioSueldos();
        
        ReporteEstudiante re = new ReporteEstudiante(listaEstudiantes, "0001Est");
        re.establecerPromedioMatriculas();
                
        ReportePolicia rp = new ReportePolicia(listaPolicias,"0001Pol");
        rp.establecerPromedioEdades();
        
        System.out.println(rd);
        System.out.println();
        System.out.println(re);
        System.out.println();
        System.out.println(rp);
        
    }
}
