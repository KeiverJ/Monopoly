/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author keiver
 */
public class PanelTablero_Monopoly extends javax.swing.JFrame {

    public List<Jugador> jugadores;
    private Tablero tablero = new Tablero(6, 6, 790, 790, this);
    private int indiceJugadorActual = 0;

    public PanelTablero_Monopoly(List<Jugador> jugadores, List<Integer> posicionesJugadores) {
        this.jugadores = jugadores;
        setUndecorated(true);
        initComponents();
        init2();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
        asignarNombres(jugadores);

    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    private void init2() {
        panelTablero.setLayout(new BorderLayout());
        panelTablero.add(tablero, BorderLayout.CENTER);
    }

    private void asignarNombres(List<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            switch (i) {
                case 0:
                    lblNombreJ1.setText(jugador.getNombre());
                    break;
                case 1:
                    lblNombreJ2.setText(jugador.getNombre());
                    break;
                case 2:
                    lblNombreJ3.setText(jugador.getNombre());
                    break;
                case 3:
                    lblNombreJ4.setText(jugador.getNombre());
                    break;
                case 4:
                    lblNombreJ5.setText(jugador.getNombre());
                    break;
                case 5:
                    lblNombreJ6.setText(jugador.getNombre());
                    break;
                default:
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelBoton1 = new javax.swing.JPanel();
        lblTerminarPartida = new javax.swing.JLabel();
        panelBoton3 = new javax.swing.JPanel();
        lblLanzarDado = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();
        jpanelReiniciar = new javax.swing.JPanel();
        lblReiniciar = new javax.swing.JLabel();
        lblNombreJ3 = new javax.swing.JLabel();
        lblNombreJ4 = new javax.swing.JLabel();
        Ficha4 = new javax.swing.JLabel();
        Ficha3 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblNombreJ2 = new javax.swing.JLabel();
        Ficha2 = new javax.swing.JLabel();
        Ficha1 = new javax.swing.JLabel();
        lblNombreJ5 = new javax.swing.JLabel();
        Ficha5 = new javax.swing.JLabel();
        Ficha6 = new javax.swing.JLabel();
        lblNombreJ6 = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(240, 232, 216));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(0, 0, 0));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(240, 232, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBoton1.setBackground(new java.awt.Color(216, 195, 165));

        lblTerminarPartida.setBackground(new java.awt.Color(255, 255, 255));
        lblTerminarPartida.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblTerminarPartida.setForeground(new java.awt.Color(0, 0, 0));
        lblTerminarPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerminarPartida.setText("Terminar partida");
        lblTerminarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTerminarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1Layout = new javax.swing.GroupLayout(panelBoton1);
        panelBoton1.setLayout(panelBoton1Layout);
        panelBoton1Layout.setHorizontalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTerminarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        panelBoton1Layout.setVerticalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 166, 50));

        panelBoton3.setBackground(new java.awt.Color(140, 211, 179));

        lblLanzarDado.setBackground(new java.awt.Color(255, 255, 255));
        lblLanzarDado.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblLanzarDado.setForeground(new java.awt.Color(0, 0, 0));
        lblLanzarDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLanzarDado.setText("Lanzar dado");
        lblLanzarDado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLanzarDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLanzarDadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLanzarDadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLanzarDadoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton3Layout = new javax.swing.GroupLayout(panelBoton3);
        panelBoton3.setLayout(panelBoton3Layout);
        panelBoton3Layout.setHorizontalGroup(
            panelBoton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBoton3Layout.setVerticalGroup(
            panelBoton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 50));
        jPanel2.add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 120, 120));

        jpanelReiniciar.setBackground(new java.awt.Color(177, 156, 217));

        lblReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        lblReiniciar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        lblReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReiniciar.setText("Reiniciar partida");
        lblReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReiniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpanelReiniciarLayout = new javax.swing.GroupLayout(jpanelReiniciar);
        jpanelReiniciar.setLayout(jpanelReiniciarLayout);
        jpanelReiniciarLayout.setHorizontalGroup(
            jpanelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelReiniciarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelReiniciarLayout.setVerticalGroup(
            jpanelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelReiniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jpanelReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 166, 50));

        lblNombreJ3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ3.setForeground(new java.awt.Color(80, 200, 120));
        lblNombreJ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 40));

        lblNombreJ4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ4.setForeground(new java.awt.Color(204, 153, 255));
        lblNombreJ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 40));
        jPanel2.add(Ficha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 70));

        Ficha3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(Ficha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 70));

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(220, 20, 60));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 40));

        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(65, 105, 225));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 40));
        jPanel2.add(Ficha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, 70));
        jPanel2.add(Ficha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 70));

        lblNombreJ5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ5.setForeground(new java.awt.Color(204, 153, 255));
        lblNombreJ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 40));
        jPanel2.add(Ficha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 60, 70));
        jPanel2.add(Ficha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, 70));

        lblNombreJ6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ6.setForeground(new java.awt.Color(65, 105, 225));
        lblNombreJ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreJ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 100, 40));

        panelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 470, 750));

        panelTablero.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        panelFondo.add(panelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblTerminarPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseEntered
        panelBoton1.setBackground(new Color(204, 183, 153));
    }//GEN-LAST:event_lblTerminarPartidaMouseEntered

    private void lblTerminarPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseExited
        panelBoton1.setBackground(new Color(216, 195, 165));
    }//GEN-LAST:event_lblTerminarPartidaMouseExited

    private void lblTerminarPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMousePressed

    }//GEN-LAST:event_lblTerminarPartidaMousePressed

    private void lblLanzarDadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMouseEntered
        panelBoton3.setBackground(new Color(183, 221, 200));
    }//GEN-LAST:event_lblLanzarDadoMouseEntered

    private void lblLanzarDadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMouseExited
        panelBoton3.setBackground(new Color(140, 211, 179));
    }//GEN-LAST:event_lblLanzarDadoMouseExited

    private void lblLanzarDadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMousePressed
        lanzarDadosYActualizar();
    }//GEN-LAST:event_lblLanzarDadoMousePressed

    private void lblReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseEntered
        jpanelReiniciar.setBackground(new Color(214, 176, 255));
    }//GEN-LAST:event_lblReiniciarMouseEntered

    private void lblReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseExited
        jpanelReiniciar.setBackground(new Color(177, 156, 217));
    }//GEN-LAST:event_lblReiniciarMouseExited

    private void lblReiniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMousePressed

    }//GEN-LAST:event_lblReiniciarMousePressed

    public void lanzarDadosYActualizar() {
        Jugador jugadorActual = getJugadorActual();

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int pasos = dado1 + dado2;

        System.out.println("Jugador " + jugadorActual.getNombre() + " ha lanzado " + dado1 + " y " + dado2 + " para un total de " + pasos);

        tablero.moverJugador(jugadorActual, pasos);
        siguienteJugador();
    }

    public Jugador getJugadorActual() {
        return jugadores.get(indiceJugadorActual);
    }

    public void siguienteJugador() {
        indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ficha1;
    private javax.swing.JLabel Ficha2;
    private javax.swing.JLabel Ficha3;
    private javax.swing.JLabel Ficha4;
    private javax.swing.JLabel Ficha5;
    private javax.swing.JLabel Ficha6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanelReiniciar;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblDado;
    public javax.swing.JLabel lblLanzarDado;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblNombreJ3;
    private javax.swing.JLabel lblNombreJ4;
    private javax.swing.JLabel lblNombreJ5;
    private javax.swing.JLabel lblNombreJ6;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JLabel lblTerminarPartida;
    private javax.swing.JPanel panelBoton1;
    private javax.swing.JPanel panelBoton3;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables
}
