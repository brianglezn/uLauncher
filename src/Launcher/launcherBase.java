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
        escudo13 = new javax.swing.JLabel();
        escudo12 = new javax.swing.JLabel();
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
        panelEscudos.add(escudo1);

        escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo2);

        escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo3);

        escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo4);

        escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo5);

        escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo6);

        escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo7);

        escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo8);

        escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo9);

        escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo10);

        escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo11);

        escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo13);

        escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEscudos.add(escudo12);

        jPanel1.add(panelEscudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

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
        jPanel1.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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
