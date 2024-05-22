package persistencia;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;
    private Inscripcion i = new Inscripcion();
    private Materia M = new Materia();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion i) {
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, i.getIdAlumno());
            ps.setInt(2, i.getIdMateria());
            ps.setDouble(3, i.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Obtener el id generado (opcional)
                i.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de inscripcion " + ex.getMessage());
        }
    }

    public void actualizarNota( Inscripcion inscripcion) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);
                    
            ps.setDouble(1, i.getNota());        
            ps.setInt(2, i.getIdAlumno());
            ps.setInt(3, i.getIdMateria());
           

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Inscripcion para el alumno " + i.getIdAlumno() + " no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
            }
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getIdAlumno());
            ps.setInt(2, i.getIdMateria());
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Inscripción del chango.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion: " + e.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i.setIdInscripto(rs.getInt("idInscripto"));
                i.setNota(rs.getInt("Nota"));
                i.setIdAlumno(rs.getInt("idAlumno"));
                i.setIdMateria(rs.getInt("idMateria"));
                inscripciones.add(i);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i.setIdInscripto(rs.getInt("idInscripto"));
                i.setNota(rs.getInt("Nota"));
                i.setIdAlumno(rs.getInt("idAlumno"));
                i.setIdMateria(rs.getInt("idMateria"));
                inscripciones.add(i);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> matInscripto = new ArrayList<>();
        //List<Integer> idMaterias= new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                    + " materia WHERE incripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("anio"));
                matInscripto.add(mat);
            }
            //traer idMaterias donde se encuentra el alumno X
//            while (rs.next()) {
//                
//                idMaterias.add(rs.getInt("idMateria"));//aca guardo en una List los idMateria donde esta presente el alumno X
//            }
//            
//            for (Integer idMateria : idMaterias) {
//                matInscripto.add(matData.buscarMateria(idMateria)); 
//            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }

        return matInscripto;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        List<Materia> matNoInscripto = new ArrayList<>();
//        List<Integer> idMaterias= new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                    + " materia WHERE incripcion.idMateria = materia.idMateria AND inscripcion.idAlumno != ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("anio"));
                matNoInscripto.add(mat);
            }
//            //traer idMaterias donde se encuentra el alumno X
//            while (rs.next()) {
//                idMaterias.add(rs.getInt("idMateria"));//aca guardo en una List los idMateria donde esta presente el alumno X
//            }
//            
//            for (Integer idMateria : idMaterias) {
//                matNoInscripto.add(matData.buscarMateria(idMateria)); 
//            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return matNoInscripto;
    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMateria) {
        List<Alumno> alumnosXmateria = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idAlumno, nombre, apellido FROM inscripcion,"
                    + " alumno WHERE incripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno al = new Alumno();
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                alumnosXmateria.add(al);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }

        return alumnosXmateria;
    }
}
