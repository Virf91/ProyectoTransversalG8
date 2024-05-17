/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carba
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData(Conexion connection) {
        this.con = connection.getConexion();
    }

    public void guardarMateria(Materia m) {
        String sql = "INSERT INTO materia( nombre, anio, estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setBoolean(3, m.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Obtener el id generado (opcional)
                m.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con éxito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + ex.getMessage());
        }
    }

    public void modificarMateria(Materia m) {
        String sql = "UPDATE materia SET idMateria = ?, nombre = ?, anio = ?, estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
                    //UPDATE `materia` SET `idMateria`='',`nombre`='',`anio`='',`estado`='' WHERE 1
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,m.getIdMateria());
            ps.setString(2, m.getNombre());
            ps.setInt(3, m.getAnio());
            ps.setBoolean(4, m.isEstado());
            ps.setInt(5, m.getIdMateria());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Materia no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
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

}
