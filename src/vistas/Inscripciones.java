/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.InscripcionData;

/**
 *
 * @author carba
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private List<Alumno> alumnos = new ArrayList<>();
    private InscripcionData inscripcionData;
    private HashSet<Inscripcion> inscripciones;
    private DefaultTableModel modelo = new DefaultTableModel();
    private AlumnoData alData = new AlumnoData();

    public Inscripciones(HashSet<Inscripcion> inscripciones) {
        initComponents();
        llenarCombo();
        this.alumnos = alData.listarAlumnos();
        this.inscripciones = inscripciones;
        this.inscripcionData = new InscripcionData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLFormulario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBSeleccionAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRBMateriasInscriptas = new javax.swing.JRadioButton();
        jRBMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInscripciones = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setVisible(true);

        jLFormulario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFormulario.setText("Formulario de inscripcion");

        jLabel1.setText("Seleccione un alumno");

        jCBSeleccionAlumno.setName(""); // NOI18N

        jLabel2.setText("Listado de Materias");

        jRBMateriasInscriptas.setText("Materias Inscriptas");
        jRBMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscriptasActionPerformed(evt);
            }
        });

        jRBMateriasNoInscriptas.setText("Materias no Inscriptas");
        jRBMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jTInscripciones.setModel(new javax.swing.table.DefaultTableModel(
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

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jBInscribir, org.jdesktop.beansbinding.ELProperty.create("false"), jTInscripciones, org.jdesktop.beansbinding.BeanProperty.create("columnSelectionAllowed"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jBInscribir, org.jdesktop.beansbinding.ELProperty.create("true"), jTInscripciones, org.jdesktop.beansbinding.BeanProperty.create("rowSelectionAllowed"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTInscripciones);

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

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
                .addContainerGap(281, Short.MAX_VALUE))
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarCombo() {
        for (Alumno alumno1 : alumnos) {
            jCBSeleccionAlumno.addItem(alumno);
        }
        //jCBSeleccionAlumno.setSelectedIndex(0);
    }

    private int obtenerIdMateriaSeleccionada() {
        int selectedRow = jTInscripciones.getSelectedRow();
        if (selectedRow != -1) {
            return (int) jTInscripciones.getValueAt(selectedRow, 0);
        }
        return -1;
    }

    private void jRBMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscriptasActionPerformed

        Alumno al = (Alumno) jCBSeleccionAlumno.getSelectedItem();
        List<Materia> materias = inscripcionData.obtenerMateriasCursadas(al.getIdAlumno());
        List<Inscripcion> inscrip = inscripcionData.obtenerInscripcionesPorAlumno(al.getIdAlumno());

        for (Materia mat : materias) {
            for (Inscripcion ins : inscrip) {
                if (ins.getIdMateria() == mat.getIdMateria()) {
                    Vector renglon = new Vector<>();
                    renglon.add(mat.getIdMateria());
                    renglon.add(mat.getNombre());
                    renglon.add(mat.getAnio());
                    modelo.addRow(renglon);
                }
            }
        }
        jTInscripciones.setModel(modelo);
    }//GEN-LAST:event_jRBMateriasInscriptasActionPerformed

    private void jRBMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNoInscriptasActionPerformed
        Alumno al = (Alumno) jCBSeleccionAlumno.getSelectedItem();
        List<Materia> materias = inscripcionData.obtenerMateriasNoCursadas(al.getIdAlumno());
        List<Inscripcion> inscrip = inscripcionData.obtenerInscripcionesPorAlumno(al.getIdAlumno());
        for (Materia mat : materias) {
            for (Inscripcion ins : inscrip) {

                Vector renglon = new Vector<>();
                renglon.add(mat.getIdMateria());
                renglon.add(mat.getNombre());
                renglon.add(mat.getAnio());
                modelo.addRow(renglon);

            }
        }
        jTInscripciones.setModel(modelo);
    }//GEN-LAST:event_jRBMateriasNoInscriptasActionPerformed


    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed

        Inscripcion ins = new Inscripcion();
        Alumno al = (Alumno) jCBSeleccionAlumno.getSelectedItem();
        int idMat = obtenerIdMateriaSeleccionada();
        if (idMat != -1) {
            ins.setIdMateria(idMat);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una materia.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ins.setIdAlumno(al.getIdAlumno());
        ins.setNota(0.00);
        inscripcionData.guardarInscripcion(ins);
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed

        Alumno al = (Alumno) jCBSeleccionAlumno.getSelectedItem();
        inscripcionData.borrarInscripcionMateriaAlumno(al.getIdAlumno(), obtenerIdMateriaSeleccionada());
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBSeleccionAlumno;
    private javax.swing.JLabel jLFormulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBMateriasInscriptas;
    private javax.swing.JRadioButton jRBMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInscripciones;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
