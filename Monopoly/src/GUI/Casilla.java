/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author keiver
 */
public class Casilla extends JPanel {

    int numero;
    private String nombre;
    private Color color;
    JLabel etiquetaNombre;
    static int totalCasillas = 0;
    private int precio;
    private int precioAlquiler;
    private List<Jugador> jugadoresEnCasilla = new ArrayList<>();
    private Jugador propietario;
    private boolean alquilerPagado = false;

    public Casilla(int xCoord, int yCoord, int width, int height, String etiqueta) {
        numero = totalCasillas;
        totalCasillas++;
        this.color = color;
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBounds(xCoord, yCoord, width, height);
        nombre = etiqueta;
        this.setLayout(new BorderLayout());
        etiquetaNombre = new JLabel("<html><div style='text-align: center;'>" + etiqueta + "<br></div></html>");
        etiquetaNombre.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        etiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaNombre.setVerticalAlignment(SwingConstants.CENTER);

        this.add(etiquetaNombre, BorderLayout.CENTER);
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    public boolean isAlquilerPagado() {
        return alquilerPagado;
    }

    public void setAlquilerPagado(boolean pagado) {
        alquilerPagado = pagado;
    }

    public void agregarJugador(Jugador jugador) {
        if (!jugadoresEnCasilla.contains(jugador)) {
            jugadoresEnCasilla.add(jugador);
            repaint();
        }
    }

    public void eliminarJugador(Jugador jugador) {
        if (jugadoresEnCasilla.contains(jugador)) {
            jugadoresEnCasilla.remove(jugador);
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (this.numero == 1 || this.numero == 3) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 5 || this.numero == 15 || this.numero == 25 || this.numero == 35) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 6 || this.numero == 8 || this.numero == 9) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.PINK);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 11 || this.numero == 13 || this.numero == 14) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.MAGENTA);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 16 || this.numero == 18 || this.numero == 19) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.RED);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 21 || this.numero == 23 || this.numero == 24) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 26 || this.numero == 27 || this.numero == 29) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 31 || this.numero == 32 || this.numero == 34) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, this.getWidth(), 15);
        }

        if (this.numero == 37 || this.numero == 39) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), 15);
        }
    }

    public static void resetTotalCasillas() {
        totalCasillas = 0;
    }

}
