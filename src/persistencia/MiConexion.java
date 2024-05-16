/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import javax.swing.JOptionPane;

public class MiConexion {

    private static final String bd = "jdbc:mysql://localhost:3307/universidadg8";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection connection = null;

    public MiConexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(bd, usuario, password);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
        return connection;
    }

}
