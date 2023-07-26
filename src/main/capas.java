package main;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author GRUPO_1
 */

    
public class capas extends javax.swing.JFrame {

    private int dato;
    private boolean capas;
    public ImageIcon imag;
    public Icon icon;
    public capas() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.agregarIma(cierre_label, "src/img/return.png");
        iFIS2.setVisible(false);
        iFIS1.setVisible(false);
        iENL1.setVisible(false);
        iENL2.setVisible(false);
        iRED1.setVisible(false);
        iRED2.setVisible(false);
        iTRAN1.setVisible(false);
        iTRAN2.setVisible(false);
        iSES1.setVisible(false);
        iSES2.setVisible(false);
        iPRES1.setVisible(false);
        iPRES2.setVisible(false);
        iAPP1.setVisible(false);
        iAPP2.setVisible(false);
        iRED3.setVisible(false);
    }
    
    //FUNCION MOSTRAR ÚNICAMENTE LA IMAGEN SELECCIONADA
    public void pushImg(int dato){
        this.dato=dato;
        if(dato==1){
            iFIS1.setVisible(true);
        }
        if(dato==2){
            iFIS2.setVisible(true);
        }
        if(dato==3){
            iENL1.setVisible(true);
        }
        if(dato==4){
            iENL2.setVisible(true);
        }
        if(dato==5){
            iRED1.setVisible(true);
        }
        if(dato==6){
            iRED2.setVisible(true);
        }
        if(dato==7){
            iTRAN1.setVisible(true);
        }
        if(dato==8){
            iTRAN2.setVisible(true);
        }
        if(dato==9){
            iSES1.setVisible(true);
        }
        if(dato==10){
            iSES2.setVisible(true);
        }
        if(dato==11){
            iPRES1.setVisible(true);
        }
        if(dato==12){
            iPRES2.setVisible(true);
        }
        if(dato==13){
            iAPP1.setVisible(true);
        }
        if(dato==14){
            iAPP2.setVisible(true);
        }
        if(dato==15){
            iRED3.setVisible(true);
        }
        
    }   
    //FUNCION MOSTRAR CAPAS
    public void capa(boolean capa){
        this.capas = capa;
        if(capa == true){
        iFIS2.setVisible(true);
        iFIS1.setVisible(true);
        iENL1.setVisible(true);
        iENL2.setVisible(true);
        iRED1.setVisible(true);
        iRED2.setVisible(true);
        iTRAN1.setVisible(true);
        iTRAN2.setVisible(true);
        iSES1.setVisible(true);
        iSES2.setVisible(true);
        iPRES1.setVisible(true);
        iPRES2.setVisible(true);
        iAPP1.setVisible(true);
        iAPP2.setVisible(true);
        iRED3.setVisible(true);
        }
    }
     
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_capas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cierre_label = new javax.swing.JLabel();
        lbAplicacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbPresentacion = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbSesion = new javax.swing.JLabel();
        lbTrans = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbRed = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbEnlace = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbFisica = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        iENL2 = new javax.swing.JLabel();
        iFIS1 = new javax.swing.JLabel();
        iENL1 = new javax.swing.JLabel();
        iRED1 = new javax.swing.JLabel();
        iTRAN1 = new javax.swing.JLabel();
        iSES1 = new javax.swing.JLabel();
        iPRES1 = new javax.swing.JLabel();
        iAPP1 = new javax.swing.JLabel();
        iSES2 = new javax.swing.JLabel();
        iFIS2 = new javax.swing.JLabel();
        iPRES2 = new javax.swing.JLabel();
        iTRAN2 = new javax.swing.JLabel();
        iRED2 = new javax.swing.JLabel();
        iRED3 = new javax.swing.JLabel();
        iAPP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_capas.setBackground(new java.awt.Color(155, 164, 181));
        bg_capas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cierre_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cierre_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cierre_labelMouseClicked(evt);
            }
        });
        jPanel2.add(cierre_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        bg_capas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 32));

        lbAplicacion.setBackground(new java.awt.Color(33, 42, 62));
        lbAplicacion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbAplicacion.setForeground(new java.awt.Color(241, 246, 249));
        lbAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAplicacion.setText("APLICACIÓN");
        lbAplicacion.setOpaque(true);
        lbAplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAplicacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAplicacionMouseExited(evt);
            }
        });
        bg_capas.add(lbAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, 50));

        jSeparator2.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator2.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 10));

        jSeparator3.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator3.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, 10));

        lbPresentacion.setBackground(new java.awt.Color(33, 42, 62));
        lbPresentacion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbPresentacion.setForeground(new java.awt.Color(241, 246, 249));
        lbPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPresentacion.setText("PRESENTACIÓN");
        lbPresentacion.setOpaque(true);
        lbPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPresentacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPresentacionMouseExited(evt);
            }
        });
        bg_capas.add(lbPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, 50));

        jSeparator4.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator4.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 10));

        lbSesion.setBackground(new java.awt.Color(33, 42, 62));
        lbSesion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbSesion.setForeground(new java.awt.Color(241, 246, 249));
        lbSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSesion.setText("SESIÓN");
        lbSesion.setOpaque(true);
        lbSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSesionMouseExited(evt);
            }
        });
        bg_capas.add(lbSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, 50));

        lbTrans.setBackground(new java.awt.Color(33, 42, 62));
        lbTrans.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbTrans.setForeground(new java.awt.Color(241, 246, 249));
        lbTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTrans.setText("TRANSPORTE");
        lbTrans.setOpaque(true);
        lbTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTransMouseExited(evt);
            }
        });
        bg_capas.add(lbTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 220, 50));

        jSeparator5.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator5.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator5.setOpaque(true);
        jSeparator5.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 220, 10));

        lbRed.setBackground(new java.awt.Color(33, 42, 62));
        lbRed.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbRed.setForeground(new java.awt.Color(241, 246, 249));
        lbRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRed.setText("RED");
        lbRed.setOpaque(true);
        lbRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRedMouseExited(evt);
            }
        });
        bg_capas.add(lbRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, 50));

        jSeparator6.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator6.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator6.setOpaque(true);
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 220, 10));

        lbEnlace.setBackground(new java.awt.Color(33, 42, 62));
        lbEnlace.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbEnlace.setForeground(new java.awt.Color(241, 246, 249));
        lbEnlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEnlace.setText("ENLACE");
        lbEnlace.setOpaque(true);
        lbEnlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEnlaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEnlaceMouseExited(evt);
            }
        });
        bg_capas.add(lbEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 220, 50));

        jSeparator7.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator7.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 220, 10));

        lbFisica.setBackground(new java.awt.Color(33, 42, 62));
        lbFisica.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbFisica.setForeground(new java.awt.Color(241, 246, 249));
        lbFisica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFisica.setText("FÍSICA");
        lbFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbFisica.setOpaque(true);
        lbFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFisicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFisicaMouseExited(evt);
            }
        });
        bg_capas.add(lbFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 220, 50));

        jSeparator8.setBackground(new java.awt.Color(155, 164, 181));
        jSeparator8.setForeground(new java.awt.Color(33, 42, 62));
        jSeparator8.setOpaque(true);
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 1));
        bg_capas.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 220, 10));

        jLabel8.setBackground(new java.awt.Color(132, 167, 161));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setOpaque(true);
        bg_capas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 50, 50));

        jLabel9.setBackground(new java.awt.Color(132, 167, 161));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("7");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);
        bg_capas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 50));

        jLabel10.setBackground(new java.awt.Color(132, 167, 161));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("6");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setOpaque(true);
        bg_capas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 50, 50));

        jLabel11.setBackground(new java.awt.Color(132, 167, 161));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setOpaque(true);
        bg_capas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 50));

        jLabel12.setBackground(new java.awt.Color(132, 167, 161));
        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("4");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setOpaque(true);
        bg_capas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 50, 50));

        jLabel13.setBackground(new java.awt.Color(132, 167, 161));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setOpaque(true);
        bg_capas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 50, 50));

        jLabel14.setBackground(new java.awt.Color(132, 167, 161));
        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("2");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setOpaque(true);
        bg_capas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 50, 50));

        iENL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iENL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iENL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iENL2MouseClicked(evt);
            }
        });
        bg_capas.add(iENL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 80, 60));

        iFIS1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iFIS1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iFIS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iFIS1MouseClicked(evt);
            }
        });
        bg_capas.add(iFIS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 80, 60));

        iENL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iENL1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iENL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iENL1MouseClicked(evt);
            }
        });
        bg_capas.add(iENL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 80, 60));

        iRED1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iRED1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iRED1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iRED1MouseClicked(evt);
            }
        });
        bg_capas.add(iRED1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 80, 60));

        iTRAN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iTRAN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iTRAN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iTRAN1MouseClicked(evt);
            }
        });
        bg_capas.add(iTRAN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, 60));

        iSES1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iSES1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iSES1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iSES1MouseClicked(evt);
            }
        });
        bg_capas.add(iSES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 80, 60));

        iPRES1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iPRES1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPRES1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iPRES1MouseClicked(evt);
            }
        });
        bg_capas.add(iPRES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 80, 60));

        iAPP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iAPP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iAPP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iAPP1MouseClicked(evt);
            }
        });
        bg_capas.add(iAPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 80, 60));

        iSES2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iSES2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iSES2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iSES2MouseClicked(evt);
            }
        });
        bg_capas.add(iSES2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 80, 60));

        iFIS2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iFIS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iFIS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iFIS2MouseClicked(evt);
            }
        });
        bg_capas.add(iFIS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 80, 60));

        iPRES2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iPRES2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPRES2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iPRES2MouseClicked(evt);
            }
        });
        bg_capas.add(iPRES2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 80, 60));

        iTRAN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iTRAN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iTRAN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iTRAN2MouseClicked(evt);
            }
        });
        bg_capas.add(iTRAN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 80, 60));

        iRED2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iRED2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iRED2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iRED2MouseClicked(evt);
            }
        });
        bg_capas.add(iRED2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 80, 60));

        iRED3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iRED3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iRED3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iRED3MouseClicked(evt);
            }
        });
        bg_capas.add(iRED3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 80, 60));

        iAPP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iAPP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iAPP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iAPP2MouseClicked(evt);
            }
        });
        bg_capas.add(iAPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_capas, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cierre_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierre_labelMouseClicked
        inicio ini = new inicio();
        this.setVisible(false);
        ini.setVisible(true);
    }//GEN-LAST:event_cierre_labelMouseClicked

    private void lbFisicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFisicaMouseExited
        lbFisica.setBackground(new Color(33,42,62));
        lbFisica.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbFisicaMouseExited

    private void lbEnlaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnlaceMouseExited
        lbEnlace.setBackground(new Color(33,42,62));
        lbEnlace.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbEnlaceMouseExited

    private void lbRedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRedMouseExited
        lbRed.setBackground(new Color(33,42,62));
        lbRed.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbRedMouseExited

    private void lbTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTransMouseExited
        lbTrans.setBackground(new Color(33,42,62));
        lbTrans.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbTransMouseExited

    private void lbSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSesionMouseExited
        lbSesion.setBackground(new Color(33,42,62));
        lbSesion.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbSesionMouseExited

    private void lbPresentacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPresentacionMouseExited
        lbPresentacion.setBackground(new Color(33,42,62));
        lbPresentacion.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbPresentacionMouseExited

    private void lbAplicacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAplicacionMouseExited
        lbAplicacion.setBackground(new Color(33,42,62));
        lbAplicacion.setForeground(new Color(241,246,249));
    }//GEN-LAST:event_lbAplicacionMouseExited

    private void lbFisicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFisicaMouseEntered
        lbFisica.setBackground(new Color(241, 201, 59));
        lbFisica.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbFisicaMouseEntered

    private void lbEnlaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnlaceMouseEntered
        lbEnlace.setBackground(new Color(241, 201, 59));
        lbEnlace.setForeground(new Color(26, 93, 26));    }//GEN-LAST:event_lbEnlaceMouseEntered

    private void lbRedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRedMouseEntered
        lbRed.setBackground(new Color(241, 201, 59));
        lbRed.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbRedMouseEntered

    private void lbTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTransMouseEntered
        lbTrans.setBackground(new Color(241, 201, 59));
        lbTrans.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbTransMouseEntered

    private void lbSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSesionMouseEntered
        lbSesion.setBackground(new Color(241, 201, 59));
        lbSesion.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbSesionMouseEntered

    private void lbPresentacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPresentacionMouseEntered
        lbPresentacion.setBackground(new Color(241, 201, 59));
        lbPresentacion.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbPresentacionMouseEntered

    private void lbAplicacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAplicacionMouseEntered
        lbAplicacion.setBackground(new Color(241, 201, 59));
        lbAplicacion.setForeground(new Color(26, 93, 26));
    }//GEN-LAST:event_lbAplicacionMouseEntered

//CAPA FISICA 1
    private void iFIS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iFIS1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 1",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iFIS1MouseClicked
    
//CAPA FISICA 2
    private void iFIS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iFIS2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 1",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iFIS2MouseClicked
    
//CAPA ENLACE DE DATOS 1
    private void iENL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iENL1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 2",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iENL1MouseClicked
    
//CAPA ENLACE DE DATOS 2
    private void iENL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iENL2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 2",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iENL2MouseClicked
    
//CAPA RED 1
    private void iRED1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRED1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 3",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iRED1MouseClicked
    
//CAPA RED 2
    private void iRED2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRED2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 3",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iRED2MouseClicked
    
//CAPA RED 3
    private void iRED3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRED3MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 3",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iRED3MouseClicked
    
//CAPA TRANSPORTE 1
    private void iTRAN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iTRAN1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 4",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iTRAN1MouseClicked
    
//CAPA TRANSPORTE 2
    private void iTRAN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iTRAN2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 4",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iTRAN2MouseClicked
    
//CAPA SESION 1
    private void iSES1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSES1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 5",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iSES1MouseClicked
    
//CAPA SESION 2
    private void iSES2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSES2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 5",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iSES2MouseClicked
    
//CAPA PRESENTACION 1
    private void iPRES1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPRES1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 6",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iPRES1MouseClicked
    
//CAPA PRESENTACION 2
    private void iPRES2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPRES2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 6",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iPRES2MouseClicked
    
//CAPA APLICACION 1
    private void iAPP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAPP1MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 7",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iAPP1MouseClicked
    
//CAPA APLICACION 2
    private void iAPP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAPP2MouseClicked
        Icon icon = new ImageIcon(getClass().getResource("informacion.png"));
        JOptionPane.showMessageDialog(null,"----NOMBRE---- "
                + "\n\n\t\n-------INF "
                + "-------\n\t+PUERTOS"
                + "\t\n+COMPATIBILIDAD, ETC",
                "CAPA 7",JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_iAPP2MouseClicked

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
            java.util.logging.Logger.getLogger(capas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capas().setVisible(true);
            }
        });
    }
    
    //FUNCIÓN AGREGAR IMAGEN AL LABEL
    public void agregarIma(JLabel lb, String ruta){
        this.imag = new ImageIcon(ruta);
        this.icon = new ImageIcon(
               this.imag.getImage().getScaledInstance(
                       lb.getWidth(), 
                       lb.getHeight(), 
                       Image.SCALE_DEFAULT
               )
        );
        lb.setIcon(this.icon);
        this.repaint();        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_capas;
    private javax.swing.JLabel cierre_label;
    private javax.swing.JLabel iAPP1;
    private javax.swing.JLabel iAPP2;
    private javax.swing.JLabel iENL1;
    private javax.swing.JLabel iENL2;
    private javax.swing.JLabel iFIS1;
    private javax.swing.JLabel iFIS2;
    private javax.swing.JLabel iPRES1;
    private javax.swing.JLabel iPRES2;
    private javax.swing.JLabel iRED1;
    private javax.swing.JLabel iRED2;
    private javax.swing.JLabel iRED3;
    private javax.swing.JLabel iSES1;
    private javax.swing.JLabel iSES2;
    private javax.swing.JLabel iTRAN1;
    private javax.swing.JLabel iTRAN2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbAplicacion;
    private javax.swing.JLabel lbEnlace;
    private javax.swing.JLabel lbFisica;
    private javax.swing.JLabel lbPresentacion;
    private javax.swing.JLabel lbRed;
    private javax.swing.JLabel lbSesion;
    private javax.swing.JLabel lbTrans;
    // End of variables declaration//GEN-END:variables
}
