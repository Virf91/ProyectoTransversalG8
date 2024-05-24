/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import java.util.HashSet;

/**
 *
 * @author carba
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private HashSet<Inscripcion> inscripciones;

    public Inscripciones(HashSet<Inscripcion> inscripciones) {
        initComponents();
        this.inscripciones = inscripciones;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFormulario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBSeleccionAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRBMateriasInscriptas = new javax.swing.JRadioButton();
        jRBMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setVisible(true);

        jLFormulario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFormulario.setText("Formulario de inscripcion");

        jLabel1.setText("Seleccione un alumno");

        jCBSeleccionAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBSeleccionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccionAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Listado de Materias");

        jRBMateriasInscriptas.setText("Materias Inscriptas");

        jRBMateriasNoInscriptas.setText("Materias no Inscriptas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Inscripcion", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBInscribir.setText("Inscribir");

        jBAnularInscripcion.setText("Anular Inscripcion");
        jBAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscripcionActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jCBSeleccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jRBMateriasInscriptas)
                        .addGap(33, 33, 33)
                        .addComponent(jRBMateriasNoInscriptas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jBInscribir)
                        .addGap(53, 53, 53)
                        .addComponent(jBAnularInscripcion)
                        .addGap(42, 42, 42)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLFormulario)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLFormulario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBSeleccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMateriasInscriptas)
                    .addComponent(jRBMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("FORMULARIO DE INSCRIPCION");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSeleccionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccionAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSeleccionAlumnoActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBSeleccionAlumno;
    private javax.swing.JLabel jLFormulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBMateriasInscriptas;
    private javax.swing.JRadioButton jRBMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
