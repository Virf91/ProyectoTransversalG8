/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import entidades.Alumno;
import entidades.Materia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.InscripcionData;
import persistencia.MateriaData;

public class AlumnosPorMateria extends javax.swing.JInternalFrame {

    public AlumnosPorMateria() {
        initComponents();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCbListadoMaterias = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAPorMat = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jCbListadoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbListadoMateriasActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una materia");

        jTableAPorMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTableAPorMat);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jCbListadoMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbListadoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbListadoMateriasActionPerformed
 Materia selectedMateria = (Materia) jCbListadoMaterias.getSelectedItem();
    if (selectedMateria != null) {
        InscripcionData inscripcionData = new InscripcionData();
        List<Alumno> alumnos = inscripcionData.obtenerAlumnoPorMateria(selectedMateria.getIdMateria());
        
        // Definir las columnas de la tabla
        String[] columnNames = {"ID", "DNI", "Apellido", "Nombre"};
        
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        // Añadir los alumnos al modelo de la tabla
        for (Alumno alumno : alumnos) {
            Object[] row = new Object[4];
            row[0] = alumno.getIdAlumno();
            row[1] = alumno.getDni();
            row[2] = alumno.getApellido();
            row[3] = alumno.getNombre();
            model.addRow(row);
        }
        
        // Asignar el modelo al JTable
        jTableAPorMat.setModel(model);
    }

    }//GEN-LAST:event_jCbListadoMateriasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

private void llenarCombo(){
        MateriaData materiaData = new MateriaData();
        List<Materia> materias = materiaData.listarMaterias();
        for (Materia materia : materias) {
            jCbListadoMaterias.addItem(materia);
        }

        jCbListadoMaterias.setSelectedItem(0);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Materia> jCbListadoMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAPorMat;
    // End of variables declaration//GEN-END:variables
}
