/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfathedog;

import javax.swing.JOptionPane;

/**
 *
 * @author djs
 */
public class AlfaTheDog extends javax.swing.JFrame {

    /**
     * Creates new form VentaPrincipal
     */
    public AlfaTheDog() {
        initComponents();
        setSize(530, 330);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JLabel();
        pasword = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        alfaTheDogNombre = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        login.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        login.setText("Usuario:");
        getContentPane().add(login);
        login.setBounds(150, 150, 70, 27);

        pasword.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pasword.setText("Contraseña:");
        getContentPane().add(pasword);
        pasword.setBounds(150, 180, 90, 27);
        getContentPane().add(usuario);
        usuario.setBounds(240, 150, 140, 26);

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña);
        contraseña.setBounds(240, 180, 140, 26);

        entrar.setText("ENTRAR");
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(280, 210, 97, 29);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logopq.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(440, 230, 90, 80);

        alfaTheDogNombre.setFont(new java.awt.Font("SignPainter", 3, 48)); // NOI18N
        alfaTheDogNombre.setText("AlfaTheDog");
        getContentPane().add(alfaTheDogNombre);
        alfaTheDogNombre.setBounds(180, 70, 190, 60);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 530, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        String Login="djs";
        String Password="djs";
        
        String Pass= new String(contraseña.getPassword());
        
        if (usuario.getText().equals(Login) && Pass.equals(Password)){
            
            Clientes CL= new Clientes();
            
            CL.setVisible(true);
            
            dispose();
            
     
        }
        else {
            JOptionPane.showMessageDialog(this, "usuario o contraseña incorrectos");
        }
      
    }//GEN-LAST:event_entrarMouseClicked

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
            java.util.logging.Logger.getLogger(AlfaTheDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlfaTheDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlfaTheDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlfaTheDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlfaTheDog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alfaTheDogNombre;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pasword;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
