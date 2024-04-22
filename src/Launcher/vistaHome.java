package Launcher;

import Launcher.helpers.GameConfig;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class vistaHome extends javax.swing.JPanel {

    private launcherBase mainFrame;
    private GameConfig[] configs;
    private JSONObject jsonData;

    public vistaHome(launcherBase frame, JSONObject data) throws JSONException {
        this.mainFrame = frame;
        this.jsonData = data;
        initComponents();
        initializeGameConfigs();
        setupHomeBtn();
        applyHoverEffects();
    }

    // Método para inicializar las configuraciones de los juegos
    private void initializeGameConfigs() throws JSONException {
        JSONArray games = jsonData.getJSONArray("juegos");
        configs = new GameConfig[games.length()];

        for (int i = 0; i < games.length(); i++) {
            JSONObject game = games.getJSONObject(i);
            String title = game.getString("titulo");
            String description = game.getString("descripcion");
            String baseImagePath = "src/images/InterfazGame/Miniaturas/" + game.getString("imagen") + "/" + game.getString("imagen");

            String[] imagePaths = new String[5];
            for (int j = 0; j < imagePaths.length; j++) {
                imagePaths[j] = baseImagePath + j + ".png";
            }

            configs[i] = new GameConfig(title, description, imagePaths);
        }
    }

    // Método para el click en cada escudo
    private void setupHomeBtn() {
        JPanel[] homePanels = {homePanel0, homePanel1, homePanel2, homePanel3, homePanel4, homePanel5};
        JLabel[] homeBtns = {HomeButton0, HomeButton1, HomeButton2, HomeButton3, HomeButton4, HomeButton5};
        String resourceBasePath = "/images/InterfazHome/Miniaturas simuladores/HomeButton";

        for (int i = 0; i < homeBtns.length; i++) {
            homeBtns[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(resourceBasePath + i + ".png")));
            homeBtns[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            int finalI = i;
            homePanels[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    homePanelClicked(evt, finalI);
                }
            });
        }
    }

    private void homePanelClicked(java.awt.event.MouseEvent evt, int panelIndex) {
        vistaGame vista = new vistaGame(configs[panelIndex]);
        mainFrame.ShowPanel(vista);
    }

    // Métodos para el hover en cada homeBtn 
    private void applyHoverEffects() {
        JLabel[] buttons = {HomeButton0, HomeButton1, HomeButton2, HomeButton3, HomeButton4, HomeButton5};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setName("homeBtn" + i);
            animeEscudos(buttons[i], 0.95);
        }
    }

    private void applyHomeBtnName() {
        JLabel[] escudos = {
            HomeButton0, HomeButton1, HomeButton2, HomeButton3, HomeButton4,
            HomeButton5
        };

        for (int i = 0; i < escudos.length; i++) {
            escudos[i].setName("HomeButton" + i);
        }
    }

    private void animeEscudos(JLabel label, double scale) {
        applyHomeBtnName();
        String imagePath = "images/InterfazHome/Miniaturas simuladores/" + label.getName() + ".png";
        URL imageURL = getClass().getClassLoader().getResource(imagePath);
        if (imageURL == null) {
            System.err.println("Resource not found: " + imagePath);
            return;
        }

        Image originalImage = new ImageIcon(imageURL).getImage();
        ImageIcon iconoNormal = new ImageIcon(originalImage);
        int anchoEscalado = (int) (iconoNormal.getIconWidth() * scale);
        int altoEscalado = (int) (iconoNormal.getIconHeight() * scale);
        Image scaledImage = originalImage.getScaledInstance(anchoEscalado, altoEscalado, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(scaledImage);

        label.setIcon(iconoNormal);
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label.setIcon(iconoEscalado);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                label.setIcon(iconoNormal);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homePanel0 = new javax.swing.JPanel();
        HomeButton0 = new javax.swing.JLabel();
        homePanel1 = new javax.swing.JPanel();
        HomeButton1 = new javax.swing.JLabel();
        homePanel2 = new javax.swing.JPanel();
        HomeButton2 = new javax.swing.JLabel();
        homePanel3 = new javax.swing.JPanel();
        HomeButton3 = new javax.swing.JLabel();
        homePanel4 = new javax.swing.JPanel();
        HomeButton4 = new javax.swing.JLabel();
        homePanel5 = new javax.swing.JPanel();
        HomeButton5 = new javax.swing.JLabel();

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

        HomeButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton0.png"))); // NOI18N
        HomeButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel0Layout = new javax.swing.GroupLayout(homePanel0);
        homePanel0.setLayout(homePanel0Layout);
        homePanel0Layout.setHorizontalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel0Layout.setVerticalGroup(
            homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel0);

        homePanel1.setOpaque(false);

        HomeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton1.png"))); // NOI18N
        HomeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel1);

        homePanel2.setOpaque(false);

        HomeButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton2.png"))); // NOI18N
        HomeButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel2Layout = new javax.swing.GroupLayout(homePanel2);
        homePanel2.setLayout(homePanel2Layout);
        homePanel2Layout.setHorizontalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel2Layout.setVerticalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel2);

        homePanel3.setOpaque(false);

        HomeButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton3.png"))); // NOI18N
        HomeButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel3Layout = new javax.swing.GroupLayout(homePanel3);
        homePanel3.setLayout(homePanel3Layout);
        homePanel3Layout.setHorizontalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel3Layout.setVerticalGroup(
            homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel3);

        homePanel4.setOpaque(false);

        HomeButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton4.png"))); // NOI18N
        HomeButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel4Layout = new javax.swing.GroupLayout(homePanel4);
        homePanel4.setLayout(homePanel4Layout);
        homePanel4Layout.setHorizontalGroup(
            homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel4Layout.setVerticalGroup(
            homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(homePanel4);

        homePanel5.setOpaque(false);

        HomeButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazHome/Miniaturas simuladores/HomeButton5.png"))); // NOI18N
        HomeButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout homePanel5Layout = new javax.swing.GroupLayout(homePanel5);
        homePanel5.setLayout(homePanel5Layout);
        homePanel5Layout.setHorizontalGroup(
            homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homePanel5Layout.setVerticalGroup(
            homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(homePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HomeButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeButton0;
    private javax.swing.JLabel HomeButton1;
    private javax.swing.JLabel HomeButton2;
    private javax.swing.JLabel HomeButton3;
    private javax.swing.JLabel HomeButton4;
    private javax.swing.JLabel HomeButton5;
    private javax.swing.JPanel homePanel0;
    private javax.swing.JPanel homePanel1;
    private javax.swing.JPanel homePanel2;
    private javax.swing.JPanel homePanel3;
    private javax.swing.JPanel homePanel4;
    private javax.swing.JPanel homePanel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
