package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Tablero extends JLayeredPane {

    public ArrayList<Casilla> todasLasCasillas = new ArrayList<>();
    public ArrayList<Casilla> casillasNoComprables = new ArrayList<>();
    private PanelTablero_Monopoly panelTablero;
    private JugadoresOverlay jugadoresOverlay;

    public Tablero(int xCoord, int yCoord, int width, int height, PanelTablero_Monopoly panelTablero) {
        this.panelTablero = panelTablero;
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBounds(xCoord, yCoord, 800, 800);
        this.setLayout(null);
        inicializarCasillas();

        jugadoresOverlay = new JugadoresOverlay(panelTablero, this);
        jugadoresOverlay.setBounds(0, 0, 800, 800);
        this.add(jugadoresOverlay, JLayeredPane.DRAG_LAYER);
    }

    private void inicializarCasillas() {
        String[] nombresCasillas = {
            "Inicio", "Avenida Mediterránea", "Arca Comunal", "Avenida Báltica", "Impuesto sobre el ingreso", "Ferrocarril Reading",
            "Avenida Oriental", "Casualidad", "Avenida Vermont", "Avenida Connecticut", "Cárcel visita",
            "Plaza St. Charles", "Compañía Eléctrica", "Avenida de los Estados", "Avenida Virginia", "Ferrocarril Pennsylvania",
            "Plaza St. James", "Arca Comunal", "Avenida Tennessee", "Avenida Nueva York", "Free Parking",
            "Avenida Kentucky", "Casualidad", "Avenida Indiana", "Avenida Illinois", "Ferrocarril B&O",
            "Avenida Atlántico", "Avenida Ventnor", "Compañía de Agua", "Jardines Marvin", "Ir a la cárcel",
            "Avenida Pacífico", "Avenida Carolina del Norte", "Arca Comunal", "Avenida Pennsylvania", "Ferrocarril Corto",
            "Casualidad", "Paseo del Parque", "Impuesto de Lujo", "El Muelle"
        };

        int[][] coordenadasCasillas = {
            {710, 710}, {640, 710}, {570, 710}, {500, 710}, {430, 710}, {360, 710}, {290, 710}, {220, 710}, {150, 710}, {80, 710}, {10, 710},
            {10, 640}, {10, 570}, {10, 500}, {10, 430}, {10, 360}, {10, 290}, {10, 220}, {10, 150}, {10, 80}, {10, 10},
            {80, 10}, {150, 10}, {220, 10}, {290, 10}, {360, 10}, {430, 10}, {500, 10}, {570, 10}, {640, 10}, {710, 10},
            {710, 80}, {710, 150}, {710, 220}, {710, 290}, {710, 360}, {710, 430}, {710, 500}, {710, 570}, {710, 640}
        };

        for (int i = 0; i < nombresCasillas.length; i++) {
            int x = coordenadasCasillas[i][0];
            int y = coordenadasCasillas[i][1];
            Casilla casilla = new Casilla(x, y, 70, 70, nombresCasillas[i]);
            this.add(casilla, JLayeredPane.DEFAULT_LAYER);
            todasLasCasillas.add(casilla);
            if (i == 0 || i == 2 || i == 7 || i == 10 || i == 17 || i == 20 || i == 22 || i == 30 || i == 33 || i == 36 || i == 38) {
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

        ImageIcon monopolyIcon = new ImageIcon(getClass().getResource("/resources/logoMonopoly.png"));
        JLabel lblMonopolyImage = new JLabel(monopolyIcon);
        lblMonopolyImage.setBounds(-80, 10, 900, 700); 

        Image image = monopolyIcon.getImage();
        BufferedImage rotatedImage = rotarImagen(image, -45);
        Image scaledImage = imagenEscalada(rotatedImage, lblMonopolyImage.getWidth(), lblMonopolyImage.getHeight());

        lblMonopolyImage.setIcon(new ImageIcon(scaledImage));
        this.add(lblMonopolyImage, JLayeredPane.DEFAULT_LAYER);
    }

    private BufferedImage rotarImagen(Image img, double angle) {
        int width = img.getWidth(null);
        int height = img.getHeight(null);

        double radians = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));
        int newWidth = (int) Math.floor(width * cos + height * sin);
        int newHeight = (int) Math.floor(height * cos + width * sin);

        BufferedImage rotated = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotated.createGraphics();

        AffineTransform transform = new AffineTransform();
        transform.translate((newWidth - width) / 2, (newHeight - height) / 2);
        transform.rotate(radians, width / 2.0, height / 2.0);

        g2d.drawImage(img, transform, null);
        g2d.dispose();
        return rotated;
    }

    private Image imagenEscalada(Image srcImg, int w, int h) {
        int imgWidth = srcImg.getWidth(null);
        int imgHeight = srcImg.getHeight(null);
        double aspectRatio = (double) imgWidth / imgHeight;

        int newWidth = w;
        int newHeight = h;

        if (w / aspectRatio < h) {
            newHeight = (int) (w / aspectRatio);
        } else {
            newWidth = (int) (h * aspectRatio);
        }

        return srcImg.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    }

    public void actualizarJugadores() {
        jugadoresOverlay.repaint();
    }

    public void moverJugador(Jugador jugador, int resultado) {
        int nuevaPosicion = (jugador.getPosicion() + resultado) % 40;
        Casilla casillaAnterior = todasLasCasillas.get(jugador.getPosicion());
        Casilla nuevaCasilla = todasLasCasillas.get(nuevaPosicion);

        casillaAnterior.eliminarJugador(jugador);
        nuevaCasilla.agregarJugador(jugador);

        jugador.setPosicion(nuevaPosicion);

        jugador.setX(nuevaCasilla.getX() + nuevaCasilla.getWidth() / 2 - 10);
        jugador.setY(nuevaCasilla.getY() + nuevaCasilla.getHeight() / 2 - 10);

        actualizarJugadores();
    }
}
