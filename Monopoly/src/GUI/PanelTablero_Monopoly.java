/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author keiver
 */
public class PanelTablero_Monopoly extends javax.swing.JFrame {

    public List<Jugador> jugadores;
    private Tablero tablero = new Tablero(6, 6, 790, 790, this);
    private int indiceJugadorActual = 0;
    public boolean dadoLanzado = false;
    private boolean puedeLanzarDado = true;

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
        lblSiguienteTurno.setEnabled(false);
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
        panelTurno = new javax.swing.JPanel();
        lblSiguienteTurno = new javax.swing.JLabel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        panelTerminar = new javax.swing.JPanel();
        lblTerminarPartida = new javax.swing.JLabel();
        panelpropiedad = new javax.swing.JPanel();
        lblComprarPropiedad = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(245, 245, 245));
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

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBoton.setBackground(new java.awt.Color(40, 167, 69));

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
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 50));

        txtaDescripcion.setEditable(false);
        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 260));

        panelComprar.setBackground(new java.awt.Color(255, 193, 7));

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

        panelTurno.setBackground(new java.awt.Color(23, 162, 184));

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
                .addComponent(lblSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTurnoLayout.setVerticalGroup(
            panelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, 50));
        jPanel2.add(lblDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 120, 120));
        jPanel2.add(lblDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 120, 120));

        panelTerminar.setBackground(new java.awt.Color(220, 53, 69));

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

        javax.swing.GroupLayout panelTerminarLayout = new javax.swing.GroupLayout(panelTerminar);
        panelTerminar.setLayout(panelTerminarLayout);
        panelTerminarLayout.setHorizontalGroup(
            panelTerminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerminarLayout.createSequentialGroup()
                .addComponent(lblTerminarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTerminarLayout.setVerticalGroup(
            panelTerminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTerminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 180, 50));

        panelpropiedad.setBackground(new java.awt.Color(40, 167, 69));

        lblComprarPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        lblComprarPropiedad.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblComprarPropiedad.setForeground(new java.awt.Color(0, 0, 0));
        lblComprarPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprarPropiedad.setText("Vende prop.");
        lblComprarPropiedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprarPropiedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprarPropiedadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprarPropiedadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprarPropiedadMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelpropiedadLayout = new javax.swing.GroupLayout(panelpropiedad);
        panelpropiedad.setLayout(panelpropiedadLayout);
        panelpropiedadLayout.setHorizontalGroup(
            panelpropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpropiedadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelpropiedadLayout.setVerticalGroup(
            panelpropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpropiedadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelpropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 160, 50));

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
        panelBoton.setBackground(new Color(72, 214, 141));
    }//GEN-LAST:event_lblLanzarDadoMouseEntered

    private void lblLanzarDadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMouseExited
        panelBoton.setBackground(new Color(40, 167, 69));
    }//GEN-LAST:event_lblLanzarDadoMouseExited

    private void lblLanzarDadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanzarDadoMousePressed
        Jugador jugadorActual = getJugadorActual();

        if (!puedeLanzarDado) {
            return;
        }

        dadoLanzado = true;

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        int resultado1 = dado1.getValorDado();
        int resultado2 = dado2.getValorDado();

        Timer timer = new Timer(50, null);
        timer.start();

        long tiempoInicio = System.currentTimeMillis();
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;
                if (tiempoTranscurrido < 1000) {
                    ImageIcon iconoAleatorio1 = dado1.obtenerImagenDadoAleatorioRedimensionado(120, 120);
                    ImageIcon iconoAleatorio2 = dado2.obtenerImagenDadoAleatorioRedimensionado(120, 120);
                    lblDado1.setIcon(iconoAleatorio1);
                    lblDado2.setIcon(iconoAleatorio2);
                } else {
                    timer.stop();
                    ImageIcon iconoResultado1 = dado1.obtenerImagenDadoRedimensionada(120, 120);
                    ImageIcon iconoResultado2 = dado2.obtenerImagenDadoRedimensionada(120, 120);
                    lblDado1.setIcon(iconoResultado1);
                    lblDado2.setIcon(iconoResultado2);
                    tablero.manejarJugador(jugadorActual, 30, 0);

                    puedeLanzarDado = false;
                    lblLanzarDado.setEnabled(false);
                    lblSiguienteTurno.setEnabled(true);
                }
            }
        });
        actualizarDescripcionJugadorActual();
    }//GEN-LAST:event_lblLanzarDadoMousePressed

    private void lblComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMouseEntered
        panelComprar.setBackground(new Color(255, 213, 79));
    }//GEN-LAST:event_lblComprarMouseEntered

    private void lblComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMouseExited
        panelComprar.setBackground(new Color(255, 193, 7));
    }//GEN-LAST:event_lblComprarMouseExited

    private void lblComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMousePressed
        Jugador jugadorActual = getJugadorActual();
        if (jugadorActual != null) {
            Casilla casillaActual = tablero.todasLasCasillas.get(jugadorActual.getPosicion());
            if (!tablero.casillasNoComprables.contains(casillaActual)) {
                jugadorActual.comprarPropiedadEnCasilla(casillaActual.numero, casillaActual.getPrecio());
                actualizarDescripcionJugadorActual();
            } else {
                JOptionPane.showMessageDialog(this, "Esta casilla no es comprable.");
            }
        }
    }//GEN-LAST:event_lblComprarMousePressed

    private void lblSiguienteTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMouseEntered
        panelTurno.setBackground(new Color(81, 198, 216));
    }//GEN-LAST:event_lblSiguienteTurnoMouseEntered

    private void lblSiguienteTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMouseExited
        panelTurno.setBackground(new Color(23, 162, 184));
    }//GEN-LAST:event_lblSiguienteTurnoMouseExited

    private void lblSiguienteTurnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTurnoMousePressed
        if (puedeLanzarDado) {
            JOptionPane.showMessageDialog(this, "No puedes cambiar de turno hasta que hayas lanzado el dado.", "Turno no permitido", JOptionPane.WARNING_MESSAGE);
        } else {
            indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
            puedeLanzarDado = true;
            lblLanzarDado.setEnabled(true);
            lblSiguienteTurno.setEnabled(false);
        }
    }//GEN-LAST:event_lblSiguienteTurnoMousePressed

    private void lblTerminarPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseEntered
        panelTerminar.setBackground(new Color(231, 111, 118));
    }//GEN-LAST:event_lblTerminarPartidaMouseEntered

    private void lblTerminarPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseExited
        panelTerminar.setBackground(new Color(220, 53, 69));
    }//GEN-LAST:event_lblTerminarPartidaMouseExited

    private void lblTerminarPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMousePressed
        Casilla.resetTotalCasillas();
        revalidate();
        repaint();
        PanelMain_Monopoly main = new PanelMain_Monopoly();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTerminarPartidaMousePressed

    private void lblComprarPropiedadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarPropiedadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComprarPropiedadMouseEntered

    private void lblComprarPropiedadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarPropiedadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComprarPropiedadMouseExited

    private void lblComprarPropiedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarPropiedadMousePressed
        Jugador vendedor = getJugadorActual();
        String nombrePropiedad = tablero.seleccionarPropiedad(vendedor);
        if (nombrePropiedad == null) {
            return;
        }

        int numeroPropiedad = -1;
        for (int i = 0; i < tablero.todasLasCasillas.size(); i++) {
            if (tablero.todasLasCasillas.get(i).getNombre().equals(nombrePropiedad)) {
                numeroPropiedad = i;
                break;
            }
        }

        if (numeroPropiedad == -1) {
            JOptionPane.showMessageDialog(panelTablero, "Error al obtener el número de la propiedad.");
            return;
        }

        Jugador comprador = tablero.seleccionarComprador();
        if (comprador == null) {
            JOptionPane.showMessageDialog(panelTablero, "No se seleccionó un comprador.");
            return;
        }

        int precioVenta = tablero.obtenerPrecioVenta();
        if (precioVenta == -1) {
            return;
        }

        vendedor.venderPropiedadAJugador(numeroPropiedad, comprador, precioVenta);
    }//GEN-LAST:event_lblComprarPropiedadMousePressed

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

    public Jugador getJugadorActual() {
        return jugadores.get(indiceJugadorActual);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCierre;
    public javax.swing.JLabel lblComprar;
    public javax.swing.JLabel lblComprarPropiedad;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    public javax.swing.JLabel lblLanzarDado;
    public javax.swing.JLabel lblSiguienteTurno;
    public javax.swing.JLabel lblTerminarPartida;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelComprar;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JPanel panelTerminar;
    private javax.swing.JPanel panelTurno;
    private javax.swing.JPanel panelpropiedad;
    public javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
