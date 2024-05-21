/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author keiver
 */
public class PanelMain_Monopoly extends javax.swing.JFrame {

    /**
     * Creates new form PanelMain_Monopoly
     */
    public PanelMain_Monopoly() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        panelFondo.requestFocus();
        panelFondo.setOpaque(false);
        Border bordeBoton = BorderFactory.createLineBorder(new Color(0, 0, 0), 0);
        panelBoton.setBorder(bordeBoton);
    }

    public void setNombreJugador1(String nombre) {
        txtJugador1.setText(nombre);
    }

    public void setNombreJugador2(String nombre) {
        txtJugador2.setText(nombre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtJugador3 = new javax.swing.JTextField();
        txtJugador4 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        txtJugador5 = new javax.swing.JTextField();
        txtJugador6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(245, 245, 245));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

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
        panelFondo.add(lblCierre);
        lblCierre.setBounds(630, 10, 30, 32);

        txtJugador2.setBackground(new java.awt.Color(255, 217, 61));
        txtJugador2.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("Jugador 2");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador2);
        txtJugador2.setBounds(60, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(255, 107, 107));
        txtJugador1.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("Jugador 1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1);
        txtJugador1.setBounds(60, 100, 230, 40);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Monopoly");
        panelFondo.add(lblTitulo);
        lblTitulo.setBounds(130, 30, 420, 42);

        txtJugador3.setBackground(new java.awt.Color(111, 255, 233));
        txtJugador3.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador3.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador3.setText("Jugador 3");
        txtJugador3.setBorder(null);
        txtJugador3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador3FocusLost(evt);
            }
        });
        txtJugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador3MouseExited(evt);
            }
        });
        txtJugador3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador3KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador3);
        txtJugador3.setBounds(60, 220, 230, 40);

        txtJugador4.setBackground(new java.awt.Color(77, 150, 255));
        txtJugador4.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador4.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador4.setText("Jugador 4");
        txtJugador4.setBorder(null);
        txtJugador4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador4FocusLost(evt);
            }
        });
        txtJugador4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador4MouseExited(evt);
            }
        });
        txtJugador4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador4KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador4);
        txtJugador4.setBounds(400, 100, 230, 40);

        panelBoton.setBackground(new java.awt.Color(23, 165, 137));

        lblIniciar.setBackground(new java.awt.Color(255, 255, 255));
        lblIniciar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(0, 0, 0));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("INICIAR");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(260, 290, 160, 50);

        txtJugador5.setBackground(new java.awt.Color(255, 183, 221));
        txtJugador5.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador5.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador5.setText("Jugador 5");
        txtJugador5.setBorder(null);
        txtJugador5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador5FocusLost(evt);
            }
        });
        txtJugador5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador5MouseExited(evt);
            }
        });
        txtJugador5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador5KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador5);
        txtJugador5.setBounds(400, 160, 230, 40);

        txtJugador6.setBackground(new java.awt.Color(204, 229, 255));
        txtJugador6.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador6.setForeground(new java.awt.Color(51, 51, 51));
        txtJugador6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador6.setText("Jugador 6");
        txtJugador6.setBorder(null);
        txtJugador6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador6FocusLost(evt);
            }
        });
        txtJugador6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador6MouseExited(evt);
            }
        });
        txtJugador6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador6KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador6);
        txtJugador6.setBounds(400, 220, 230, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void lblIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMousePressed

        Jugador jugador1 = new Jugador(txtJugador1.getText(), 1, Color.BLACK, 730, 730);
        Jugador jugador2 = new Jugador(txtJugador2.getText(), 2, Color.BLUE, 730, 730);
        Jugador jugador3 = new Jugador(txtJugador3.getText(), 3, Color.CYAN, 730, 730);
        Jugador jugador4 = new Jugador(txtJugador4.getText(), 4, Color.MAGENTA, 730, 730);
        Jugador jugador5 = new Jugador(txtJugador5.getText(), 5, Color.ORANGE, 730, 730);
        Jugador jugador6 = new Jugador(txtJugador6.getText(), 6, Color.LIGHT_GRAY, 730, 730);

        List<Jugador> jugadores = new ArrayList<>();
        List<Integer> posicionesJugadores = new ArrayList<>();

        if (!txtJugador1.getText().trim().equals("") && !txtJugador1.getText().trim().equals("Jugador 1")) {
            jugadores.add(jugador1);
            posicionesJugadores.add(1);
        }
        if (!txtJugador2.getText().isEmpty() && !txtJugador2.getText().trim().equals("Jugador 2")) {
            jugadores.add(jugador2);
            posicionesJugadores.add(2);
        }
        if (!txtJugador3.getText().isEmpty() && !txtJugador3.getText().trim().equals("Jugador 3")) {
            jugadores.add(jugador3);
            posicionesJugadores.add(3);
        }
        if (!txtJugador4.getText().isEmpty() && !txtJugador4.getText().trim().equals("Jugador 4")) {
            jugadores.add(jugador4);
            posicionesJugadores.add(4);
        }
        if (!txtJugador5.getText().isEmpty() && !txtJugador5.getText().trim().equals("Jugador 5")) {
            jugadores.add(jugador5);
            posicionesJugadores.add(5);
        }
        if (!txtJugador6.getText().isEmpty() && !txtJugador6.getText().trim().equals("Jugador 6")) {
            jugadores.add(jugador6);
            posicionesJugadores.add(6);
        }

        if (jugadores.size() >= 2) {
            PanelTablero_Monopoly panelTablero = new PanelTablero_Monopoly(jugadores, posicionesJugadores);
            panelTablero.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos dos jugadores con nombres válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblIniciarMousePressed

    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
        panelBoton.setBackground(new Color(23, 165, 137));
    }//GEN-LAST:event_lblIniciarMouseExited

    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
        panelBoton.setBackground(new Color(32, 210, 171));
    }//GEN-LAST:event_lblIniciarMouseEntered

    private void txtJugador4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador4KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador4.getText().length() >= 10)
            evt.consume();
    }//GEN-LAST:event_txtJugador4KeyTyped

    private void txtJugador4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador4MouseExited
        txtJugador4.setBorder(null);
    }//GEN-LAST:event_txtJugador4MouseExited

    private void txtJugador4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador4MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(8, 98, 207), 2);
        txtJugador4.setBorder(borde);
    }//GEN-LAST:event_txtJugador4MouseEntered

    private void txtJugador4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador4FocusLost
        if (txtJugador4.getText().trim().equals("")) {
            txtJugador4.setText("Jugador 4");
        }
    }//GEN-LAST:event_txtJugador4FocusLost

    private void txtJugador4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador4FocusGained
        if (txtJugador4.getText().equals("Jugador 4")) {
            txtJugador4.setText("");
        }
    }//GEN-LAST:event_txtJugador4FocusGained

    private void txtJugador3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador3KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador3.getText().length() >= 10)
            evt.consume();
    }//GEN-LAST:event_txtJugador3KeyTyped

    private void txtJugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador3MouseExited
        txtJugador3.setBorder(null);
    }//GEN-LAST:event_txtJugador3MouseExited

    private void txtJugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador3MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(46, 182, 125), 2);
        txtJugador3.setBorder(borde);
    }//GEN-LAST:event_txtJugador3MouseEntered

    private void txtJugador3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador3FocusLost
        if (txtJugador3.getText().trim().equals("")) {
            txtJugador3.setText("Jugador 3");
        }
    }//GEN-LAST:event_txtJugador3FocusLost

    private void txtJugador3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador3FocusGained
        if (txtJugador3.getText().equals("Jugador 3")) {
            txtJugador3.setText("");
        }
    }//GEN-LAST:event_txtJugador3FocusGained

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador1.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(198, 48, 48), 2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if (txtJugador1.getText().trim().equals("")) {
            txtJugador1.setText("Jugador 1");
        }
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if (txtJugador1.getText().equals("Jugador 1")) {
            txtJugador1.setText("");
        }
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador2.getText().length() >= 10)
            evt.consume();
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(183, 140, 0), 2);
        txtJugador2.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if (txtJugador2.getText().trim().equals("")) {
            txtJugador2.setText("Jugador 2");
        }
    }//GEN-LAST:event_txtJugador2FocusLost

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if (txtJugador2.getText().equals("Jugador 2")) {
            txtJugador2.setText("");
        }
    }//GEN-LAST:event_txtJugador2FocusGained

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void txtJugador5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador5FocusGained
        if (txtJugador5.getText().equals("Jugador 5")) {
            txtJugador5.setText("");
        }
    }//GEN-LAST:event_txtJugador5FocusGained

    private void txtJugador5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador5FocusLost
        if (txtJugador5.getText().trim().equals("")) {
            txtJugador5.setText("Jugador 5");
        }
    }//GEN-LAST:event_txtJugador5FocusLost

    private void txtJugador5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador5MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(108, 117, 125), 2);
        txtJugador5.setBorder(borde);
    }//GEN-LAST:event_txtJugador5MouseEntered

    private void txtJugador5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador5MouseExited
        txtJugador5.setBorder(null);
    }//GEN-LAST:event_txtJugador5MouseExited

    private void txtJugador5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador5KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador5.getText().length() >= 10)
            evt.consume();
    }//GEN-LAST:event_txtJugador5KeyTyped

    private void txtJugador6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador6FocusGained
        if (txtJugador6.getText().equals("Jugador 6")) {
            txtJugador6.setText("");
        }
    }//GEN-LAST:event_txtJugador6FocusGained

    private void txtJugador6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador6FocusLost
        if (txtJugador6.getText().trim().equals("")) {
            txtJugador6.setText("Jugador 6");
        }
    }//GEN-LAST:event_txtJugador6FocusLost

    private void txtJugador6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador6MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(137, 169, 192), 2);
        txtJugador6.setBorder(borde);
    }//GEN-LAST:event_txtJugador6MouseEntered

    private void txtJugador6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador6MouseExited
        txtJugador6.setBorder(null);
    }//GEN-LAST:event_txtJugador6MouseExited

    private void txtJugador6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador6KeyTyped
        char caracter = Character.toLowerCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if (txtJugador6.getText().length() >= 10)
            evt.consume();
    }//GEN-LAST:event_txtJugador6KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelMain_Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMain_Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMain_Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMain_Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMain_Monopoly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    private javax.swing.JTextField txtJugador3;
    private javax.swing.JTextField txtJugador4;
    private javax.swing.JTextField txtJugador5;
    private javax.swing.JTextField txtJugador6;
    // End of variables declaration//GEN-END:variables

}
