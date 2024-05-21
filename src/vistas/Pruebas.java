package vistas;

import entidades.Alumno;
import entidades.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import persistencia.AlumnoData;
import persistencia.Conexion;
import persistencia.MateriaData;

public class Pruebas {

    private AlumnoData alumnoData;
    private Conexion conexion;
    private List<Alumno> alumnos;
    private List<Materia> materias = new ArrayList<>();
    private MateriaData materiaData;

    public static void main(String[] args) {

        Conexion.getConexion(); // se agrego esta parte porque se modifico el metodo 
        // conexion no hace falta hace un new solo usa una conexion
        AlumnoData alu = new AlumnoData();
        Alumno alumno = new Alumno();
        List<Alumno> alumnos = new ArrayList<>();

        MateriaData mat = new MateriaData();
        Materia materia = new Materia();
        List<Materia> materias = new ArrayList<>();
//*****************************************************************
//                      CARGAR/GUARDAR ALUMNO 
////***************************************************************
//        LocalDate fecha = LocalDate.now();
//        Alumno nuevo = new Alumno(31, 1249852, "Alberto", "Olmedo", fecha, true);
//        alu.guardarAlumno(nuevo);// Agregar nuevo alumno a Universisadg8

//*****************************************************************
//                      BUSCAR ALUMNO POR ID
////***************************************************************
// 
//       System.out.println(alu.buscarAlumno(11));
////*****************************************************************
//                     BUSCAR ALUMNO POR DNI
////*****************************************************************
//        
//        System.out.println(alu.buscarAlumnoPorDni(12345678));
////
//*****************************************************************
//                     MODIFICAMOS ALUMNO
//////*************************************************************
//        alumno.setIdAlumno(20); // ID del alumno a modificar
//        alumno.setDni(1234); // Nuevo DNI
//        alumno.setApellido("John"); // Nuevo apellido
//        alumno.setNombre("Doe"); // Nuevo nombre
//        alumno.setFechaNacimiento(LocalDate.of(1999, 5, 15));
//        alu.modificarAlumno(alumno);

////*****************************************************************
//                  ELIMINAMOS ALUMNO POR EL ID
//*****************************************************************

//        alu.eliminarAlumno(8);

//*****************************************************************    
//                  LISTAMOS TODOS LOS ALUMNOS    
//*****************************************************************
//       
//          System.out.println("La lista de alumnos es: ");
//          System.out.println( alu.listarAlumnos());
//
//     
////       
//*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//*****************************************************************
//                  AGREGAR MATERIA
////*****************************************************************
//        LocalDate fecha = LocalDate.now();
//        materia= new Materia(25, "Progrmacion AI", 2024, true);
//        mat.guardarMateria(materia);// Agregar nuevo alumno a Universisadg8
//*****************************************************************
//                  MODIFICAR MATERIA
//*****************************************************************
//
//        materia.setNombre("Geografia con AI");
//        materia.setAnio(2024);
//        materia.setEstado(true);
//        materia.setIdMateria(1);
//        mat.modificarMateria(materia);
//     
//*****************************************************************
//                  ELIMINAR  MATERIA
//*****************************************************************
//        mat.eliminarMateria(1);

//*****************************************************************    
//                  LISTAMOS TODAS LAS MATERIAS    
////*****************************************************************
//          System.out.println("La lista de Materias es: ");
//          System.out.println( mat.listarMaterias());
////
/////*****************************************************************
//                     BUSCAR MATERIA POR id
////*****************************************************************
//        
        System.out.println(mat.buscarMateria(4));
////  
}
}
