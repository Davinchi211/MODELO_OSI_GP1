package main;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author GRUPO_1
 */
public class inicio extends javax.swing.JFrame {

    public ImageIcon imagen;
    public Icon icono;
    capas cap = new capas();
    
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.agregarImagen(cierre,"src/img/salida.png");
        this.agregarImagen(ENL2, "src/img/router-de-wifi.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        cierre = new javax.swing.JLabel();
        bg_imagenes = new javax.swing.JPanel();
        FIS1 = new javax.swing.JLabel();
        ENL2 = new javax.swing.JLabel();
        TRAN1 = new javax.swing.JLabel();
        SESION2 = new javax.swing.JLabel();
        APP1 = new javax.swing.JLabel();
        FIS2 = new javax.swing.JLabel();
        RED1 = new javax.swing.JLabel();
        TRAN2 = new javax.swing.JLabel();
        PRES1 = new javax.swing.JLabel();
        APP2 = new javax.swing.JLabel();
        ENL1 = new javax.swing.JLabel();
        RED2 = new javax.swing.JLabel();
        SESION1 = new javax.swing.JLabel();
        PRES2 = new javax.swing.JLabel();
        RED3 = new javax.swing.JLabel();
        btnCapas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(238, 233, 218));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setBackground(new java.awt.Color(96, 150, 180));
        banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 40)); // NOI18N
        jLabel1.setText("MODELO OSI");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 270, 40));

        bg.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 80));

        barra.setBackground(new java.awt.Color(189, 205, 214));
        barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cierre.setBackground(new java.awt.Color(255, 255, 255));
        cierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cierreMouseEntered(evt);
            }
        });
        barra.add(cierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 32, 30));

        bg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        bg_imagenes.setBackground(new java.awt.Color(189, 205, 214));
        bg_imagenes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bg_imagenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FIS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/router-de-wifi.png"))); // NOI18N
        FIS1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FIS1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FIS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FIS1MouseClicked(evt);
            }
        });
        bg_imagenes.add(FIS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        ENL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ENL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENL2MouseClicked(evt);
            }
        });
        bg_imagenes.add(ENL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 80));

        TRAN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TRAN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TRAN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRAN1MouseClicked(evt);
            }
        });
        bg_imagenes.add(TRAN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 80, 80));

        SESION2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SESION2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SESION2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SESION2MouseClicked(evt);
            }
        });
        bg_imagenes.add(SESION2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 80, 80));

        APP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        APP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APP1MouseClicked(evt);
            }
        });
        bg_imagenes.add(APP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 80, 80));

        FIS2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FIS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FIS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FIS2MouseClicked(evt);
            }
        });
        bg_imagenes.add(FIS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 80));

        RED1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RED1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RED1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RED1MouseClicked(evt);
            }
        });
        bg_imagenes.add(RED1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 80));

        TRAN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TRAN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TRAN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRAN2MouseClicked(evt);
            }
        });
        bg_imagenes.add(TRAN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 80, 80));

        PRES1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PRES1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRES1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRES1MouseClicked(evt);
            }
        });
        bg_imagenes.add(PRES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 80, 80));

        APP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        APP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APP2MouseClicked(evt);
            }
        });
        bg_imagenes.add(APP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, 80));

        ENL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ENL1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENL1MouseClicked(evt);
            }
        });
        bg_imagenes.add(ENL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 80));

        RED2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RED2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RED2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RED2MouseClicked(evt);
            }
        });
        bg_imagenes.add(RED2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 80));

        SESION1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SESION1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SESION1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SESION1MouseClicked(evt);
            }
        });
        bg_imagenes.add(SESION1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 80, 80));

        PRES2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PRES2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRES2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRES2MouseClicked(evt);
            }
        });
        bg_imagenes.add(PRES2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 80, 80));

        RED3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RED3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RED3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RED3MouseClicked(evt);
            }
        });
        bg_imagenes.add(RED3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 80, 80));

        bg.add(bg_imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 580, 340));

        btnCapas.setBackground(new java.awt.Color(96, 150, 180));
        btnCapas.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        btnCapas.setForeground(new java.awt.Color(255, 255, 255));
        btnCapas.setText("CAPAS");
        btnCapas.setBorder(null);
        btnCapas.setBorderPainted(false);
        btnCapas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapas.setFocusPainted(false);
        btnCapas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCapasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCapasMouseExited(evt);
            }
        });
        btnCapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapasActionPerformed(evt);
            }
        });
        bg.add(btnCapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cierreMouseClicked

    private void cierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierreMouseEntered
        cierre.setBackground(Color.black);
    }//GEN-LAST:event_cierreMouseEntered

    private void btnCapasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapasMouseEntered
        btnCapas.setBackground(new Color(189, 205, 214));
        btnCapas.setForeground(Color.black);
    }//GEN-LAST:event_btnCapasMouseEntered

    private void btnCapasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapasMouseExited
        btnCapas.setBackground(new Color(96,150,180));
        btnCapas.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCapasMouseExited

    private void btnCapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapasActionPerformed
        cap.capa(true);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_btnCapasActionPerformed

    private void FIS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIS1MouseClicked
        cap.pushImg(1);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_FIS1MouseClicked

    private void FIS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FIS2MouseClicked
        cap.pushImg(2);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_FIS2MouseClicked

    private void ENL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENL1MouseClicked
        cap.pushImg(3);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_ENL1MouseClicked

    private void ENL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENL2MouseClicked
        cap.pushImg(4);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_ENL2MouseClicked

    private void RED1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RED1MouseClicked
        cap.pushImg(5);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_RED1MouseClicked

    private void RED2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RED2MouseClicked
        cap.pushImg(6);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_RED2MouseClicked

    private void TRAN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRAN1MouseClicked
        cap.pushImg(7);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_TRAN1MouseClicked

    private void TRAN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRAN2MouseClicked
        cap.pushImg(8);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_TRAN2MouseClicked

    private void SESION1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SESION1MouseClicked
        cap.pushImg(9);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_SESION1MouseClicked

    private void SESION2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SESION2MouseClicked
        cap.pushImg(10);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_SESION2MouseClicked

    private void PRES1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRES1MouseClicked
        cap.pushImg(11);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_PRES1MouseClicked

    private void PRES2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRES2MouseClicked
        cap.pushImg(12);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_PRES2MouseClicked

    private void APP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APP1MouseClicked
        cap.pushImg(13);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_APP1MouseClicked

    private void APP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APP2MouseClicked
        cap.pushImg(14);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_APP2MouseClicked

    private void RED3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RED3MouseClicked
        cap.pushImg(15);
        this.setVisible(false);
        cap.setVisible(true);
    }//GEN-LAST:event_RED3MouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
    
    //FUNCION PARA AGREGAR IMAGEN - LABEL
    public void agregarImagen(JLabel lb, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
               this.imagen.getImage().getScaledInstance(
                       lb.getWidth(), 
                       lb.getHeight(), 
                       Image.SCALE_DEFAULT
               )
        );
        lb.setIcon(this.icono);
        this.repaint();        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APP1;
    private javax.swing.JLabel APP2;
    private javax.swing.JLabel ENL1;
    private javax.swing.JLabel ENL2;
    private javax.swing.JLabel FIS1;
    private javax.swing.JLabel FIS2;
    private javax.swing.JLabel PRES1;
    private javax.swing.JLabel PRES2;
    private javax.swing.JLabel RED1;
    private javax.swing.JLabel RED2;
    private javax.swing.JLabel RED3;
    private javax.swing.JLabel SESION1;
    private javax.swing.JLabel SESION2;
    private javax.swing.JLabel TRAN1;
    private javax.swing.JLabel TRAN2;
    private javax.swing.JPanel banner;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg_imagenes;
    private javax.swing.JButton btnCapas;
    private javax.swing.JLabel cierre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}