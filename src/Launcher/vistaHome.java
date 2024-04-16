package Launcher;

public class vistaHome extends javax.swing.JPanel {

    public vistaHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homePanel0 = new javax.swing.JPanel();
        homeBtn0 = new javax.swing.JLabel();
        homeBtn1 = new javax.swing.JLabel();
        homeBtn2 = new javax.swing.JLabel();
        homeBtn3 = new javax.swing.JLabel();
        homeBtn4 = new javax.swing.JLabel();
        homeBtn5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 153));
        setForeground(new java.awt.Color(204, 0, 102));
        setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 880));

        jPanel1.setMaximumSize(new java.awt.Dimension(1550, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 880));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1550, 880));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel0.setOpaque(false);
        homePanel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanel0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanel0MouseExited(evt);
            }
        });

        homeBtn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton0.png"))); // NOI18N

        javax.swing.GroupLayout homePanel0Layout = new javax.swing.GroupLayout(homePanel0);
        homePanel0.setLayout(homePanel0Layout);
        homePanel0Layout.setHorizontalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel0Layout.setVerticalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 380, 290));

        homeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton1.png"))); // NOI18N
        jPanel1.add(homeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 380, 290));

        homeBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton2.png"))); // NOI18N
        jPanel1.add(homeBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, 380, 290));

        homeBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton3.png"))); // NOI18N
        jPanel1.add(homeBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 380, 290));

        homeBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton4.png"))); // NOI18N
        jPanel1.add(homeBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 380, 290));

        homeBtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton5.png"))); // NOI18N
        jPanel1.add(homeBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 490, 380, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homePanel0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel0MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_homePanel0MouseEntered

    private void homePanel0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel0MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_homePanel0MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeBtn0;
    private javax.swing.JLabel homeBtn1;
    private javax.swing.JLabel homeBtn2;
    private javax.swing.JLabel homeBtn3;
    private javax.swing.JLabel homeBtn4;
    private javax.swing.JLabel homeBtn5;
    private javax.swing.JPanel homePanel0;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
