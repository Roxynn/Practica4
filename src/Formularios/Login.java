/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Conexion.Bd_conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;


public class Login extends javax.swing.JFrame {



 
    public Login() {
        initComponents();

        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        Jcontra = new javax.swing.JPasswordField();
        LOGIN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(0, 153, 102));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 230, 30));

        Jcontra.setBackground(new java.awt.Color(23, 24, 30));
        Jcontra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Jcontra.setForeground(new java.awt.Color(255, 255, 255));
        Jcontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jcontra.setBorder(null);
        Jcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcontraActionPerformed(evt);
            }
        });
        jPanel1.add(Jcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 230, 30));

        LOGIN.setBackground(new java.awt.Color(23, 24, 30));
        LOGIN.setToolTipText("");
        LOGIN.setBorder(null);
        LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINMouseClicked(evt);
            }
        });
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 180, 30));

        jButton2.setBackground(new java.awt.Color(23, 24, 30));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 240, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 140, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 280, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
            Registrarse FrmRegistros=new Registrarse();
            FrmRegistros.setVisible(true);
            dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
       
        
        
   // TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

    private void JcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcontraActionPerformed

    private void LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINMouseClicked


        ingresar();


        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINMouseClicked

   
    
    public void ingresar(){
        
        
        Connection con1=null;
        PreparedStatement pst = null;
        ResultSet rs= null;
        
        String User =txtUsuario.getText();
        String Pass =Jcontra.getText();
        
        
        if (User.equals("") |Pass.equals("")){
            JOptionPane.showMessageDialog(null,"Uno o mas campos estan vacios, por favor llenarlos");
            
            
         }else{
            try {
                Bd_conexion ConexionSQL= new Bd_conexion();
                
               con1=ConexionSQL.conexion();
               
               
               String SQL="select Usuarios, Contra from usuarios where Usuarios='" + User + "' and Contra='"+ Pass +"'";
               
               pst=(PreparedStatement) con1.prepareStatement(SQL);
                     
               rs = pst.executeQuery();
               if (rs.next()) {
                   
            PantallaIngreso FrmPanel=new PantallaIngreso();
            FrmPanel.setVisible(true);
            dispose();
                   
                   
                   
               }else{
                   
                   
                   JOptionPane.showMessageDialog(null,"Usuario o password incorrectos. Vuelva a intentarlo de nuevo");
               
                   
                   
                   
               }
                       
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Error inesperado" + e.getMessage());
                
                
                
                
            }
            
            }
        
        }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Jcontra;
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
