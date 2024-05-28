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

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion i) {
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, i.getIdAlumno());
            ps.setInt(2, i.getIdMateria());
            ps.setDouble(3, i.getNota());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    // Obtener el id generado (opcional)
                    i.setIdInscripto(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Inscripcion exitosa");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de inscripcion " + ex.getMessage());
        }
    }

    public void actualizarNota(Inscripcion inscripcion) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, inscripcion.getNota()); 
            ps.setInt(2, inscripcion.getIdAlumno());
            ps.setInt(3, inscripcion.getIdMateria());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Inscripción para el alumno " + inscripcion.getIdAlumno() + " no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Inscripción del chango.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion: " + e.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Inscripcion i = new Inscripcion();
                i.setIdInscripto(rs.getInt("idInscripto"));
                i.setNota(rs.getDouble("nota"));
                i.setIdAlumno(rs.getInt("idAlumno"));
                i.setIdMateria(rs.getInt("idMateria"));
                inscripciones.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Inscripcion i = new Inscripcion();
                    i.setIdInscripto(rs.getInt("idInscripto"));
                    i.setNota(rs.getDouble("nota"));
                    i.setIdAlumno(rs.getInt("idAlumno"));
                    i.setIdMateria(rs.getInt("idMateria"));
                    inscripciones.add(i);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> matInscripto = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Materia mat = new Materia();
                    mat.setIdMateria(rs.getInt("idMateria"));
                    mat.setNombre(rs.getString("nombre"));
                    mat.setAnio(rs.getInt("anio"));
                    matInscripto.add(mat);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return matInscripto;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        List<Materia> matNoInscripto = new ArrayList<>();
        String sql = "SELECT materia.idMateria, nombre, anio FROM materia WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Materia mat = new Materia();
                    mat.setIdMateria(rs.getInt("idMateria"));
                    mat.setNombre(rs.getString("nombre"));
                    mat.setAnio(rs.getInt("anio"));
                    matNoInscripto.add(mat);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materias: " + ex.getMessage());
        }
        return matNoInscripto;
    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMateria) {
        List<Alumno> alumnosXmateria = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno, nombre, apellido,dni, fechaNacimiento FROM inscripcion, alumno WHERE inscripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Alumno al = new Alumno();
                    al.setIdAlumno(rs.getInt("idAlumno"));
                    al.setNombre(rs.getString("nombre"));
                    al.setApellido(rs.getString("apellido"));
                    al.setDni(rs.getInt("dni"));
                    al.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumnosXmateria.add(al);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return alumnosXmateria;
    }
}

