package Launcher;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class launcherBase extends javax.swing.JFrame {

    private launcherBase thisFrame;
    private JSONArray data;

    public launcherBase() {
        thisFrame = this;
        initComponents();
        assignClickEvents();
        applyAnimations();
        try {
            loadData();
            vistaHome vista = new vistaHome(thisFrame, data.getJSONObject(0));
            ShowPanel(vista);
        } catch (JSONException e) {
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new launcherBase().setVisible(true);
            }
        });
    }

    // Cargar datos desde el archivo
    private void loadData() throws JSONException {
        try {
            String path = "src/Launcher/BaseDeDatos.json";
            String content = new String(Files.readAllBytes(Paths.get(path)));
            data = new JSONArray(content);
        } catch (IOException e) {
            throw new JSONException("Error loading data from " + Paths.get("BaseDeDatos.json").toAbsolutePath());
        }
    }

    // Método para establecer la vista en content
    void ShowPanel(JPanel page) {
        page.setSize(1550, 880);
        page.setLocation(0, 0);

        content.removeAll();
        content.add(page, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Métodos para efecto hover en los escudos
    private void animeEscudos(JLabel label, double scale) {
        applyEscudoName();
        String imagePath = "/images/InterfazBase/Escudos/" + label.getName() + ".png";
        URL imageURL = getClass().getResource(imagePath);
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

    private void applyEscudoName() {
        JLabel[] escudos = {
            LauncherButton0, LauncherButton1, LauncherButton2, LauncherButton3, LauncherButton4,
            LauncherButton5, LauncherButton6, LauncherButton7, LauncherButton8, LauncherButton9,
            LauncherButton10, LauncherButton11, LauncherButton12, LauncherButton13
        };

        for (int i = 0; i < escudos.length; i++) {
            escudos[i].setName("LauncherButton" + i);
        }
    }

    private void applyAnimations() {
        JLabel[] escudos = {LauncherButton0, LauncherButton1, LauncherButton2, LauncherButton3, LauncherButton4, LauncherButton5, LauncherButton6,
            LauncherButton7, LauncherButton8, LauncherButton9, LauncherButton10, LauncherButton11, LauncherButton12, LauncherButton13};
        double scale = 0.95;

        for (JLabel escudo : escudos) {
            animeEscudos(escudo, scale);
        }
    }

    // Métodos para el click en cada escudo
    private void assignClickEvents() {
        JLabel[] buttons = {
            LauncherButton0, LauncherButton1, LauncherButton2, LauncherButton3,
            LauncherButton4, LauncherButton5, LauncherButton6, LauncherButton7,
            LauncherButton8, LauncherButton9, LauncherButton10, LauncherButton11,
            LauncherButton12, LauncherButton13
        };

        for (int i = 0; i < buttons.length; i++) {
            int index = i;
            buttons[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    launcherButtonClicked(index);
                }
            });
        }
    }

    private void launcherButtonClicked(int index) {
        try {
            vistaHome vista = new vistaHome(thisFrame, data.getJSONObject(index));
            ShowPanel(vista);
        } catch (JSONException ex) {
            Logger.getLogger(launcherBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEscudos = new javax.swing.JPanel();
        panelBtn0 = new javax.swing.JPanel();
        LauncherButton0 = new javax.swing.JLabel();
        panelBtn1 = new javax.swing.JPanel();
        LauncherButton1 = new javax.swing.JLabel();
        panelBtn2 = new javax.swing.JPanel();
        LauncherButton2 = new javax.swing.JLabel();
        panelBtn3 = new javax.swing.JPanel();
        LauncherButton3 = new javax.swing.JLabel();
        panelBtn4 = new javax.swing.JPanel();
        LauncherButton4 = new javax.swing.JLabel();
        panelBtn5 = new javax.swing.JPanel();
        LauncherButton5 = new javax.swing.JLabel();
        panelBtn6 = new javax.swing.JPanel();
        LauncherButton6 = new javax.swing.JLabel();
        panelBtn7 = new javax.swing.JPanel();
        LauncherButton7 = new javax.swing.JLabel();
        panelBtn8 = new javax.swing.JPanel();
        LauncherButton8 = new javax.swing.JLabel();
        panelBtn9 = new javax.swing.JPanel();
        LauncherButton9 = new javax.swing.JLabel();
        panelBtn10 = new javax.swing.JPanel();
        LauncherButton10 = new javax.swing.JLabel();
        panelBtn11 = new javax.swing.JPanel();
        LauncherButton11 = new javax.swing.JLabel();
        panelBtn12 = new javax.swing.JPanel();
        LauncherButton12 = new javax.swing.JLabel();
        panelBtn13 = new javax.swing.JPanel();
        LauncherButton13 = new javax.swing.JLabel();
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
        panelEscudos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 7, 5));

        panelBtn0.setOpaque(false);

        LauncherButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton0.png"))); // NOI18N
        LauncherButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn0Layout = new javax.swing.GroupLayout(panelBtn0);
        panelBtn0.setLayout(panelBtn0Layout);
        panelBtn0Layout.setHorizontalGroup(
            panelBtn0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn0Layout.setVerticalGroup(
            panelBtn0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn0Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton0)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn0);

        panelBtn1.setOpaque(false);

        LauncherButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton1.png"))); // NOI18N
        LauncherButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn1Layout = new javax.swing.GroupLayout(panelBtn1);
        panelBtn1.setLayout(panelBtn1Layout);
        panelBtn1Layout.setHorizontalGroup(
            panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn1Layout.setVerticalGroup(
            panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(panelBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn1);

        panelBtn2.setOpaque(false);

        LauncherButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton2.png"))); // NOI18N
        LauncherButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn2Layout = new javax.swing.GroupLayout(panelBtn2);
        panelBtn2.setLayout(panelBtn2Layout);
        panelBtn2Layout.setHorizontalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn2Layout.setVerticalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn2);

        panelBtn3.setOpaque(false);

        LauncherButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton3.png"))); // NOI18N
        LauncherButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn3Layout = new javax.swing.GroupLayout(panelBtn3);
        panelBtn3.setLayout(panelBtn3Layout);
        panelBtn3Layout.setHorizontalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn3Layout.setVerticalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn3);

        panelBtn4.setOpaque(false);

        LauncherButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton4.png"))); // NOI18N
        LauncherButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn4Layout = new javax.swing.GroupLayout(panelBtn4);
        panelBtn4.setLayout(panelBtn4Layout);
        panelBtn4Layout.setHorizontalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn4Layout.setVerticalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn4);

        panelBtn5.setOpaque(false);

        LauncherButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton5.png"))); // NOI18N
        LauncherButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn5Layout = new javax.swing.GroupLayout(panelBtn5);
        panelBtn5.setLayout(panelBtn5Layout);
        panelBtn5Layout.setHorizontalGroup(
            panelBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn5Layout.setVerticalGroup(
            panelBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn5);

        panelBtn6.setOpaque(false);

        LauncherButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton6.png"))); // NOI18N
        LauncherButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn6Layout = new javax.swing.GroupLayout(panelBtn6);
        panelBtn6.setLayout(panelBtn6Layout);
        panelBtn6Layout.setHorizontalGroup(
            panelBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn6Layout.setVerticalGroup(
            panelBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn6);

        panelBtn7.setOpaque(false);

        LauncherButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton7.png"))); // NOI18N
        LauncherButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn7Layout = new javax.swing.GroupLayout(panelBtn7);
        panelBtn7.setLayout(panelBtn7Layout);
        panelBtn7Layout.setHorizontalGroup(
            panelBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn7Layout.setVerticalGroup(
            panelBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn7);

        panelBtn8.setOpaque(false);

        LauncherButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton8.png"))); // NOI18N
        LauncherButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn8Layout = new javax.swing.GroupLayout(panelBtn8);
        panelBtn8.setLayout(panelBtn8Layout);
        panelBtn8Layout.setHorizontalGroup(
            panelBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn8Layout.setVerticalGroup(
            panelBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn8);

        panelBtn9.setOpaque(false);

        LauncherButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton9.png"))); // NOI18N
        LauncherButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn9Layout = new javax.swing.GroupLayout(panelBtn9);
        panelBtn9.setLayout(panelBtn9Layout);
        panelBtn9Layout.setHorizontalGroup(
            panelBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn9Layout.setVerticalGroup(
            panelBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn9);

        panelBtn10.setOpaque(false);

        LauncherButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton10.png"))); // NOI18N
        LauncherButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn10Layout = new javax.swing.GroupLayout(panelBtn10);
        panelBtn10.setLayout(panelBtn10Layout);
        panelBtn10Layout.setHorizontalGroup(
            panelBtn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(panelBtn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn10Layout.setVerticalGroup(
            panelBtn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn10);

        panelBtn11.setOpaque(false);

        LauncherButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton11.png"))); // NOI18N
        LauncherButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn11);

        panelBtn12.setOpaque(false);

        LauncherButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton12.png"))); // NOI18N
        LauncherButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn12);

        panelBtn13.setOpaque(false);

        LauncherButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InterfazBase/Escudos/LauncherButton13.png"))); // NOI18N
        LauncherButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LauncherButton13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelEscudos.add(panelBtn13);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LauncherButton0;
    private javax.swing.JLabel LauncherButton1;
    private javax.swing.JLabel LauncherButton10;
    private javax.swing.JLabel LauncherButton11;
    private javax.swing.JLabel LauncherButton12;
    private javax.swing.JLabel LauncherButton13;
    private javax.swing.JLabel LauncherButton2;
    private javax.swing.JLabel LauncherButton3;
    private javax.swing.JLabel LauncherButton4;
    private javax.swing.JLabel LauncherButton5;
    private javax.swing.JLabel LauncherButton6;
    private javax.swing.JLabel LauncherButton7;
    private javax.swing.JLabel LauncherButton8;
    private javax.swing.JLabel LauncherButton9;
    private javax.swing.JLabel bgImage;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBtn0;
    private javax.swing.JPanel panelBtn1;
    private javax.swing.JPanel panelBtn10;
    private javax.swing.JPanel panelBtn11;
    private javax.swing.JPanel panelBtn12;
    private javax.swing.JPanel panelBtn13;
    private javax.swing.JPanel panelBtn2;
    private javax.swing.JPanel panelBtn3;
    private javax.swing.JPanel panelBtn4;
    private javax.swing.JPanel panelBtn5;
    private javax.swing.JPanel panelBtn6;
    private javax.swing.JPanel panelBtn7;
    private javax.swing.JPanel panelBtn8;
    private javax.swing.JPanel panelBtn9;
    private javax.swing.JPanel panelEscudos;
    // End of variables declaration//GEN-END:variables
}
