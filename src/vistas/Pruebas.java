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
    private List<Alumno> alumnos = new ArrayList<>();
    private MateriaData materiaData;

    public static void main(String[] args) {
        new Pruebas().conectar();
    }

    public void conectar() {
        Conexion.getConexion();// se agrego esta parte porque se modifico el metodo 
                                //conexion no hace falta hace un new solo usa una conexion
//       conexion = new Conexion();
//        alumnoData = new AlumnoData(conexion);
//        LocalDate fecha = LocalDate.now();
//
//        Alumno nuevo = new Alumno(15, 369852, "Elba", "Surita", fecha, true);
//        alumnoData.guardarAlumno(nuevo);// Agregar nuevo alumno a Universisadg8


//*****************************************************************
//                      BUSCAR ALUMNO POR ID
//*****************************************************************
//       Alumno Alu = alumnoData.buscarAlumno(11);
//       System.out.println("Alumno Nombre:" + Alu.getNombre());

//*****************************************************************
//                     BUSCAR ALUMNO POR DNI
//*****************************************************************
//       System.out.println(alumnoData.buscarAlumnoPorDni(12345678));


//*****************************************************************
//                     MODIFICAMOS ALUMNO
//*****************************************************************
//        Alumno alumno = new Alumno();
//        alumno.setIdAlumno(10); // ID del alumno a modificar
//        alumno.setDni(12345678); // Nuevo DNI
//        alumno.setApellido("Quito"); // Nuevo apellido
//        alumno.setNombre("pizza"); // Nuevo nombre
//        alumno.setFechaNacimiento(LocalDate.of(1990, 5, 15));
//        alumnoData.modificarAlumno(alumno);


//*****************************************************************
//                  ELIMINAMOS ALUMNO POR EL ID
//*****************************************************************
//        alumnoData.eliminarAlumno(8);

//*****************************************************************    
//                  LISTAMOS TODOS LOS ALUMNOS    
//*****************************************************************
//        alumnos = alumnoData.listarAlumnos();
//          System.out.println("La lista de alumnos es ");
//         for(Alumno alu:alumnos){
//             System.out.println(alu);
//         }
//        //agregamos al alumno que hubieramos borrado
//        alumnoData.restaurarAlumno(0);


//*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//*****************************************************************
//                  AGREGAR MATERIA
//*****************************************************************

//        materiaData = new MateriaData(conexion);
//        Materia mat = new Materia ( "EDA", 2024, true);
//        materiaData.guardarMateria(mat);

//*****************************************************************
//                  MODIFICAR MATERIA
//*****************************************************************
//        Materia m = new Materia();
//        m.setIdMateria(1);
//        m.setNombre("Geografia");
//        m.setAnio(2024);
//        m.setEstado(true);
//        materiaData.modificarMateria(m);
// falta agustar algunas cosas no funciona todavia

    }

}
