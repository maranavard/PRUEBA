/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariasalud;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author admin
 */
public class CPrincipal extends javax.swing.JFrame {
  
  
    /**
     * Creates new form CPrincipal
     */
    public CPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MPacientes = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuDPacientes = new javax.swing.JMenuItem();
        MMédicos = new javax.swing.JMenu();
        MenuDMedicos = new javax.swing.JMenuItem();
        MCservicio = new javax.swing.JMenu();
        MenuDCenServicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CENTRO MEDICO DE TECNOLOGIA E INNOVACION ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secretariasalud/Cundinamarca-Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MPacientes.setForeground(new java.awt.Color(0, 102, 255));
        MPacientes.setText("PACIENTES");
        MPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPacientesActionPerformed(evt);
            }
        });
        MPacientes.add(jSeparator1);

        MenuDPacientes.setText("Datos Pacientes");
        MenuDPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDPacientesActionPerformed(evt);
            }
        });
        MPacientes.add(MenuDPacientes);

        jMenuBar1.add(MPacientes);

        MMédicos.setForeground(new java.awt.Color(0, 102, 255));
        MMédicos.setText("MEDICOS");
        MMédicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMédicosActionPerformed(evt);
            }
        });

        MenuDMedicos.setText("Datos Médicos");
        MenuDMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDMedicosActionPerformed(evt);
            }
        });
        MMédicos.add(MenuDMedicos);

        jMenuBar1.add(MMédicos);

        MCservicio.setBackground(new java.awt.Color(51, 153, 255));
        MCservicio.setForeground(new java.awt.Color(51, 102, 255));
        MCservicio.setText("CENTROS DE SERVICIO");

        MenuDCenServicio.setText("Datos Centros de servicio");
        MenuDCenServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDCenServicioActionPerformed(evt);
            }
        });
        MCservicio.add(MenuDCenServicio);

        jMenuBar1.add(MCservicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPacientesActionPerformed
      
      
    }//GEN-LAST:event_MPacientesActionPerformed

    private void MenuDPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDPacientesActionPerformed
           // TODO add your handling code here:
        DPacientes ventanaDPacientes = new DPacientes();
        ventanaDPacientes.setVisible(true);
    }//GEN-LAST:event_MenuDPacientesActionPerformed

    private void MMédicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMédicosActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_MMédicosActionPerformed

    private void MenuDCenServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDCenServicioActionPerformed
        // TODO add your handling code here:
        DCenServicio ventanaDCenServicio =new DCenServicio();
        ventanaDCenServicio.setVisible(true);
    }//GEN-LAST:event_MenuDCenServicioActionPerformed

    private void MenuDMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDMedicosActionPerformed
        // TODO add your handling code here:
           DMedicos ventanaDMedicos=new DMedicos();
        ventanaDMedicos.setVisible(true);
    }//GEN-LAST:event_MenuDMedicosActionPerformed

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
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MCservicio;
    private javax.swing.JMenu MMédicos;
    private javax.swing.JMenu MPacientes;
    private javax.swing.JMenuItem MenuDCenServicio;
    private javax.swing.JMenuItem MenuDMedicos;
    private javax.swing.JMenuItem MenuDPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private static class DefaulTableModel extends DefaultTableModel {

        public DefaulTableModel() {
        }
    }
}
