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
    private  List<Alumno> alumnos = new ArrayList<>();

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
         System.out.println( alumnoData.buscarAlumnoPorDni(12345678));
         

    }
}
