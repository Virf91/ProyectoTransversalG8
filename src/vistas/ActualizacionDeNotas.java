
package vistas;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.InscripcionData;

public class ActualizacionDeNotas extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private List<Alumno> alumnos = new ArrayList<>();
    private InscripcionData inscripcionData = new InscripcionData();
    private AlumnoData alData = new AlumnoData();
    private List<Inscripcion> inscripciones = new ArrayList<>();
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1==2;
        }        
    };
    public ActualizacionDeNotas() {
        initComponents();
        armarCabecera();
        this.alumnos = alData.listarAlumnos();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLCargaDeNotas = new javax.swing.JLabel();
        jLSeleccionAlumno = new javax.swing.JLabel();
        jCBSeleccioneAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaNotas = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLCargaDeNotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLCargaDeNotas.setText("Carga de Notas");

        jLSeleccionAlumno.setText("Seleccione un Alumno");

        jCBSeleccioneAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSeleccioneAlumnoActionPerformed(evt);
            }
        });

        jTTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTTablaNotas.setColumnSelectionAllowed(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jBGuardar, org.jdesktop.beansbinding.ELProperty.create("false"), jTTablaNotas, org.jdesktop.beansbinding.BeanProperty.create("columnSelectionAllowed"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jBGuardar, org.jdesktop.beansbinding.ELProperty.create("true"), jTTablaNotas, org.jdesktop.beansbinding.BeanProperty.create("rowSelectionAllowed"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTTablaNotas);
        if (jTTablaNotas.getColumnModel().getColumnCount() > 0) {
            jTTablaNotas.getColumnModel().getColumn(0).setResizable(false);
            jTTablaNotas.getColumnModel().getColumn(1).setResizable(false);
        }

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSeleccionAlumno)
                                .addGap(27, 27, 27)
                                .addComponent(jCBSeleccioneAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLCargaDeNotas)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLCargaDeNotas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSeleccionAlumno)
                    .addComponent(jCBSeleccioneAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(23, 23, 23))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarCombo() {
        if (alumnos.isEmpty()) {
            System.out.println("lista alumnos vacia ");
        }
        for (Alumno alumno1 : alumnos) {
            jCBSeleccioneAlumno.addItem(alumno1);
        }
        //jCBSeleccioneAlumno.setSelectedIndex(0);
    }

    private Double obtenerNotaInscripcionSeleccionada() {
    int selectedRow = jTTablaNotas.getSelectedRow();
    if (selectedRow != -1) {
        Object value = jTTablaNotas.getValueAt(selectedRow, 2);
        if (value instanceof Double) {
            return (Double) value;
        } else if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
    return -1.0;
}
    private void jCBSeleccioneAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSeleccioneAlumnoActionPerformed
        Alumno al = (Alumno) jCBSeleccioneAlumno.getSelectedItem();
        List<Materia> materiasCursadas = inscripcionData.obtenerMateriasCursadas(al.getIdAlumno());
        inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(al.getIdAlumno());
        modelo.setRowCount(0);

        for (Materia mat : materiasCursadas) {
            for (Inscripcion inscripcion : inscripciones) {
                if (inscripcion.getIdMateria() == mat.getIdMateria()) {
                    Vector renglon = new Vector<>();
                    renglon.add(inscripcion.getIdInscripto());
                    renglon.add(mat.getNombre());
                    renglon.add(inscripcion.getNota());
                    modelo.addRow(renglon);
                }
            }
        }
        modelo.fireTableDataChanged();
        jTTablaNotas.setModel(modelo);
    }//GEN-LAST:event_jCBSeleccioneAlumnoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Alumno al = (Alumno) jCBSeleccioneAlumno.getSelectedItem();
        Inscripcion ins = new Inscripcion();
      
        for (Inscripcion ins1 : inscripciones) {
            if (ins1.getIdAlumno() == al.getIdAlumno()) {
                ins = ins1;
            }
        }

        ins.setNota(obtenerNotaInscripcionSeleccionada());
        inscripcionData.actualizarNota(ins);
    }//GEN-LAST:event_jBGuardarActionPerformed
    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTTablaNotas.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBSeleccioneAlumno;
    private javax.swing.JLabel jLCargaDeNotas;
    private javax.swing.JLabel jLSeleccionAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTablaNotas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
