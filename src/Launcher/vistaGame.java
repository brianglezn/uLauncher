package Launcher;

import Launcher.helpers.GameConfig;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class vistaGame extends javax.swing.JPanel {

    private int currentImageIndex = 0;
    private String[] imagePaths;

    public vistaGame(GameConfig config) {
        initComponents();
        this.imagePaths = config.getImagePaths();
        txtTitle.setText(config.getTitle());
        txtDescription.setText(config.getDescription());
        updateImages();
    }

    // Método para establecer la imagen principal
    private void SetImageLabelPrincipal(JLabel labelName, String root) {
        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            labelName.setSize(850, 480);
        }

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Método para establecer las imágenes secundarias
    private void SetImageLabelSecundario(JLabel labelName, String root) {
        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            labelName.setSize(630, 370);
        }

        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Actualizar todas las imágenes según el índice actual
    private void updateImages() {
        int preIndex = (currentImageIndex - 1 + imagePaths.length) % imagePaths.length;
        int postIndex = (currentImageIndex + 1) % imagePaths.length;

        SetImageLabelPrincipal(imgCarruselPrincipal, imagePaths[currentImageIndex]);
        SetImageLabelSecundario(imgCarruselPre, imagePaths[preIndex]);
        SetImageLabelSecundario(imgCarruselPost, imagePaths[postIndex]);
        updateCarruselButtons(); // Aquí también se actualizan los botones de navegación del carrusel
    }

    // Actualizar el estado de los botones de navegación del carrusel según la imagen actual
    private void updateCarruselButtons() {
        btnCarrusel0.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png")));
        btnCarrusel1.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png")));
        btnCarrusel2.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png")));
        btnCarrusel3.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png")));
        btnCarrusel4.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png")));

        switch (currentImageIndex) {
            case 0:
                btnCarrusel0.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png")));
                break;
            case 1:
                btnCarrusel1.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png")));
                break;
            case 2:
                btnCarrusel2.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png")));
                break;
            case 3:
                btnCarrusel3.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png")));
                break;
            case 4:
                btnCarrusel4.setIcon(new ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png")));
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtSeparador = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        btnCarrusel0 = new javax.swing.JLabel();
        btnCarrusel1 = new javax.swing.JLabel();
        btnCarrusel2 = new javax.swing.JLabel();
        btnCarrusel3 = new javax.swing.JLabel();
        btnCarrusel4 = new javax.swing.JLabel();
        btnCarruselIzquierda = new javax.swing.JLabel();
        btnCarruselDerecha = new javax.swing.JLabel();
        imgCarruselPrincipal = new javax.swing.JLabel();
        imgCarruselPre = new javax.swing.JLabel();
        imgCarruselPost = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JLabel();

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

        txtTitle.setFont(new java.awt.Font("Raleway Black", 0, 22)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Titulo de texto");
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 960, 40));

        txtSeparador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Barrita aislada descripción.png"))); // NOI18N
        jPanel1.add(txtSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 40));

        txtDescription.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDescription.setText("<html>Texto de descripción</html>");
        txtDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 860, 180));

        btnCarrusel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselFilled.png"))); // NOI18N
        btnCarrusel0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrusel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrusel0MouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrusel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, -1, -1));

        btnCarrusel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        btnCarrusel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrusel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrusel1MouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrusel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        btnCarrusel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        btnCarrusel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrusel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrusel2MouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrusel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        btnCarrusel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        btnCarrusel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrusel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrusel3MouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrusel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        btnCarrusel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/PuntoCarruselEmpty.png"))); // NOI18N
        btnCarrusel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrusel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrusel4MouseClicked(evt);
            }
        });
        jPanel1.add(btnCarrusel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        btnCarruselIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Flecha izquierda.png"))); // NOI18N
        btnCarruselIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarruselIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarruselIzquierdaMouseClicked(evt);
            }
        });
        jPanel1.add(btnCarruselIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btnCarruselDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Flecha derecha.png"))); // NOI18N
        btnCarruselDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarruselDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarruselDerechaMouseClicked(evt);
            }
        });
        jPanel1.add(btnCarruselDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 260, -1, -1));
        jPanel1.add(imgCarruselPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 850, 480));
        jPanel1.add(imgCarruselPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 630, 370));
        jPanel1.add(imgCarruselPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 630, 370));

        btnComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazGame/Comenzar.png"))); // NOI18N
        btnComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComenzarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComenzarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComenzarMouseExited(evt);
            }
        });
        jPanel1.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 800, -1, 50));

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

    // Manejadores de eventos para los botones del carrusel izquierda y derecha
    private void btnCarruselIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarruselIzquierdaMouseClicked
        currentImageIndex = (currentImageIndex - 1 + imagePaths.length) % imagePaths.length;
        updateImages();
    }//GEN-LAST:event_btnCarruselIzquierdaMouseClicked

    private void btnCarruselDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarruselDerechaMouseClicked
        currentImageIndex = (currentImageIndex + 1) % imagePaths.length;
        updateImages();
    }//GEN-LAST:event_btnCarruselDerechaMouseClicked

    // Manejadores de eventos para los botones del carrusel
    private void btnCarrusel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrusel0MouseClicked
        currentImageIndex = 0;
        updateImages();
    }//GEN-LAST:event_btnCarrusel0MouseClicked

    private void btnCarrusel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrusel1MouseClicked
        currentImageIndex = 1;
        updateImages();
    }//GEN-LAST:event_btnCarrusel1MouseClicked

    private void btnCarrusel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrusel2MouseClicked
        currentImageIndex = 2;
        updateImages();
    }//GEN-LAST:event_btnCarrusel2MouseClicked

    private void btnCarrusel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrusel3MouseClicked
        currentImageIndex = 3;
        updateImages();
    }//GEN-LAST:event_btnCarrusel3MouseClicked

    private void btnCarrusel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrusel4MouseClicked
        currentImageIndex = 4;
        updateImages();
    }//GEN-LAST:event_btnCarrusel4MouseClicked

    private void btnComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComenzarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComenzarMouseClicked

    private void btnComenzarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComenzarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComenzarMouseEntered

    private void btnComenzarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComenzarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComenzarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCarrusel0;
    private javax.swing.JLabel btnCarrusel1;
    private javax.swing.JLabel btnCarrusel2;
    private javax.swing.JLabel btnCarrusel3;
    private javax.swing.JLabel btnCarrusel4;
    private javax.swing.JLabel btnCarruselDerecha;
    private javax.swing.JLabel btnCarruselIzquierda;
    private javax.swing.JLabel btnComenzar;
    private javax.swing.JLabel imgCarruselPost;
    private javax.swing.JLabel imgCarruselPre;
    private javax.swing.JLabel imgCarruselPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtSeparador;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
