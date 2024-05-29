/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.HashSet;

/**
 *
 * @author virfe
 */
public class Menu extends javax.swing.JFrame {

    private HashSet<Alumno> alumnos = new HashSet<>();
    private HashSet<Materia> materias = new HashSet<>();
    private HashSet<Inscripcion> inscripciones = new HashSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMItemAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMItemMateria = new javax.swing.JMenuItem();
        jMAdmin = new javax.swing.JMenu();
        jMItemInscripciones = new javax.swing.JMenuItem();
        jMItemNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMItemConsultas = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMItemAlumno.setText("Formulario de Alumno");
        jMItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMItemAlumno);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMItemMateria.setText("Formulario de Materia");
        jMItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMItemMateria);

        jMenuBar1.add(jMMateria);

        jMAdmin.setText("Administración");

        jMItemInscripciones.setText("Manejo de inscripciones");
        jMItemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemInscripcionesActionPerformed(evt);
            }
        });
        jMAdmin.add(jMItemInscripciones);

        jMItemNotas.setText("Manipulación de notas");
        jMItemNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemNotasActionPerformed(evt);
            }
        });
        jMAdmin.add(jMItemNotas);

        jMenuBar1.add(jMAdmin);

        jMConsultas.setText("Consultas");

        jMItemConsultas.setText("Alumnos por Materia");
        jMItemConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemConsultasActionPerformed(evt);
            }
        });
        jMConsultas.add(jMItemConsultas);

        jMenuBar1.add(jMConsultas);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAlumnoActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        GestionDeAlumnos gav = new GestionDeAlumnos();// se crea una instancia de la ventana, y por defecto es invisble
        gav.setVisible(true);// colocamos que sea visible  
        gav.setLocation(200, 100);
        escritorio.add(gav);//agrego al escritorio la ventana de gestion de alumnos
        escritorio.moveToFront(gav);// traigo al frente la ventana    }    
    }//GEN-LAST:event_jMItemAlumnoActionPerformed

    private void jMItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemMateriaActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        GestionDeMaterias gmv = new GestionDeMaterias(materias);// se crea una instancia de la ventana, y por defecto es invisble
        gmv.setVisible(true);// colocamos que sea visible
        gmv.setLocation(200, 100);
        escritorio.add(gmv);//agrego al escritorio la ventana de gestion de alumnos
        escritorio.moveToFront(gmv);// traigo al frente la ventana    }
    }//GEN-LAST:event_jMItemMateriaActionPerformed

    private void jMItemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemInscripcionesActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        Inscripciones ins = new Inscripciones(inscripciones);// se crea una instancia de la ventana, y por defecto es invisble
        ins.setVisible(true);// colocamos que sea visible
        ins.setLocation(200, 100);
        escritorio.add(ins);//agrego al escritorio la ventana de gestion de alumnos
        escritorio.moveToFront(ins);// traigo al frente la ventana    }
    }//GEN-LAST:event_jMItemInscripcionesActionPerformed

    private void jMItemNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemNotasActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        ActualizacionDeNotas actNotas = new ActualizacionDeNotas();// se crea una instancia de la ventana, y por defecto es invisble
        actNotas.setVisible(true);// colocamos que sea visible
        actNotas.setLocation(200, 100);
        escritorio.add(actNotas);//agrego al escritorio la ventana de gestion de alumnos
        escritorio.moveToFront(actNotas);// traigo al frente la ventana    }
    }//GEN-LAST:event_jMItemNotasActionPerformed

    private void jMItemConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemConsultasActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        AlumnosPorMateria aluXMat = new AlumnosPorMateria();// se crea una instancia de la ventana, y por defecto es invisble
        aluXMat.setVisible(true);// colocamos que sea visible
        aluXMat.setLocation(200, 100);
        escritorio.add(aluXMat);//agrego al escritorio la ventana de gestion de alumnos
        escritorio.moveToFront(aluXMat);// traigo al frente la ventana
    }//GEN-LAST:event_jMItemConsultasActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        System.exit(0);    }//GEN-LAST:event_jMSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMItemAlumno;
    private javax.swing.JMenuItem jMItemConsultas;
    private javax.swing.JMenuItem jMItemInscripciones;
    private javax.swing.JMenuItem jMItemMateria;
    private javax.swing.JMenuItem jMItemNotas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
