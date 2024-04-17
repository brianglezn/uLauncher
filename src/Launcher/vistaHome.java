package Launcher;

import Launcher.helpers.GameConfig;

public class vistaHome extends javax.swing.JPanel {

    private launcherBase mainFrame;
    private GameConfig[] configs;

    private String[] imagePathsAscensor = {
        "src/images/InterfazGame/Miniaturas/Ascensor/Ascensor0.png",
        "src/images/InterfazGame/Miniaturas/Ascensor/Ascensor1.png",
        "src/images/InterfazGame/Miniaturas/Ascensor/Ascensor2.png",
        "src/images/InterfazGame/Miniaturas/Ascensor/Ascensor3.png",
        "src/images/InterfazGame/Miniaturas/Ascensor/Ascensor4.png"
    };

    private String[] imagePathsEPIS = {
        "src/images/InterfazGame/Miniaturas/EPIS/EPIS0.png",
        "src/images/InterfazGame/Miniaturas/EPIS/EPIS1.png",
        "src/images/InterfazGame/Miniaturas/EPIS/EPIS2.png",
        "src/images/InterfazGame/Miniaturas/EPIS/EPIS3.png",
        "src/images/InterfazGame/Miniaturas/EPIS/EPIS4.png"
    };

    private String[] imagePathsEmbarque = {
        "src/images/InterfazGame/Miniaturas/Embarque/Embarque0.png",
        "src/images/InterfazGame/Miniaturas/Embarque/Embarque1.png",
        "src/images/InterfazGame/Miniaturas/Embarque/Embarque2.png",
        "src/images/InterfazGame/Miniaturas/Embarque/Embarque3.png",
        "src/images/InterfazGame/Miniaturas/Embarque/Embarque4.png"
    };

    private String[] imagePathsExtincion = {
        "src/images/InterfazGame/Miniaturas/Extincion/Extincion0.png",
        "src/images/InterfazGame/Miniaturas/Extincion/Extincion1.png",
        "src/images/InterfazGame/Miniaturas/Extincion/Extincion2.png",
        "src/images/InterfazGame/Miniaturas/Extincion/Extincion3.png",
        "src/images/InterfazGame/Miniaturas/Extincion/Extincion4.png"
    };

    private String[] imagePathsHelicoptero = {
        "src/images/InterfazGame/Miniaturas/Helicoptero/Helicoptero0.png",
        "src/images/InterfazGame/Miniaturas/Helicoptero/Helicoptero1.png",
        "src/images/InterfazGame/Miniaturas/Helicoptero/Helicoptero2.png",
        "src/images/InterfazGame/Miniaturas/Helicoptero/Helicoptero3.png",
        "src/images/InterfazGame/Miniaturas/Helicoptero/Helicoptero4.png"
    };

    private String[] imagePathsHemorragia = {
        "src/images/InterfazGame/Miniaturas/Hemorragia/Hemorragia0.png",
        "src/images/InterfazGame/Miniaturas/Hemorragia/Hemorragia1.png",
        "src/images/InterfazGame/Miniaturas/Hemorragia/Hemorragia2.png",
        "src/images/InterfazGame/Miniaturas/Hemorragia/Hemorragia3.png",
        "src/images/InterfazGame/Miniaturas/Hemorragia/Hemorragia4.png"
    };

    public vistaHome(launcherBase frame) {
        mainFrame = frame;
        initComponents();
        initializeGameConfigs();
    }

    private void initializeGameConfigs() {
        configs = new GameConfig[6];
        configs[0] = new GameConfig("Embarque y desembarque en helicoptero", "Descripción del Embarque...", imagePathsEmbarque);
        configs[1] = new GameConfig("Protocolo ante una hemorragia externa", "Descripción de Hemorragia...", imagePathsHemorragia);
        configs[2] = new GameConfig("Maniobras de extinción según la instalación", "Descripción de Extincion...", imagePathsExtincion);
        configs[3] = new GameConfig("Tipología y características de los EPIs", "Descripción de EPIS...", imagePathsEPIS);
        configs[4] = new GameConfig("Señalización a helicóptero desde tierra", "Descripción de Helicoptero...", imagePathsHelicoptero);
        configs[5] = new GameConfig("Rescate en ascensor", "Descripción de Ascensor...", imagePathsAscensor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homePanel0 = new javax.swing.JPanel();
        homeBtn0 = new javax.swing.JLabel();
        homePanel1 = new javax.swing.JPanel();
        homeBtn1 = new javax.swing.JLabel();
        homePanel2 = new javax.swing.JPanel();
        homeBtn2 = new javax.swing.JLabel();
        homePanel3 = new javax.swing.JPanel();
        homeBtn3 = new javax.swing.JLabel();
        homePanel4 = new javax.swing.JPanel();
        homeBtn4 = new javax.swing.JLabel();
        homePanel5 = new javax.swing.JPanel();
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
        jPanel1.setLayout(new java.awt.GridLayout(2, 3));

        homePanel0.setOpaque(false);
        homePanel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel0MouseClicked(evt);
            }
        });

        homeBtn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton0.png"))); // NOI18N
        homeBtn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel0Layout = new javax.swing.GroupLayout(homePanel0);
        homePanel0.setLayout(homePanel0Layout);
        homePanel0Layout.setHorizontalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel0Layout.setVerticalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel0);

        homePanel1.setOpaque(false);
        homePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel1MouseClicked(evt);
            }
        });

        homeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton1.png"))); // NOI18N
        homeBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel1);

        homePanel2.setOpaque(false);
        homePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel2MouseClicked(evt);
            }
        });

        homeBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton2.png"))); // NOI18N
        homeBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel2Layout = new javax.swing.GroupLayout(homePanel2);
        homePanel2.setLayout(homePanel2Layout);
        homePanel2Layout.setHorizontalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel2Layout.setVerticalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel2);

        homePanel3.setOpaque(false);
        homePanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel3MouseClicked(evt);
            }
        });

        homeBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton3.png"))); // NOI18N
        homeBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel3Layout = new javax.swing.GroupLayout(homePanel3);
        homePanel3.setLayout(homePanel3Layout);
        homePanel3Layout.setHorizontalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel3Layout.setVerticalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel3);

        homePanel4.setOpaque(false);
        homePanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel4MouseClicked(evt);
            }
        });

        homeBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton4.png"))); // NOI18N
        homeBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel4Layout = new javax.swing.GroupLayout(homePanel4);
        homePanel4.setLayout(homePanel4Layout);
        homePanel4Layout.setHorizontalGroup(
            homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel4Layout.setVerticalGroup(
            homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel4);

        homePanel5.setOpaque(false);
        homePanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanel5MouseClicked(evt);
            }
        });

        homeBtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton5.png"))); // NOI18N
        homeBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel5Layout = new javax.swing.GroupLayout(homePanel5);
        homePanel5.setLayout(homePanel5Layout);
        homePanel5Layout.setHorizontalGroup(
            homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel5Layout.setVerticalGroup(
            homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel5);

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

    private void homePanel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel0MouseClicked
        vistaGame vista = new vistaGame(configs[0]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel0MouseClicked

    private void homePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel1MouseClicked
        vistaGame vista = new vistaGame(configs[1]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel1MouseClicked

    private void homePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel2MouseClicked
        vistaGame vista = new vistaGame(configs[2]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel2MouseClicked

    private void homePanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel3MouseClicked
        vistaGame vista = new vistaGame(configs[3]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel3MouseClicked

    private void homePanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel4MouseClicked
        vistaGame vista = new vistaGame(configs[4]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel4MouseClicked

    private void homePanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanel5MouseClicked
        vistaGame vista = new vistaGame(configs[5]);
        mainFrame.ShowPanel(vista);
    }//GEN-LAST:event_homePanel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeBtn0;
    private javax.swing.JLabel homeBtn1;
    private javax.swing.JLabel homeBtn2;
    private javax.swing.JLabel homeBtn3;
    private javax.swing.JLabel homeBtn4;
    private javax.swing.JLabel homeBtn5;
    private javax.swing.JPanel homePanel0;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JPanel homePanel2;
    private javax.swing.JPanel homePanel3;
    private javax.swing.JPanel homePanel4;
    private javax.swing.JPanel homePanel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
