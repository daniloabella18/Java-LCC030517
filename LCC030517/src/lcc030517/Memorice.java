
package lcc030517;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.RenderingHints;

public class Memorice extends javax.swing.JFrame{

    short i=0, j=0, act=0, minuto, segundo, numrandom, posAux, flip[]=new short[17], todos_flip;
    int puntaje=0;
    boolean part_act=false;
    Graphics g,aux, ptos, tiempo;
    Graphics2D ptos2D = (Graphics2D) ptos, tiempo2D = (Graphics2D) tiempo;
    RenderingHints rh = new RenderingHints( RenderingHints.KEY_TEXT_ANTIALIASING, 
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON );

    Tiempo ejec_tiempo;
    Image num[]=new Image[17], numAux, miniAux,
          cartel[]=new Image[17], mini[]=new Image[9];
    
    public Memorice() {
        initComponents();
        
// Tiempo //------------------------------------------------//

    ejec_tiempo=new Tiempo(LBLTiempo);
        
//------/ Archivos /-----------------------------------------//
        // Nums
        File A = new File("Img/Nums/1.jpg"); 
        File B = new File("Img/Nums/2.jpg");
        File C = new File("Img/Nums/3.jpg");
        File D = new File("Img/Nums/4.jpg");
        File E = new File("Img/Nums/5.jpg");
        File F = new File("Img/Nums/6.jpg"); 
        File G = new File("Img/Nums/7.jpg");
        File H = new File("Img/Nums/8.jpg");
        File I = new File("Img/Nums/9.jpg");
        File J = new File("Img/Nums/10.jpg");
        File K = new File("Img/Nums/11.jpg"); 
        File L = new File("Img/Nums/12.jpg");
        File M = new File("Img/Nums/13.jpg");
        File N = new File("Img/Nums/14.jpg");
        File Ñ = new File("Img/Nums/15.jpg");
        File O = new File("Img/Nums/16.jpg");
        
        // Minis
        File Mini1 = new File("Img/Memorize_Dinos/1.png"); 
        File Mini2 = new File("Img/Memorize_Dinos/2.png");
        File Mini3 = new File("Img/Memorize_Dinos/3.png");
        File Mini4 = new File("Img/Memorize_Dinos/4.png");
        File Mini5 = new File("Img/Memorize_Dinos/5.png");
        File Mini6 = new File("Img/Memorize_Dinos/6.png"); 
        File Mini7 = new File("Img/Memorize_Dinos/7.png");
        File Mini8 = new File("Img/Memorize_Dinos/8.png");
        
// ---------/ Cargar las Imagenes //------------------------------//
                try {
                // Nums
                num[1] = ImageIO.read(new File(A.toURI()));
                num[2] = ImageIO.read(new File(B.toURI()));
                num[3] = ImageIO.read(new File(C.toURI()));
                num[4] = ImageIO.read(new File(D.toURI()));
                num[5] = ImageIO.read(new File(E.toURI()));
                num[6] = ImageIO.read(new File(F.toURI()));
                num[7] = ImageIO.read(new File(G.toURI()));
                num[8] = ImageIO.read(new File(H.toURI()));
                num[9] = ImageIO.read(new File(I.toURI()));
                num[10] = ImageIO.read(new File(J.toURI()));
                num[11] = ImageIO.read(new File(K.toURI()));
                num[12] = ImageIO.read(new File(L.toURI()));
                num[13] = ImageIO.read(new File(M.toURI()));
                num[14] = ImageIO.read(new File(N.toURI()));
                num[15] = ImageIO.read(new File(Ñ.toURI()));
                num[16] = ImageIO.read(new File(O.toURI()));
                
                // Minis
                mini[1] = ImageIO.read(new File(Mini1.toURI()));
                mini[2] = ImageIO.read(new File(Mini2.toURI()));
                mini[3] = ImageIO.read(new File(Mini3.toURI()));
                mini[4] = ImageIO.read(new File(Mini4.toURI()));
                mini[5] = ImageIO.read(new File(Mini5.toURI()));
                mini[6] = ImageIO.read(new File(Mini6.toURI()));
                mini[7] = ImageIO.read(new File(Mini7.toURI()));
                mini[8] = ImageIO.read(new File(Mini8.toURI()));
                
            } catch (IOException e) {
            }
                
// Caracteres en tiempo real //------------------------------------------------------//
        // gráficos con sus respectivos paneles
        ptos2D =(Graphics2D) Puntos.getGraphics();
        tiempo2D = (Graphics2D) Tiempo.getGraphics();
        // renderizando gráficos
        ptos2D.setRenderingHints(rh);
        tiempo2D.setRenderingHints(rh);
        // Fuente de los gráficos
        ptos2D.setFont(new Font("Tempus Sant ITC", Font.CENTER_BASELINE, 22));
        tiempo2D.setFont(new Font("Tempus Sant ITC", Font.CENTER_BASELINE, 22));
        
        //jLabelptos.setText("Puntaje:" + puntaje)

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Panel7 = new javax.swing.JPanel();
        Panel8 = new javax.swing.JPanel();
        Panel9 = new javax.swing.JPanel();
        Panel11 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel10 = new javax.swing.JPanel();
        Panel6 = new javax.swing.JPanel();
        Panel12 = new javax.swing.JPanel();
        Panel13 = new javax.swing.JPanel();
        Panel14 = new javax.swing.JPanel();
        Panel15 = new javax.swing.JPanel();
        Panel16 = new javax.swing.JPanel();
        StartButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        LBLTiempo = new javax.swing.JLabel();
        Puntos = new javax.swing.JPanel();
        Tiempo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Memorize");

        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel16Layout = new javax.swing.GroupLayout(Panel16);
        Panel16.setLayout(Panel16Layout);
        Panel16Layout.setHorizontalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Panel16Layout.setVerticalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        StartButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 26)); // NOI18N
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("Puntaje:");

        LBLTiempo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        LBLTiempo.setText("Tiempo");

        javax.swing.GroupLayout PuntosLayout = new javax.swing.GroupLayout(Puntos);
        Puntos.setLayout(PuntosLayout);
        PuntosLayout.setHorizontalGroup(
            PuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        PuntosLayout.setVerticalGroup(
            PuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TiempoLayout = new javax.swing.GroupLayout(Tiempo);
        Tiempo.setLayout(TiempoLayout);
        TiempoLayout.setHorizontalGroup(
            TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        TiempoLayout.setVerticalGroup(
            TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartButton)
                        .addGap(18, 18, 18)
                        .addComponent(LBLTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(StartButton)
                    .addComponent(LBLTiempo)
                    .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseClicked
        if(flip[1]==0)
        {
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel1.getGraphics();
                g.drawImage(cartel[1], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[1] == miniAux){
                    flip[1]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma p
                }else{
                pausa(1000);    
                g.drawImage(num[1], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel1.getGraphics();
                miniAux=cartel[1];            
                numAux=num[1];
                posAux=1;
                flip[1]=1;

                g=Panel1.getGraphics();
                g.drawImage(cartel[1], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel1MouseClicked

    //  Inicio
    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
       
// --------// Tiempo Inicial //------------------------------------------------------------// 
        
            if ( part_act == false ){   ejec_tiempo.start();    }            
        
//---------// Puntaje Inicial //------------------------------------------------// 
            puntaje = 0;
//          ptos2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
            ptos2D.clearRect(0,0,100,40);   ptos2D.drawString(puntaje +"",0,25);
            
// Tiempo Inicial //------------------------------------------------------------//

            minuto = segundo = 0;
            part_act = true;
        
//---------// Imagen para cada cartel //------------------------------------------------//
            numrandom =(short) ((Math.random()*3) + 1);       
            if ( numrandom == 1 )
                {
                    cartel[1]=mini[1];    cartel[2]=mini[2];    cartel[3]=mini[1];    cartel[4]=mini[2];
                    cartel[5]=mini[3];    cartel[6]=mini[7];    cartel[7]=mini[4];    cartel[8]=mini[7];
                    cartel[9]=mini[6];    cartel[10]=mini[8];    cartel[11]=mini[8];    cartel[12]=mini[6];
                    cartel[13]=mini[5];    cartel[14]=mini[5];    cartel[15]=mini[4];    cartel[16]=mini[3]; 
                }
            if ( numrandom == 2 )
                {
                    cartel[1]=mini[8];    cartel[2]=mini[4];    cartel[3]=mini[2];    cartel[4]=mini[5];
                    cartel[5]=mini[5];    cartel[6]=mini[6];    cartel[7]=mini[7];    cartel[8]=mini[1];
                    cartel[9]=mini[3];    cartel[10]=mini[6];    cartel[11]=mini[4];    cartel[12]=mini[3];
                    cartel[13]=mini[2];    cartel[14]=mini[8];    cartel[15]=mini[1];    cartel[16]=mini[7]; 
                }
            if ( numrandom == 3 )
                {
                    cartel[1]=mini[7];    cartel[2]=mini[8];    cartel[3]=mini[4];    cartel[4]=mini[5];
                    cartel[5]=mini[7];    cartel[6]=mini[2];    cartel[7]=mini[6];    cartel[8]=mini[3];
                    cartel[9]=mini[4];    cartel[10]=mini[3];    cartel[11]=mini[1];    cartel[12]=mini[6];
                    cartel[13]=mini[8];    cartel[14]=mini[1];    cartel[15]=mini[5];    cartel[16]=mini[2]; 
                }
            if ( numrandom == 4 )
                {
                    cartel[1]=mini[3];    cartel[2]=mini[2];    cartel[3]=mini[1];    cartel[4]=mini[2];
                    cartel[5]=mini[5];    cartel[6]=mini[1];    cartel[7]=mini[8];    cartel[8]=mini[6];
                    cartel[9]=mini[2];    cartel[10]=mini[3];    cartel[11]=mini[7];    cartel[12]=mini[7];
                    cartel[13]=mini[5];    cartel[14]=mini[8];    cartel[15]=mini[2];    cartel[16]=mini[6]; 
                }                         
                
        // Estado inicial de todos los carteles
        for(i=0 ; i <= 16 ; i++)
        {
            flip[i]=0;
        }
        
        act=0;

//------// Llenar todo con los nums //--------------------------------------------//
        g=Panel1.getGraphics();
        g.drawImage(num[1], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
        g=Panel2.getGraphics();
        g.drawImage(num[2], 1, 1, Panel2.getWidth()-2, Panel2.getHeight()-2,this);
        g=Panel3.getGraphics();
        g.drawImage(num[3], 1, 1, Panel3.getWidth()-2, Panel3.getHeight()-2,this);
        g=Panel4.getGraphics();
        g.drawImage(num[4], 1, 1, Panel4.getWidth()-2, Panel4.getHeight()-2,this);
        g=Panel5.getGraphics();
        g.drawImage(num[5], 1, 1, Panel5.getWidth()-2, Panel5.getHeight()-2,this);
        g=Panel6.getGraphics();
        g.drawImage(num[6], 1, 1, Panel6.getWidth()-2, Panel6.getHeight()-2,this);
        g=Panel7.getGraphics();
        g.drawImage(num[7], 1, 1, Panel7.getWidth()-2, Panel7.getHeight()-2,this);
        g=Panel8.getGraphics();
        g.drawImage(num[8], 1, 1, Panel8.getWidth()-2, Panel8.getHeight()-2,this);
        g=Panel9.getGraphics();
        g.drawImage(num[9], 1, 1, Panel9.getWidth()-2, Panel9.getHeight()-2,this);
        g=Panel10.getGraphics();
        g.drawImage(num[10], 1, 1, Panel10.getWidth()-2, Panel10.getHeight()-2,this);
        g=Panel11.getGraphics();
        g.drawImage(num[11], 1, 1, Panel7.getWidth()-2, Panel7.getHeight()-2,this);
        g=Panel12.getGraphics();
        g.drawImage(num[12], 1, 1, Panel8.getWidth()-2, Panel8.getHeight()-2,this);
        g=Panel13.getGraphics();
        g.drawImage(num[13], 1, 1, Panel9.getWidth()-2, Panel9.getHeight()-2,this);
        g=Panel14.getGraphics();
        g.drawImage(num[14], 1, 1, Panel9.getWidth()-2, Panel9.getHeight()-2,this);
        g=Panel15.getGraphics();
        g.drawImage(num[15], 1, 1, Panel9.getWidth()-2, Panel9.getHeight()-2,this);
        g=Panel16.getGraphics();
        g.drawImage(num[16], 1, 1, Panel9.getWidth()-2, Panel9.getHeight()-2,this);

    }//GEN-LAST:event_StartButtonActionPerformed

    private void Panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseClicked
        if(flip[2]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel2.getGraphics();
                g.drawImage(cartel[2], 1, 1, Panel2.getWidth()-2, Panel2.getHeight()-2,this);
                
                if( cartel[2] == miniAux){
                    flip[2]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[2], 1, 1, Panel2.getWidth()-2, Panel2.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel2.getGraphics();
                miniAux=cartel[2];              
                numAux=num[2];
                posAux=2;

                flip[2]=1;
                g=Panel2.getGraphics();
                g.drawImage(cartel[2], 1, 1, Panel2.getWidth()-2, Panel2.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel2MouseClicked

    private void Panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel3MouseClicked
        if(flip[3]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel3.getGraphics();
                g.drawImage(cartel[3], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[3] == miniAux){
                     flip[3]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[3], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel3.getGraphics();
                miniAux=cartel[3];              
                numAux=num[3];
                posAux=3;

                flip[3]=1;
                g=Panel3.getGraphics();
                g.drawImage(cartel[3], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel3MouseClicked

    private void Panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel4MouseClicked
        if(flip[4]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel4.getGraphics();
                g.drawImage(cartel[4], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[4] == miniAux){
                     flip[4]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[4], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel4.getGraphics();
                miniAux=cartel[4];              
                numAux=num[4];
                posAux=4;

                flip[4]=1;
                g=Panel4.getGraphics();
                g.drawImage(cartel[4], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel4MouseClicked

    private void Panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel5MouseClicked
        if(flip[5]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel5.getGraphics();
                g.drawImage(cartel[5], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[5] == miniAux){
                     flip[5]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[5], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel5.getGraphics();
                miniAux=cartel[5];              
                numAux=num[5];
                posAux=5;

                flip[5]=1;
                g=Panel5.getGraphics();
                g.drawImage(cartel[5], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel5MouseClicked

    private void Panel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel7MouseClicked
        if(flip[7]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel7.getGraphics();
                g.drawImage(cartel[7], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[7] == miniAux){
                     flip[7]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[7], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel7.getGraphics();
                miniAux=cartel[7];              
                numAux=num[7];
                posAux=7;

                flip[7]=1;
                g=Panel7.getGraphics();
                g.drawImage(cartel[7], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel7MouseClicked

    private void Panel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel8MouseClicked
        if(flip[8]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel8.getGraphics();
                g.drawImage(cartel[8], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[8] == miniAux){
                     flip[8]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[8], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel8.getGraphics();
                miniAux=cartel[8];              
                numAux=num[8];
                posAux=8;

                flip[8]=1;
                g=Panel8.getGraphics();
                g.drawImage(cartel[8], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel8MouseClicked

    private void Panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel9MouseClicked
        if(flip[9]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel9.getGraphics();
                g.drawImage(cartel[9], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[9] == miniAux){
                     flip[9]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[9], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel9.getGraphics();
                miniAux=cartel[9];              
                numAux=num[9];
                posAux=9;

                flip[9]=1;
                g=Panel9.getGraphics();
                g.drawImage(cartel[9], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel9MouseClicked

    private void Panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel10MouseClicked
        if(flip[10]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel10.getGraphics();
                g.drawImage(cartel[10], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[10] == miniAux){
                     flip[10]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[10], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel10.getGraphics();
                miniAux=cartel[10];              
                numAux=num[10];
                posAux=10;

                flip[10]=1;
                g=Panel10.getGraphics();
                g.drawImage(cartel[10], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel10MouseClicked

    private void Panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel11MouseClicked
        if(flip[11]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel11.getGraphics();
                g.drawImage(cartel[11], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[11] == miniAux){
                     flip[11]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[11], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel11.getGraphics();
                miniAux=cartel[11];              
                numAux=num[11];
                posAux=11;

                flip[11]=1;
                g=Panel11.getGraphics();
                g.drawImage(cartel[11], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel11MouseClicked

    private void Panel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel13MouseClicked
        if(flip[13]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel13.getGraphics();
                g.drawImage(cartel[13], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[13] == miniAux){
                     flip[13]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[13], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel13.getGraphics();
                miniAux=cartel[13];              
                numAux=num[13];
                posAux=13;

                flip[13]=1;
                g=Panel13.getGraphics();
                g.drawImage(cartel[13], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel13MouseClicked

    private void Panel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel14MouseClicked
        if(flip[14]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel14.getGraphics();
                g.drawImage(cartel[14], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[14] == miniAux){
                     flip[14]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[14], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel14.getGraphics();
                miniAux=cartel[14];              
                numAux=num[14];
                posAux=14;

                flip[14]=1;
                g=Panel14.getGraphics();
                g.drawImage(cartel[14], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel14MouseClicked

    private void Panel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel15MouseClicked
        if(flip[15]==0)
        { 
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel15.getGraphics();
                g.drawImage(cartel[15], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                
                if( cartel[15] == miniAux){
                     flip[15]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                pausa(1000); 
                g.drawImage(num[15], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                flip[posAux]=0;
                puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                } 
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel15.getGraphics();
                miniAux=cartel[15];              
                numAux=num[15];
                posAux=15;

                flip[15]=1;
                g=Panel15.getGraphics();
                g.drawImage(cartel[15], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel15MouseClicked

    private void Panel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel6MouseClicked
        if(flip[6]==0)
        {
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel6.getGraphics();
                g.drawImage(cartel[6], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);

                if( cartel[6] == miniAux){
                    flip[6]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                    pausa(1000);
                    g.drawImage(num[6], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                    aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                    flip[posAux]=0;
                    puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                }
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel6.getGraphics();
                miniAux=cartel[6];
                numAux=num[6];
                posAux=6;

                flip[6]=1;
                g=Panel6.getGraphics();
                g.drawImage(cartel[6], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel6MouseClicked

    private void Panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel12MouseClicked
        if(flip[12]==0)
        {
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel12.getGraphics();
                g.drawImage(cartel[12], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);

                if( cartel[12] == miniAux){
                    flip[12]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                    pausa(1000);
                    g.drawImage(num[12], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                    aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                    flip[posAux]=0;
                    puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                }
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel12.getGraphics();
                miniAux=cartel[12];
                numAux=num[12];
                posAux=12;

                flip[12]=1;
                g=Panel12.getGraphics();
                g.drawImage(cartel[12], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel12MouseClicked

    private void Panel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel16MouseClicked
        if(flip[16]==0)
        {
            // Si ya hay otra Mini_Img activada
            if (act==1)
            {
                g=Panel16.getGraphics();
                g.drawImage(cartel[16], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);

                if( cartel[16] == miniAux){
                    flip[16]=flip[posAux]=1;                  // La posicion no sera activada nuevamente.
                    puntaje = puntaje + 20;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);  //suma ptos
                }else{
                    pausa(1000);
                    g.drawImage(num[16], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);    // Devuelve la actual a su estado de num.
                    aux.drawImage(numAux, 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
                    flip[posAux]=0;
                    puntaje = puntaje - 5;    ptos2D.clearRect(0,0,100,40);    ptos2D.drawString(puntaje +"",0,25);   // Quita ptos
                }
                act=0;
            }
            else    // Si es la primera en activarse
            {
                act=1;
                aux=Panel16.getGraphics();
                miniAux=cartel[16];
                numAux=num[16];
                posAux=16;

                flip[16]=1;
                g=Panel16.getGraphics();
                g.drawImage(cartel[16], 1, 1, Panel1.getWidth()-2, Panel1.getHeight()-2,this);
            }
        }
    }//GEN-LAST:event_Panel16MouseClicked


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorice().setVisible(true);
            }
        });
    }
    
    // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLTiempo;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JPanel Puntos;
    private javax.swing.JToggleButton StartButton;
    private javax.swing.JPanel Tiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
