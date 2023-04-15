package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import libreriaproyecto.Contrasena;
import libreriaproyecto.Recordar;

public class Login extends javax.swing.JFrame 
{
    FondoPanel fondo = new FondoPanel();

    public Login() 
    {
        setContentPane(fondo);
        initComponents();
        lblSee.setVisible(false);

        setLocationRelativeTo(null);
        setSize(872,600);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(50);
        lblSee = new javax.swing.JLabel();
        lblBlind = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pssContrasena = new javax.swing.JPasswordField();
        lblIniSes = new javax.swing.JLabel();
        lblOlvidarCont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot_2023-02-09_184636-removebg-preview 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 160));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 75)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STAY FASHI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 370, 170));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 75)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("AY FASHION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 380, 170));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blind.png"))); // NOI18N
        lblSee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeMouseClicked(evt);
            }
        });
        jPanel2.add(lblSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 120, -1, -1));

        lblBlind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/see.png"))); // NOI18N
        lblBlind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBlind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlindMouseClicked(evt);
            }
        });
        jPanel2.add(lblBlind, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 45, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(191, 166, 161, 170));
        txtUsuario.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Nombre de usuario");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 40));

        pssContrasena.setBackground(new java.awt.Color(191, 166, 161, 170));
        pssContrasena.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        pssContrasena.setForeground(new java.awt.Color(255, 255, 255));
        pssContrasena.setText("Contraseña");
        pssContrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pssContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pssContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pssContrasenaFocusLost(evt);
            }
        });
        jPanel2.add(pssContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 430, 40));

        lblIniSes.setBackground(new java.awt.Color(170, 145, 138));
        lblIniSes.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblIniSes.setForeground(new java.awt.Color(255, 255, 255));
        lblIniSes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniSes.setText("Iniciar Sesión");
        lblIniSes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblIniSes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniSes.setOpaque(true);
        lblIniSes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniSesMouseClicked(evt);
            }
        });
        jPanel2.add(lblIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 320, 50));

        lblOlvidarCont.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblOlvidarCont.setForeground(new java.awt.Color(140, 91, 87));
        lblOlvidarCont.setText("Olvidé mi contraseña");
        lblOlvidarCont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOlvidarCont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOlvidarContMouseClicked(evt);
            }
        });
        jPanel2.add(lblOlvidarCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Nombre de usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setText("Nombre de usuario");
            txtUsuario.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void pssContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusGained
        // TODO add your handling code here:
        if(String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
        {
            pssContrasena.setText("");
            pssContrasena.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaFocusGained

    private void pssContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pssContrasenaFocusLost
        if(String.valueOf(pssContrasena.getPassword()).equals(""))
        {
            pssContrasena.setText("Contraseña");
            pssContrasena.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pssContrasenaFocusLost

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked

    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void lblIniSesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniSesMouseClicked
        Contrasena obc = new Contrasena(String.valueOf(pssContrasena.getPassword()));
        if(!String.valueOf(pssContrasena.getPassword()).isEmpty() && !txtUsuario.getText().isEmpty() && !String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
        {
            if(!obc.ValidarContrasena())
               // JOptionPane.showMessageDialog(this, "Contrasena valida", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
            //else
                JOptionPane.showMessageDialog(this, obc.Error(), "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(txtUsuario.getText().isEmpty() || txtUsuario.getText().equals("Nombre de usuario"))
                JOptionPane.showMessageDialog(this, "Debes escribir un Nombre de Usuario", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
            if(String.valueOf(pssContrasena.getPassword()).isEmpty() || String.valueOf(pssContrasena.getPassword()).equals("Contraseña"))
                JOptionPane.showMessageDialog(this, "Debes escribir una Contraseña", "Bienvenido al Sistema...", JOptionPane.ERROR_MESSAGE);
        }
        
        if(txtUsuario.getText().equals("Yuriana") && String.valueOf(pssContrasena.getPassword()).equals("Yuriana09@@"))
        {
            PrinDue frmPrincipal = new PrinDue();
            frmPrincipal.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblIniSesMouseClicked

    private void lblOlvidarContMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvidarContMouseClicked
        Recordar obr = new Recordar();
        String contrasena = obr.recuperarContrasena(txtUsuario.getText());
        if(contrasena != null)
        {
            pssContrasena.setText(contrasena);
            pssContrasena.setForeground(new Color(255,255,255));
        }
        else
            JOptionPane.showMessageDialog(this, "El usuario no esta registrado", "Recuperación de Contraseña...", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_lblOlvidarContMouseClicked

    private void lblBlindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlindMouseClicked
        lblBlind.setVisible(false);
        lblSee.setVisible(true);
        pssContrasena.setEchoChar((char)0);
    }//GEN-LAST:event_lblBlindMouseClicked

    private void lblSeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeMouseClicked
        lblBlind.setVisible(true);
        lblSee.setVisible(false);
        pssContrasena.setEchoChar('*');
    }//GEN-LAST:event_lblSeeMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondo.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
 
        public RoundedPanel(int radius) 
        {
            super();
            cornerRadius = radius;   
        }
         
        @Override
        protected void paintComponent(Graphics g) 
        {
            Image imagen;
            imagen = new ImageIcon(getClass().getResource("/img/Fondo.png")).getImage();
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            //graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) 
                graphics.setColor(backgroundColor);
            else
                graphics.setColor(getBackground());
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBlind;
    private javax.swing.JLabel lblIniSes;
    private javax.swing.JLabel lblOlvidarCont;
    private javax.swing.JLabel lblSee;
    private javax.swing.JPasswordField pssContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
