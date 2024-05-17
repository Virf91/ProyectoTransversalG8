package vistas;

import entidades.Alumno;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import persistencia.AlumnoData;
import persistencia.MiConexion;

public class Pruebas {

    private AlumnoData alumnoData;
    private MiConexion conexion;
    private List<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        
        new Pruebas().conectar();
    }

    public void conectar() {
        conexion = new MiConexion();
        alumnoData = new AlumnoData(conexion);
        LocalDate fecha= LocalDate.now();
      
        Alumno nuevo = new Alumno(15,369852,"Elba", "Surita", fecha, true);
       alumnoData.guardarAlumno(nuevo);// Agregar nuevo alumno a Universisadg8
       
//       // buscar alumno
//       Alumno Alu = alumnoData.buscarAlumno(11);
//       System.out.println("Alumno Nombre:" + Alu.getNombre());
//       //buscamos alumnos por el metododo dni
//       System.out.println(alumnoData.buscarAlumnoPorDni(12345678));
//       //modificamos el alumno
//        Alumno alumno = new Alumno();
//        alumno.setIdAlumno(10); // ID del alumno a modificar
//        alumno.setDni(12345678); // Nuevo DNI
//        alumno.setApellido("Quito"); // Nuevo apellido
//        alumno.setNombre("pizza"); // Nuevo nombre
//        alumno.setFechaNacimiento(LocalDate.of(1990, 5, 15));
//        alumnoData.modificarAlumno(alumno);
//        //eliminamos el alumno por el id
//        alumnoData.eliminarAlumno(8);
//        
//        //listamos todos los alumnos    
//        alumnos = alumnoData.listarAlumnos();
//          System.out.println("La lista de alumnos es ");
//         for(Alumno alu:alumnos){
//             System.out.println(alu);
//             
//         }
//        //agregamos al alumno que hubieramos borrado
//        alumnoData.restaurarAlumno(0);
}
    
}
