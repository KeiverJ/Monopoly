package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Casilla extends JPanel {

    int numero;
    private String nombre;
    String descripcion;
    JLabel etiquetaNombre;
    static int totalCasillas = 0;
    private int precio;
    private int precioAlquiler;

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

    public String getNombre() {
        return nombre;
    }

    public Casilla(int xCoord, int yCoord, int width, int height, String etiqueta) {
        numero = totalCasillas;
        totalCasillas++;
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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.numero == 1 || this.numero == 3 || this.numero == 4) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, this.getWidth(), 15);
        }
        if (this.numero == 6 || this.numero == 8 || this.numero == 9) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.PINK);
            g.fillRect(0, 0, this.getWidth(), 15);
        }
        if (this.numero == 11 || this.numero == 13 || this.numero == 14) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.ORANGE);
            g.fillRect(0, 0, this.getWidth(), 15);
        }
        if (this.numero == 16 || this.numero == 17 || this.numero == 19) {
            g.drawRect(0, 0, this.getWidth(), 15);
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, this.getWidth(), 15);
        }
    }

    private boolean alquilerPagado = false;

    public boolean isAlquilerPagado() {
        return alquilerPagado;
    }

    public void setAlquilerPagado(boolean pagado) {
        alquilerPagado = pagado;
    }
}
