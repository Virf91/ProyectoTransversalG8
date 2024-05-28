
package vistas;

import entidades.Alumno;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import javax.swing.JOptionPane;
import persistencia.AlumnoData;

public class GestionDeAlumnos extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private HashSet<Alumno> alumnos;
    private AlumnoData alumnoData;

    /**
     * Creates new form GestionDeAlumnos
     */
    public GestionDeAlumnos() {
        initComponents();
        this.alumnos = alumnos;
        alumnoData = new AlumnoData();
        alumno = new Alumno();
        configurarBotones();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaNacimiento = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jDFechNac = new com.toedter.calendar.JDateChooser();

        jCheckBox1.setText("jCheckBox1");

        setMaximizable(true);
        setResizable(true);
        setTitle("ALUMNO");
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Alumno");

        jlDocumento.setText("Documento");

        jlApellido.setText("Apellido");

        jlNombre.setText("Nombre");

        jlEstado.setText("Estado");

        jlFechaNacimiento.setText("Fecha de Nacimiento");

        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFechaNacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(jDFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDocumento)
                                    .addComponent(jlApellido)
                                    .addComponent(jlNombre)
                                    .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBEstado)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jbBuscar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDocumento)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellido)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jlEstado))
                    .addComponent(jRBEstado))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlFechaNacimiento)
                    .addComponent(jDFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void configurarBotones() {

        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(false);
    }

    private void jDFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaNacPropertyChange
        if (jDFechNac.getDate() != null) {

            LocalDate fechaNacimiento = jDFechNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        }
    }//GEN-LAST:event_jDFechaNacPropertyChange
    private boolean validaEntero(String texto) {
        if (!texto.matches("^\\d+$")) {
            JOptionPane.showMessageDialog(this, "Deberás ingresar un número válido.");
            return false;
        }
        return true;
    }
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int dni = 0;
        String apellido;
        String nombre;
        String dniText = jTDni.getText();
        Boolean estado;
      
        if (jTDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ingrese dni");
            return;
        }
        
         dni = Integer.parseInt(dniText); // Convertir el texto a un número entero

            // Llamar al método buscarAlumnoPorDni
            Alumno alumno = alumnoData.buscarAlumnoPorDni(dni);
            
            if (alumno == null) {
//                JOptionPane.showMessageDialog(null,"No se encontró ningún alumno con el DNI proporcionado");
                throw new NullPointerException("No se encontró ningún alumno con el DNI proporcionado.");
            }
            alumnoData.buscarAlumno(alumno.getIdAlumno());
            
        if(alumno != null){ // si no existe el alumno no hago nada
            
        jTApellido.setText(alumno.getApellido());
        jTNombre.setText(alumno.getNombre());
        jRBEstado.setSelected(alumno.isEstado());

        // Obtener la fecha de nacimiento Alumno (LocalDate)
        LocalDate fechaNacAlumno = alumno.getFechaNacimiento();
        // Convertir LocalDate a Date que el que usa jDateChooser
        //Al utilizar java.sql.Date.valueOf(fechaNacimientoLocalDate), 
        //estás convirtiendo directamente el LocalDate a un java.util.Date 
        //sin tener que pasar por un Instant.
        Date fechaNacimientoDate = java.sql.Date.valueOf(fechaNacAlumno);

        // Establecer la fecha de nacimiento en el JDateChooser
        jDFechNac.setDate(fechaNacimientoDate);
        jbEliminar.setEnabled(true);
      
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {
            // Obtener la fecha en formato java.util.Date desde el componente de fecha
            java.util.Date fechadateUtil = (java.util.Date) jDFechNac.getDate();

            if (fechadateUtil == null) {
                throw new NullPointerException("La fecha obtenida de jDFechNac es null");
            }

            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fechadateSql = new java.sql.Date(fechadateUtil.getTime());

            // Convertir java.sql.Date a java.util.Date para su manipulación
            java.util.Date fechadateUtilAgain = new java.util.Date(fechadateSql.getTime());

            // Convertir java.util.Date a LocalDate
            Instant instant = fechadateUtilAgain.toInstant();
            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
            LocalDate fecha = zonedDateTime.toLocalDate();

            String dniText = jTDni.getText();
            String nombreText = jTNombre.getText();
            String apellidoText = jTApellido.getText();

            if (dniText == null || dniText.isEmpty()) {
                throw new NullPointerException("El campo DNI es null o está vacío");
            }
            if (nombreText == null || nombreText.isEmpty()) {
                throw new NullPointerException("El campo Nombre es null o está vacío");
            }
            if (apellidoText == null || apellidoText.isEmpty()) {
                throw new NullPointerException("El campo Apellido es null o está vacío");
            }

            int dni = Integer.parseInt(dniText);
            boolean estado = alumno.isEstado();
            Alumno nuevo = new Alumno(dni, nombreText, apellidoText, fecha, estado);

            AlumnoData alumnoData = new AlumnoData();
            jbGuardar.setEnabled(true);
            alumnoData.guardarAlumno(nuevo); // Agregar nuevo alumno a Universidad

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el DNI a número: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
    }//GEN-LAST:event_jbGuardarActionPerformed
    private void limpiarCampos() {
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jRBEstado.setSelected(false);
        jDFechNac.setDate(null);

    }
    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed

        alumno.setEstado(true);

    }//GEN-LAST:event_jRBEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

    try {
        int dni = 0;
        
        if (!jTDni.getText().isEmpty() || !jTApellido.getText().isEmpty() || !jTNombre.getText().isEmpty()) {
            String dniText = jTDni.getText();
            
            if (dniText.isEmpty()) {
                throw new IllegalArgumentException("El campo DNI no puede estar vacío.");
            }
            
            dni = Integer.parseInt(dniText); // Convertir el texto a un número entero

            // Llamar al método buscarAlumnoPorDni
            Alumno alumno = alumnoData.buscarAlumnoPorDni(dni);
            
            if (alumno == null) {
//                JOptionPane.showMessageDialog(null,"No se encontró ningún alumno con el DNI proporcionado");
                throw new NullPointerException("No se encontró ningún alumno con el DNI proporcionado.");
            }
            
            // Eliminar al alumno (poner en falso el estado del alumno)
            alumnoData.eliminarAlumno(alumno.getIdAlumno());

            // Limpiar los campos
            limpiarCampos();
            
            JOptionPane.showMessageDialog(null, "Alumno eliminado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            throw new IllegalArgumentException("Debe llenar al menos uno de los campos: DNI, Apellido o Nombre.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El DNI debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
 
}

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       jbGuardar.setEnabled(true);
         // Limpiar los campos
            limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDFechNac;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaNacimiento;
    private javax.swing.JLabel jlNombre;
    // End of variables declaration//GEN-END:variables

}
