package Launcher;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class vistaGame extends javax.swing.JPanel {

    public vistaGame() {
        initComponents();
        SetImageLabelPrincipal(imgCarrusel1, "src/images/InterfazGame/Miniaturas/Embarque/Embarque0.png");
        SetImageLabelSecundario(imgCarruselPre, "src/images/InterfazGame/Miniaturas/Embarque/Embarque4.png");
        SetImageLabelSecundario(imgCarruselPost, "src/images/InterfazGame/Miniaturas/Embarque/Embarque1.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnComenzar = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        txtSeparador = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        btnCarrusel1 = new javax.swing.JLabel();
        btnCarrusel2 = new javax.swing.JLabel();
        btnCarrusel3 = new javax.swing.JLabel();
        btnCarrusel4 = new javax.swing.JLabel();
        btnCarrusel5 = new javax.swing.JLabel();
        btnCarruselIzquierda = new javax.swing.JLabel();
        btnCarruselDerecha = new javax.swing.JLabel();
        imgCarrusel1 = new javax.swing.JLabel();
        imgCarruselPost = new javax.swing.JLabel();
        imgCarruselPre = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 880));

        jPanel1.setMaximumSize(new java.awt.Dimension(1550, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1550, 880));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1550, 880));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Comenzar.png"))); // NOI18N
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 800, 270, 50));

        txtTitle.setFont(new java.awt.Font("Raleway Black", 0, 22)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Embarque y desembarque en helicoptero");
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 960, 40));

        txtSeparador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Barrita aislada descripción.png"))); // NOI18N
        jPanel1.add(txtSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 40));

        txtDescription.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescription.setText("<html>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti molestiae provident nisi placeat officia nostrum, suscipit ea ratione veniam possimus, recusandae distinctio molestias blanditiis. Blanditiis quia sunt officia exercitationem optio.Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti molestiae provident nisi placeat officia nostrum, suscipit ea ratione veniam possimus, recusandae distinctio molestias blanditiis. Blanditiis quia sunt officia exercitationem optio.Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti molestiae provident nisi placeat officia nostrum, suscipit ea ratione veniam possimus, recusandae distinctio molestias blanditiis. Blanditiis quia sunt officia exercitationem optio.Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti molestiae provident nisi placeat officia nostrum, suscipit ea ratione veniam possimus, recusandae distinctio molestias blanditiis. Blanditiis quia sunt officia exercitationem optio.</html>");
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 860, 180));

        btnCarrusel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        jPanel1.add(btnCarrusel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, -1, -1));

        btnCarrusel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(btnCarrusel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        btnCarrusel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(btnCarrusel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        btnCarrusel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(btnCarrusel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        btnCarrusel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(btnCarrusel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        btnCarruselIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Flecha izquierda.png"))); // NOI18N
        jPanel1.add(btnCarruselIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btnCarruselDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Flecha derecha.png"))); // NOI18N
        jPanel1.add(btnCarruselDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 260, -1, -1));
        jPanel1.add(imgCarrusel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 850, 480));
        jPanel1.add(imgCarruselPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 630, 370));
        jPanel1.add(imgCarruselPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 630, 370));

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

    private void SetImageLabelPrincipal(JLabel labelName, String root) {
        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            labelName.setSize(850, 480);
        }

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    private void SetImageLabelSecundario(JLabel labelName, String root) {
        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            labelName.setSize(630, 370);
        }

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCarrusel1;
    private javax.swing.JLabel btnCarrusel2;
    private javax.swing.JLabel btnCarrusel3;
    private javax.swing.JLabel btnCarrusel4;
    private javax.swing.JLabel btnCarrusel5;
    private javax.swing.JLabel btnCarruselDerecha;
    private javax.swing.JLabel btnCarruselIzquierda;
    private javax.swing.JLabel btnComenzar;
    private javax.swing.JLabel imgCarrusel1;
    private javax.swing.JLabel imgCarruselPost;
    private javax.swing.JLabel imgCarruselPre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtSeparador;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
