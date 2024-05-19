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
        for (Jugador jugador : jugadores) {
            jugador.setPanelTablero(this);
        }
        setUndecorated(true);
        initComponents();
        init2();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelBoton = new javax.swing.JPanel();
        lblLanzarDado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        panelComprar = new javax.swing.JPanel();
        lblComprar = new javax.swing.JLabel();
        panelRenta = new javax.swing.JPanel();
        lblRenta = new javax.swing.JLabel();
        panelTurno = new javax.swing.JPanel();
        lblSiguienteTurno = new javax.swing.JLabel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
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
        panelFondo.add(lblCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(240, 232, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBoton.setBackground(new java.awt.Color(140, 211, 179));

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

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, 50));

        txtaDescripcion.setEditable(false);
        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 260));

        panelComprar.setBackground(new java.awt.Color(140, 211, 179));

        lblComprar.setBackground(new java.awt.Color(255, 255, 255));
        lblComprar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblComprar.setForeground(new java.awt.Color(0, 0, 0));
        lblComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprar.setText("Comprar");
        lblComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelComprarLayout = new javax.swing.GroupLayout(panelComprar);
        panelComprar.setLayout(panelComprarLayout);
        panelComprarLayout.setHorizontalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelComprarLayout.setVerticalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 50));

        panelRenta.setBackground(new java.awt.Color(140, 211, 179));

        lblRenta.setBackground(new java.awt.Color(255, 255, 255));
        lblRenta.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblRenta.setForeground(new java.awt.Color(0, 0, 0));
        lblRenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRenta.setText("Pagar renta");
        lblRenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRentaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelRentaLayout = new javax.swing.GroupLayout(panelRenta);
        panelRenta.setLayout(panelRentaLayout);
        panelRentaLayout.setHorizontalGroup(
            panelRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRentaLayout.setVerticalGroup(
            panelRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 160, 50));

        panelTurno.setBackground(new java.awt.Color(140, 211, 179));

        lblSiguienteTurno.setBackground(new java.awt.Color(255, 255, 255));
        lblSiguienteTurno.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblSiguienteTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblSiguienteTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSiguienteTurno.setText("Siguiente turno");
        lblSiguienteTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguienteTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiguienteTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSiguienteTurnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSiguienteTurnoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelTurnoLayout = new javax.swing.GroupLayout(panelTurno);
        panelTurno.setLayout(panelTurnoLayout);
        panelTurnoLayout.setHorizontalGroup(
            panelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTurnoLayout.setVerticalGroup(
            panelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 180, 50));
        jPanel2.add(lblDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 120, 120));
        jPanel2.add(lblDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 120, 120));

        panelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 370, 750));

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
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblLanzarDadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMouseEntered
        panelBoton.setBackground(new Color(183, 221, 200));
    }//GEN-LAST:event_lblLanzarDadoMouseEntered

    private void lblLanzarDadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMouseExited
        panelBoton.setBackground(new Color(140, 211, 179));
    }//GEN-LAST:event_lblLanzarDadoMouseExited

    private void lblLanzarDadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMousePressed
        lanzarDadosYActualizar();
    }//GEN-LAST:event_lblLanzarDadoMousePressed

    private void lblComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComprarMouseEntered

    private void lblComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComprarMouseExited

    private void lblComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMousePressed
        Jugador jugadorActual = getJugadorActual();
        if (jugadorActual != null) {
            Casilla casillaActual = tablero.todasLasCasillas.get(jugadorActual.getPosicion());
            if (!tablero.casillasNoComprables.contains(casillaActual)) {
                jugadorActual.comprarPropiedadEnCasilla(casillaActual.numero, casillaActual.getPrecio());
                actualizarDescripcionJugadorActual();
            } else {
                System.out.println("Esta casilla no es comprable.");
            }
        }
    }//GEN-LAST:event_lblComprarMousePressed

    private void lblRentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRentaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRentaMouseEntered

    private void lblRentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRentaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRentaMouseExited

    private void lblRentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRentaMousePressed
        Jugador jugadorActual = getJugadorActual();
        if (jugadorActual != null) {
            Casilla casillaActual = tablero.todasLasCasillas.get(jugadorActual.getPosicion());
            jugadorActual.pagarRentaEnCasilla(casillaActual.numero, casillaActual.getPrecioAlquiler());
            actualizarDescripcionJugadorActual();
        }
    }//GEN-LAST:event_lblRentaMousePressed

    private void lblSiguienteTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSiguienteTurnoMouseEntered

    private void lblSiguienteTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSiguienteTurnoMouseExited

    private void lblSiguienteTurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMousePressed
        siguienteJugador();
    }//GEN-LAST:event_lblSiguienteTurnoMousePressed

    public void lanzarDadosYActualizar() {
        Jugador jugadorActual = getJugadorActual();

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int resultado = dado1 + dado2;

        System.out.println("Jugador " + jugadorActual.getNombre() + " ha lanzado " + dado1 + " y " + dado2 + " para un total de " + resultado);

        tablero.moverJugador(jugadorActual, resultado);
        actualizarDescripcionJugadorActual();
    }

    public Jugador getJugadorActual() {
        return jugadores.get(indiceJugadorActual);
    }

    public void siguienteJugador() {
        indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
    }

    public Jugador obtenerJugadorPorNumero(int numeroJugador) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNumeroJugador() == numeroJugador) {
                return jugador;
            }
        }
        return null;
    }

    public void actualizarDescripcionJugadorActual() {
        Jugador jugadorActual = getJugadorActual();
        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Nombre: ").append(jugadorActual.getNombre()).append("\n");
        descripcion.append("Dinero: $").append(jugadorActual.getDinero()).append("\n");
        descripcion.append("Propiedades: ");

        if (jugadorActual.getPropiedades().isEmpty()) {
            descripcion.append("Ninguna");
        } else {
            descripcion.append("\n"); 
            for (int propiedad : jugadorActual.getPropiedades()) {
                Casilla casilla = tablero.todasLasCasillas.get(propiedad);
                descripcion.append(casilla.getNombre()).append("\n");
            }
        }

        txtaDescripcion.setText(descripcion.toString());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCierre;
    public javax.swing.JLabel lblComprar;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    public javax.swing.JLabel lblLanzarDado;
    public javax.swing.JLabel lblRenta;
    public javax.swing.JLabel lblSiguienteTurno;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelComprar;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelRenta;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JPanel panelTurno;
    public javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
