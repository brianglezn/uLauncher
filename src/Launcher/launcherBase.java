package Launcher;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class launcherBase extends javax.swing.JFrame {

    private launcherBase thisFrame;

    public launcherBase() {
        thisFrame = this;
        initComponents();
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }

    void ShowPanel(JPanel page) {
        page.setSize(1550, 880);
        page.setLocation(0, 0);

        content.removeAll();
        content.add(page, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new launcherBase().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEscudos = new javax.swing.JPanel();
        escudo0 = new javax.swing.JLabel();
        escudo1 = new javax.swing.JLabel();
        escudo2 = new javax.swing.JLabel();
        escudo3 = new javax.swing.JLabel();
        escudo4 = new javax.swing.JLabel();
        escudo5 = new javax.swing.JLabel();
        escudo6 = new javax.swing.JLabel();
        escudo7 = new javax.swing.JLabel();
        escudo8 = new javax.swing.JLabel();
        escudo9 = new javax.swing.JLabel();
        escudo10 = new javax.swing.JLabel();
        escudo11 = new javax.swing.JLabel();
        escudo12 = new javax.swing.JLabel();
        escudo13 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(10, 38, 72));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEscudos.setOpaque(false);
        panelEscudos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        escudo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton0.png"))); // NOI18N
        escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo0MouseExited(evt);
            }
        });
        panelEscudos.add(escudo0);

        escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton1.png"))); // NOI18N
        escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo1MouseExited(evt);
            }
        });
        panelEscudos.add(escudo1);

        escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo2MouseExited(evt);
            }
        });
        panelEscudos.add(escudo2);

        escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo3MouseExited(evt);
            }
        });
        panelEscudos.add(escudo3);

        escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo4MouseExited(evt);
            }
        });
        panelEscudos.add(escudo4);

        escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo5MouseExited(evt);
            }
        });
        panelEscudos.add(escudo5);

        escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo6MouseExited(evt);
            }
        });
        panelEscudos.add(escudo6);

        escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo7MouseExited(evt);
            }
        });
        panelEscudos.add(escudo7);

        escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo8MouseExited(evt);
            }
        });
        panelEscudos.add(escudo8);

        escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo9MouseExited(evt);
            }
        });
        panelEscudos.add(escudo9);

        escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo10MouseExited(evt);
            }
        });
        panelEscudos.add(escudo10);

        escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo11MouseExited(evt);
            }
        });
        panelEscudos.add(escudo11);

        escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo12MouseExited(evt);
            }
        });
        panelEscudos.add(escudo12);

        escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escudo13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escudo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escudo13MouseExited(evt);
            }
        });
        panelEscudos.add(escudo13);

        jPanel1.add(panelEscudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        content.setMaximumSize(new java.awt.Dimension(1550, 880));
        content.setMinimumSize(new java.awt.Dimension(1550, 880));
        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/FondoBase.png"))); // NOI18N
        jPanel1.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escudo0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo0MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo0MouseClicked

    private void escudo0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo0MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo0MouseEntered

    private void escudo0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo0MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo0MouseExited

    private void escudo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo1MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo1MouseClicked

    private void escudo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo1MouseEntered

    private void escudo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo1MouseExited

    private void escudo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo2MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo2MouseClicked

    private void escudo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo2MouseEntered

    private void escudo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo2MouseExited

    private void escudo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo3MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo3MouseClicked

    private void escudo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo3MouseEntered

    private void escudo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo3MouseExited

    private void escudo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo4MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo4MouseClicked

    private void escudo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo4MouseEntered

    private void escudo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo4MouseExited

    private void escudo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo5MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo5MouseClicked

    private void escudo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo5MouseEntered

    private void escudo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo5MouseExited

    private void escudo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo6MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo6MouseClicked

    private void escudo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo6MouseEntered

    private void escudo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo6MouseExited

    private void escudo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo7MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo7MouseClicked

    private void escudo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo7MouseEntered

    private void escudo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo7MouseExited

    private void escudo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo8MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo8MouseClicked

    private void escudo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo8MouseEntered

    private void escudo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo8MouseExited

    private void escudo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo9MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo9MouseClicked

    private void escudo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo9MouseEntered

    private void escudo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo9MouseExited

    private void escudo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo10MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo10MouseClicked

    private void escudo10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo10MouseEntered

    private void escudo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo10MouseExited

    private void escudo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo11MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo11MouseClicked

    private void escudo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo11MouseEntered

    private void escudo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo11MouseExited

    private void escudo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo12MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo12MouseClicked

    private void escudo12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo12MouseEntered

    private void escudo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo12MouseExited

    private void escudo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo13MouseClicked
        vistaHome vista = new vistaHome(thisFrame);
        ShowPanel(vista);
    }//GEN-LAST:event_escudo13MouseClicked

    private void escudo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo13MouseEntered

    private void escudo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escudo13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_escudo13MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JPanel content;
    private javax.swing.JLabel escudo0;
    private javax.swing.JLabel escudo1;
    private javax.swing.JLabel escudo10;
    private javax.swing.JLabel escudo11;
    private javax.swing.JLabel escudo12;
    private javax.swing.JLabel escudo13;
    private javax.swing.JLabel escudo2;
    private javax.swing.JLabel escudo3;
    private javax.swing.JLabel escudo4;
    private javax.swing.JLabel escudo5;
    private javax.swing.JLabel escudo6;
    private javax.swing.JLabel escudo7;
    private javax.swing.JLabel escudo8;
    private javax.swing.JLabel escudo9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEscudos;
    // End of variables declaration//GEN-END:variables
}
