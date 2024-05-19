package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Tablero extends JPanel {

    private ArrayList<Casilla> todasLasCasillas = new ArrayList<Casilla>();
    private ArrayList<Casilla> casillasNoComprables = new ArrayList<Casilla>();

    public ArrayList<Casilla> getCasillasNoComprables() {
        return casillasNoComprables;
    }

    public ArrayList<Casilla> getTodasLasCasillas() {
        return todasLasCasillas;
    }

    public Casilla getCasillaEnIndice(int indice) {
        return todasLasCasillas.get(indice);
    }

    public Tablero(int xCoord, int yCoord, int width, int height) {
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBounds(xCoord, yCoord, 800, 800);
        this.setLayout(null);
        inicializarCasillas();
    }

    private void inicializarCasillas() {
        String[] nombresCasillas = {
            "Inicio", "Avenida Mediterránea", "Arca Comunal", "Avenida Báltica", "Impuesto sobre el ingreso", "Ferrocarril Reading",
            "Avenida Oriental", "Casualidad", "Avenida Vermont", "Avenida Connecticut", "Cárcel/Visitas",
            "Plaza St. Charles", "Compañía Eléctrica", "Avenida de los Estados", "Avenida Virginia", "Ferrocarril Pennsylvania",
            "Plaza St. James", "Arca Comunal", "Avenida Tennessee", "Avenida Nueva York", "Free parking",
            "Avenida Kentucky", "Casualidad", "Avenida Indiana", "Avenida Illinois", "Ferrocarril B&O",
            "Avenida Atlántico", "Avenida Ventnor", "Compañía de Agua", "Jardines Marvin", "Ir a la cárcel",
            "Avenida Pacífico", "Avenida Carolina del Norte", "Arca Comunal", "Avenida Pennsylvania", "Ferrocarril Corto",
            "Casualidad", "Paseo del Parque", "Impuesto de Lujo", "El Muelle"
        };

        for (int i = 0; i < 10; i++) {
            Casilla casilla = new Casilla(10 + i * 70, 710, 70, 70, nombresCasillas[i]);
            this.add(casilla);
            todasLasCasillas.add(casilla);
            if (i == 0 || i == 2 || i == 5 || i == 7 || i == 10 || i == 17) {
                casillasNoComprables.add(casilla);
            }
        }

        for (int i = 10; i < 20; i++) {
            Casilla casilla = new Casilla(710, 710 - (i - 10) * 70, 70, 70, nombresCasillas[i]);
            this.add(casilla);
            todasLasCasillas.add(casilla);
            if (i == 10 || i == 12 || i == 17 || i == 19) {
                casillasNoComprables.add(casilla);
            }
        }

        for (int i = 20; i < 30; i++) {
            Casilla casilla = new Casilla(710 - (i - 20) * 70, 10, 70, 70, nombresCasillas[i]);
            this.add(casilla);
            todasLasCasillas.add(casilla);
            if (i == 20 || i == 22 || i == 27 || i == 29) {
                casillasNoComprables.add(casilla);
            }
        }

        for (int i = 30; i < 40; i++) {
            Casilla casilla = new Casilla(10, 10 + (i - 30) * 70, 70, 70, nombresCasillas[i]);
            this.add(casilla);
            todasLasCasillas.add(casilla);
            if (i == 30 || i == 32 || i == 33 || i == 37 || i == 38) {
                casillasNoComprables.add(casilla);
            }
        }

        todasLasCasillas.get(1).setPrecio(60);
        todasLasCasillas.get(3).setPrecio(60);
        todasLasCasillas.get(6).setPrecio(100);
        todasLasCasillas.get(8).setPrecio(100);
        todasLasCasillas.get(9).setPrecio(120);
        todasLasCasillas.get(11).setPrecio(140);
        todasLasCasillas.get(13).setPrecio(140);
        todasLasCasillas.get(14).setPrecio(160);
        todasLasCasillas.get(16).setPrecio(180);
        todasLasCasillas.get(18).setPrecio(180);
        todasLasCasillas.get(19).setPrecio(200);
        todasLasCasillas.get(21).setPrecio(220);
        todasLasCasillas.get(23).setPrecio(220);
        todasLasCasillas.get(24).setPrecio(240);
        todasLasCasillas.get(26).setPrecio(260);
        todasLasCasillas.get(27).setPrecio(260);
        todasLasCasillas.get(28).setPrecio(280);
        todasLasCasillas.get(31).setPrecio(300);
        todasLasCasillas.get(32).setPrecio(300);
        todasLasCasillas.get(34).setPrecio(320);
        todasLasCasillas.get(37).setPrecio(350);
        todasLasCasillas.get(39).setPrecio(400);
        todasLasCasillas.get(1).setPrecioAlquiler(2);
        todasLasCasillas.get(3).setPrecioAlquiler(4);
        todasLasCasillas.get(6).setPrecioAlquiler(6);
        todasLasCasillas.get(8).setPrecioAlquiler(6);
        todasLasCasillas.get(9).setPrecioAlquiler(8);
        todasLasCasillas.get(11).setPrecioAlquiler(10);
        todasLasCasillas.get(13).setPrecioAlquiler(10);
        todasLasCasillas.get(14).setPrecioAlquiler(12);
        todasLasCasillas.get(16).setPrecioAlquiler(14);
        todasLasCasillas.get(18).setPrecioAlquiler(14);
        todasLasCasillas.get(19).setPrecioAlquiler(16);
        todasLasCasillas.get(21).setPrecioAlquiler(18);
        todasLasCasillas.get(23).setPrecioAlquiler(18);
        todasLasCasillas.get(24).setPrecioAlquiler(20);
        todasLasCasillas.get(26).setPrecioAlquiler(22);
        todasLasCasillas.get(27).setPrecioAlquiler(22);
        todasLasCasillas.get(28).setPrecioAlquiler(24);
        todasLasCasillas.get(31).setPrecioAlquiler(26);
        todasLasCasillas.get(32).setPrecioAlquiler(26);
        todasLasCasillas.get(34).setPrecioAlquiler(28);
        todasLasCasillas.get(37).setPrecioAlquiler(35);
        todasLasCasillas.get(39).setPrecioAlquiler(50);

        JLabel lblMonopoly = new JLabel("MONOPOLY") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform aT = g2.getTransform();
                Shape oldshape = g2.getClip();
                double x = getWidth() / 2.0;
                double y = getHeight() / 2.0;
                aT.rotate(Math.toRadians(-35), x, y);
                g2.setTransform(aT);
                g2.setClip(oldshape);
                super.paintComponent(g);
            }
        };
        lblMonopoly.setForeground(Color.WHITE);
        lblMonopoly.setBackground(Color.RED);
        lblMonopoly.setOpaque(true);
        lblMonopoly.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonopoly.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
        lblMonopoly.setBounds(269, 277, 263, 55);
        this.add(lblMonopoly);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}