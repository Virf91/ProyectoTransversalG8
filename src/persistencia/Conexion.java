/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package persistencia;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String bd = "jdbc:mysql://localhost:3306/universidadg8";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection connection;

// Metodo constructor privado 
    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) { // si es null significa que es la primera conexion
            try {
                Class.forName("org.mariadb.jdbc.Driver"); //se cargan los driver de conexión al gestor de base de datos
                //Setup the connection with the DB
                connection = DriverManager.getConnection(bd, usuario, password);//se establece la conexión a la base de datos invocando al método getConnection()
                // creando un objeto conexion
//                System.out.println("conexion establecida con exito");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }
        }
//        System.out.println("conexion ya esta establecida");
        return connection; // si ya esta conectadodevuelve la misma conexion

    }

}
