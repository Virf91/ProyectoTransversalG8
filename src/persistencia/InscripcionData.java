/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Inscripcion;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO
 */
public class InscripcionData {
    
    private Connection con= null;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData(Conexion connection) {
        this.con = connection.getConexion();
    }
    public void inscripcionData(Inscripcion i){
        String sql = "INSERT INTO inscripcion(idInscripto, nota, idAlumno, idMateria) VALUES (?,?,?,?)";
         try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, i.getIdInscripto());
            ps.setInt(2, i.getNota());
            ps.setInt(3, i.getIdAlumno());
            ps.setInt(4, i.getIdMateria()); 
            

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
}
