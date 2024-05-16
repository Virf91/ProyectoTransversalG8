package vistas;

import entidades.Alumno;
import java.time.LocalDate;
import persistencia.AlumnoData;
import persistencia.MiConexion;

public class Pruebas {

    private AlumnoData alumnoData;
    private MiConexion conexion;

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        Alumno preferido = new Alumno(1, 123, "Federici", "Virginia", fecha, true);
        new Pruebas().conectar(preferido);
    }

    public void conectar(Alumno preferido) {
        conexion = new MiConexion();
        alumnoData = new AlumnoData(conexion);
        alumnoData.guardarAlumno(preferido);
    }
}
