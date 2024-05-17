package vistas;

import entidades.Alumno;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import persistencia.AlumnoData;
import persistencia.MiConexion;

public class Pruebas {

    private AlumnoData alumnoData;
    private MiConexion conexion;
    private List<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        Alumno preferido = new Alumno(1, 178965, "Santiago", "Batista", fecha, true);
        new Pruebas().conectar(preferido);
    }

    public void conectar(Alumno preferido) {
        conexion = new MiConexion();
        alumnoData = new AlumnoData(conexion);
//        alumnoData.guardarAlumno(preferido);// Agregar nuevo alumno a Universisadg8
//        alumnoData.buscarAlumno(11);// buscar alumno
//        Alumno Alu = alumnoData.buscarAlumno(11);
//        System.out.println("Alumno Nombre:" + Alu.getNombre());
        System.out.println(alumnoData.buscarAlumnoPorDni(12345678));
    //    alumnoData.restaurarAlumno(8);
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(10); // ID del alumno a modificar
        alumno.setDni(12345678); // Nuevo DNI
        alumno.setApellido("Quito"); // Nuevo apellido
        alumno.setNombre("pizza"); // Nuevo nombre
        alumno.setFechaNacimiento(LocalDate.of(1990, 5, 15));
        alumnoData.modificarAlumno(alumno);
        System.out.println(alumnoData.buscarAlumnoPorDni(12345678));
    //    alumnoData.eliminarAlumno(8);
         alumnoData.listarAlumnos();
        for (Iterator<Alumno> it = alumnoData.listarAlumnos().iterator(); it.hasNext();) {
            
            System.out.println(alumno.getNombre()); // Acceder a los datos del alumno (por ejemplo, el nombre)
        }
    }
}
