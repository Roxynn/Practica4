/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Conexión.Conexión;
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
        btniniciar = new javax.swing.JButton();
        btniregistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 191));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(0, 0, 191));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 430, 30));

        Jcontra.setBackground(new java.awt.Color(0, 0, 191));
        Jcontra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Jcontra.setForeground(new java.awt.Color(255, 255, 255));
        Jcontra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Jcontra.setBorder(null);
        Jcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcontraActionPerformed(evt);
            }
        });
        jPanel1.add(Jcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 430, 30));

        btniniciar.setBackground(new java.awt.Color(255, 0, 255));
        btniniciar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btniniciar.setForeground(new java.awt.Color(255, 255, 255));
        btniniciar.setText("INICIAR");
        btniniciar.setToolTipText("");
        btniniciar.setBorder(null);
        btniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btniniciarMouseClicked(evt);
            }
        });
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 160, 30));

        btniregistrar.setBackground(new java.awt.Color(255, 255, 255));
        btniregistrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btniregistrar.setForeground(new java.awt.Color(255, 0, 255));
        btniregistrar.setText("REGISTRARSE");
        btniregistrar.setBorder(null);
        btniregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btniregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 180, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 190, 60));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 430, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 430, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 190, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿No tienes cuenta todavia?");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flickr.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setText("NOMBRE EMPRESA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 320, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniregistrarActionPerformed
        // TODO add your handling code here:
        
            Registrarse FrmRegistros=new Registrarse();
            FrmRegistros.setVisible(true);
            dispose();
        
        
        
        
        
        
        
    }//GEN-LAST:event_btniregistrarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
       
        
        
   // TODO add your handling code here:
    }//GEN-LAST:event_btniniciarActionPerformed

    private void JcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcontraActionPerformed

    private void btniniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniciarMouseClicked


        ingresar();









        // TODO add your handling code here:
    }//GEN-LAST:event_btniniciarMouseClicked

    
    
    
    
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
                Conexión ConexionSQL= new Conexión();
                
               con1=ConexionSQL.conexion();
               
               
               String SQL="select Usuarios, Contraseña from usuarios where Usuarios='" + User + "' and Contraseña='"+ Pass +"'";
               
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
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btniregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
