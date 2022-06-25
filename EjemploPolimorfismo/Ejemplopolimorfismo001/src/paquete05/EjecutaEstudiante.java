package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner a = new Scanner(System.in);
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        boolean bandera = true;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        while (bandera) {

            System.out.println("Ingrese [1] Para registrar Estudiante Distancia\n"
                    + "Ingrese [2] Para registrar Estudiante Presencial");
            String option = a.nextLine();

            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = a.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = a.nextLine();
            System.out.println("Ingrese la identificación del estudiante: ");
            String id = a.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            int edad = a.nextInt();
            a.nextLine();

            switch (option) {
                case "1":
                    EstudiantePresencial estudianteP = new EstudiantePresencial();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroCreds, costoCred
                    // Leer numeroCreds, costoCred
                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = a.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = a.nextDouble();
                    a.nextLine();
                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    estudianteP.establecerNombresEstudiante(nombre);
                    estudianteP.establecerApellidoEstudiante(apellido);
                    estudianteP.establecerIdentificacionEstudiante(id);
                    estudianteP.establecerEdadEstudiante(edad);
                    estudianteP.establecerNumeroCreditos(numeroCreds);
                    estudianteP.establecerCostoCredito(costoCred);
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudiantePresencial
                    estudiantes.add(estudianteP);
                    break;

                case "2":
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = a.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = a.nextDouble();
                    a.nextLine();

                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    estudianteD.establecerNombresEstudiante(nombre);
                    estudianteD.establecerApellidoEstudiante(apellido);
                    estudianteD.establecerIdentificacionEstudiante(id);
                    estudianteD.establecerEdadEstudiante(edad);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);

                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    estudiantes.add(estudianteD);
                    break;
                default:
                    System.out.println("\n***HA INGRESADO UN VALOR NO ADMITIDO...\n"
                            + "FAVOR INGRESE UN VALOR VÁLIDO\n***");
                    break;
            }
            System.out.println("¿Desea ingresar más datos de estudiantes?");
            String rta = a.nextLine().toUpperCase();
            if (!rta.equals("SI")) {
                bandera = false;
            }
        }

        // inicio de solución
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("%s\n",
                    estudiantes.get(i));
        }
    }

}
