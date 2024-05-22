/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author keiver
 */
public class Tablero extends JLayeredPane {

    public ArrayList<Casilla> todasLasCasillas = new ArrayList<>();
    public ArrayList<Casilla> casillasNoComprables = new ArrayList<>();
    public HashMap<Color, List<Casilla>> gruposPorColor = new HashMap<>();

    private PanelTablero_Monopoly panelTablero;
    private int impuestosAcumulados = 0;
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
        imprimirGruposDeColores();

    }

    public void imprimirGruposDeColores() {
        for (Color color : gruposPorColor.keySet()) {
            System.out.println("Grupo de color: " + color);
            List<Casilla> casillas = gruposPorColor.get(color);
            for (Casilla casilla : casillas) {
                System.out.println("- " + casilla.getNombre());
            }
        }
    }

    public Map<Color, List<Casilla>> getGruposPorColor() {
        return gruposPorColor;
    }

    public List<Casilla> getTodasLasCasillas() {
        return todasLasCasillas;
    }

    private void inicializarCasillas() {
        String[] nombresCasillas = {
            "Inicio", "Avenida Mediterránea", "Avanza", "Avenida Báltica", "Impuesto sobre el ingreso", "Ferrocarril Reading",
            "Avenida Oriental", "Retrocedes", "Avenida Vermont", "Avenida Connecticut", "Salida de la cárcel",
            "Plaza St. Charles", "Compañía Eléctrica", "Avenida de los Estados", "Avenida Virginia", "Ferrocarril Pennsylvania",
            "Plaza St. James", "Retrocedes", "Avenida Tennessee", "Avenida Nueva York", "Free Parking",
            "Avenida Kentucky", "Avanzas", "Avenida Indiana", "Avenida Illinois", "Ferrocarril B&O",
            "Avenida Atlántico", "Avenida Ventnor", "Compañía de Agua", "Jardines Marvin", "Entrada a la cárcel",
            "Avenida Pacífico", "Avenida Carolina del Norte", "Retrocedes", "Avenida Pennsylvania", "Ferrocarril Corto",
            "Avanzas", "Paseo del Parque", "Impuesto de Lujo", "El Muelle"
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

            if (i == 0 || i == 2 || i == 4 || i == 7 || i == 10 || i == 17 || i == 20 || i == 22 || i == 30 || i == 33 || i == 36 || i == 38) {
                casillasNoComprables.add(casilla);
            }
        }

        //GRUPO COLORES:
        gruposPorColor.put(Color.BLUE, Arrays.asList(todasLasCasillas.get(1), todasLasCasillas.get(3)));
        gruposPorColor.put(Color.GRAY, Arrays.asList(todasLasCasillas.get(5), todasLasCasillas.get(15), todasLasCasillas.get(25), todasLasCasillas.get(35)));
        gruposPorColor.put(Color.PINK, Arrays.asList(todasLasCasillas.get(6), todasLasCasillas.get(8), todasLasCasillas.get(9)));
        gruposPorColor.put(Color.MAGENTA, Arrays.asList(todasLasCasillas.get(11), todasLasCasillas.get(13), todasLasCasillas.get(14)));
        gruposPorColor.put(Color.RED, Arrays.asList(todasLasCasillas.get(16), todasLasCasillas.get(18), todasLasCasillas.get(19)));
        gruposPorColor.put(Color.YELLOW, Arrays.asList(todasLasCasillas.get(21), todasLasCasillas.get(23), todasLasCasillas.get(24)));
        gruposPorColor.put(Color.GREEN, Arrays.asList(todasLasCasillas.get(26), todasLasCasillas.get(27), todasLasCasillas.get(29)));
        gruposPorColor.put(Color.CYAN, Arrays.asList(todasLasCasillas.get(31), todasLasCasillas.get(32), todasLasCasillas.get(34)));
        gruposPorColor.put(Color.WHITE, Arrays.asList(todasLasCasillas.get(37), todasLasCasillas.get(39)));

        //PRECIO PROPIEDAD/ALQUILER
        todasLasCasillas.get(1).setPrecio(40);
        todasLasCasillas.get(1).setPrecioAlquiler(2);

        todasLasCasillas.get(3).setPrecio(60);
        todasLasCasillas.get(3).setPrecioAlquiler(4);

        todasLasCasillas.get(6).setPrecio(100);
        todasLasCasillas.get(6).setPrecioAlquiler(6);

        todasLasCasillas.get(8).setPrecio(100);
        todasLasCasillas.get(8).setPrecioAlquiler(6);

        todasLasCasillas.get(9).setPrecio(120);
        todasLasCasillas.get(9).setPrecioAlquiler(8);

        todasLasCasillas.get(11).setPrecio(140);
        todasLasCasillas.get(11).setPrecioAlquiler(10);

        todasLasCasillas.get(13).setPrecio(140);
        todasLasCasillas.get(13).setPrecioAlquiler(10);

        todasLasCasillas.get(14).setPrecio(160);
        todasLasCasillas.get(14).setPrecioAlquiler(12);

        todasLasCasillas.get(16).setPrecio(180);
        todasLasCasillas.get(16).setPrecioAlquiler(14);

        todasLasCasillas.get(18).setPrecio(180);
        todasLasCasillas.get(18).setPrecioAlquiler(14);

        todasLasCasillas.get(19).setPrecio(200);
        todasLasCasillas.get(19).setPrecioAlquiler(16);

        todasLasCasillas.get(21).setPrecio(220);
        todasLasCasillas.get(21).setPrecioAlquiler(18);

        todasLasCasillas.get(23).setPrecio(220);
        todasLasCasillas.get(23).setPrecioAlquiler(18);

        todasLasCasillas.get(24).setPrecio(240);
        todasLasCasillas.get(24).setPrecioAlquiler(20);

        todasLasCasillas.get(26).setPrecio(260);
        todasLasCasillas.get(26).setPrecioAlquiler(22);

        todasLasCasillas.get(27).setPrecio(260);
        todasLasCasillas.get(27).setPrecioAlquiler(22);

        todasLasCasillas.get(28).setPrecio(280);
        todasLasCasillas.get(28).setPrecioAlquiler(24);

        todasLasCasillas.get(31).setPrecio(300);
        todasLasCasillas.get(31).setPrecioAlquiler(26);

        todasLasCasillas.get(32).setPrecio(300);
        todasLasCasillas.get(32).setPrecioAlquiler(26);

        todasLasCasillas.get(34).setPrecio(320);
        todasLasCasillas.get(34).setPrecioAlquiler(28);

        todasLasCasillas.get(37).setPrecio(350);
        todasLasCasillas.get(37).setPrecioAlquiler(35);

        todasLasCasillas.get(39).setPrecio(400);
        todasLasCasillas.get(39).setPrecioAlquiler(50);

        todasLasCasillas.get(5).setPrecio(200);
        todasLasCasillas.get(5).setPrecioAlquiler(25);

        todasLasCasillas.get(15).setPrecio(200);
        todasLasCasillas.get(15).setPrecioAlquiler(25);

        todasLasCasillas.get(25).setPrecio(200);
        todasLasCasillas.get(25).setPrecioAlquiler(25);

        todasLasCasillas.get(35).setPrecio(200);
        todasLasCasillas.get(35).setPrecioAlquiler(25);

        todasLasCasillas.get(12).setPrecio(150);
        todasLasCasillas.get(12).setPrecioAlquiler(20);

        todasLasCasillas.get(28).setPrecio(150);
        todasLasCasillas.get(28).setPrecioAlquiler(20);

        ImageIcon monopolyIcon = new ImageIcon(getClass().getResource("/resources/logoMonopoly.png"));
        JLabel lblMonopolyImage = new JLabel(monopolyIcon);
        lblMonopolyImage.setBounds(-80, 10, 900, 700);

        Image image = monopolyIcon.getImage();
        BufferedImage rotatedImage = rotarImagen(image, -45);
        Image scaledImage = imagenEscalada(rotatedImage, lblMonopolyImage.getWidth(), lblMonopolyImage.getHeight());

        lblMonopolyImage.setIcon(new ImageIcon(scaledImage));
        this.add(lblMonopolyImage, JLayeredPane.DEFAULT_LAYER);
    }

    public void actualizarJugadores() {
        jugadoresOverlay.repaint();
    }

    public void moverJugador(Jugador jugador, int resultado1, int resultado2) {
        int resultado = resultado1 + resultado2;
        int viejaPos = jugador.getPosicion();
        int nuevaPos = (viejaPos + resultado) % 40;
        Casilla nuevaCasilla = todasLasCasillas.get(nuevaPos);

        FichaAnimada fichaAnimada = new FichaAnimada(jugador, resultado, this, 200);
        fichaAnimada.setOnFinishListener(new FichaAnimada.OnFinishListener() {
            @Override
            public void onFinish() {
                jugador.setPosicion(nuevaPos);
                nuevaCasilla.agregarJugador(jugador);
                actualizarJugadores();

                Jugador jugadorActual = panelTablero.getJugadorActual();
                Casilla casillaActual = todasLasCasillas.get(jugadorActual.getPosicion());

                manejarCasillaEspecial(jugadorActual, casillaActual);

                jugadorActual.pagarRentaEnCasilla(casillaActual.numero, casillaActual.getPrecioAlquiler());
                panelTablero.actualizarDescripcionJugadorActual();
                verificarFinDelJuego();

            }
        });

        fichaAnimada.start();
    }

    private void moverJugadorRetroceso(Jugador jugador, int cantidad) {
        int viejaPos = jugador.getPosicion();
        int nuevaPos = (viejaPos - cantidad + 40) % 40;
        Casilla nuevaCasilla = todasLasCasillas.get(nuevaPos);

        jugador.setPosicion(nuevaPos);
        nuevaCasilla.agregarJugador(jugador);
        actualizarJugadores();

        manejarCasillaEspecial(jugador, nuevaCasilla);
    }

    private void moverJugadorAvance(Jugador jugador, int cantidad) {
        int viejaPos = jugador.getPosicion();
        int nuevaPos = (viejaPos + cantidad) % 40;
        Casilla nuevaCasilla = todasLasCasillas.get(nuevaPos);

        jugador.setPosicion(nuevaPos);
        nuevaCasilla.agregarJugador(jugador);
        actualizarJugadores();

        manejarCasillaEspecial(jugador, nuevaCasilla);
    }

    public void manejarJugadorEncarcelado(Jugador jugador, int resultado1, int resultado2) {
        if (jugador.isEncarcelado()) {
            if (resultado1 == 0 && resultado2 == 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas pagar 50 para salir de la cárcel?", "Salir de la cárcel", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    jugador.restarDinero(50);
                    jugador.setEncarcelado(false);
                    jugador.setDebeMoverseProximoTurno(true);
                    JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado 50 para salir de la cárcel.");
                } else {
                    JOptionPane.showMessageDialog(null, jugador.getNombre() + " no ha pagado para salir de la cárcel.");
                    jugador.setIntentoDadosIgualesRealizado(true);
                }
            } else {
                if (!jugador.isIntentoDadosIgualesRealizado() && !jugador.isIntentoDadosIgualesFallido()) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas pagar 50 para salir de la cárcel?", "Salir de la cárcel", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        jugador.restarDinero(50);
                        jugador.setEncarcelado(false);
                        jugador.setDebeMoverseProximoTurno(true);
                        JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado 50 para salir de la cárcel.");
                    } else {
                        JOptionPane.showMessageDialog(null, jugador.getNombre() + " no ha pagado para salir de la cárcel.");
                        jugador.setIntentoDadosIgualesRealizado(true);
                    }
                } else if (!jugador.isIntentoDadosIgualesRealizado()) {
                    if (resultado1 == resultado2) {
                        jugador.setEncarcelado(false);
                        jugador.setDebeMoverseProximoTurno(true);
                        JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha salido de la cárcel con un doble!");
                    } else {
                        jugador.incrementarTurnosEnCarcel();
                        if (jugador.getTurnosEnCarcel() >= 3) {
                            jugador.restarDinero(50);
                            jugador.setEncarcelado(false);
                            jugador.setDebeMoverseProximoTurno(true);
                            JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado 50 para salir de la cárcel.");
                        } else {
                            JOptionPane.showMessageDialog(null, jugador.getNombre() + " sigue en la cárcel. Turnos en cárcel: " + jugador.getTurnosEnCarcel());
                        }
                    }
                } else {
                    if (!jugador.isIntentoDadosIgualesFallido()) {
                        if (resultado1 == resultado2) {
                            jugador.setEncarcelado(false);
                            jugador.setDebeMoverseProximoTurno(true);
                            JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha salido de la cárcel con un doble!");
                        } else {
                            jugador.incrementarTurnosEnCarcel();
                            if (jugador.getTurnosEnCarcel() >= 3) {
                                jugador.restarDinero(50);
                                jugador.setEncarcelado(false);
                                jugador.setDebeMoverseProximoTurno(true);
                                JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado 50 para salir de la cárcel.");
                            } else {
                                JOptionPane.showMessageDialog(null, jugador.getNombre() + " sigue en la cárcel. Turnos en cárcel: " + jugador.getTurnosEnCarcel());
                            }
                        }
                    } else {
                        jugador.restarDinero(50);
                        jugador.setEncarcelado(false);
                        jugador.setDebeMoverseProximoTurno(true);
                        JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado 50 para salir de la cárcel.");
                        verificarFinDelJuego();
                    }
                }
            }
        } else {
            // 
        }
    }

    private void manejarCasillaEspecial(Jugador jugador, Casilla casilla) {
        switch (casilla.getNombre()) {
            case "Salida de la cárcel":
                break;
            case "Entrada a la cárcel":
                jugador.setPosicion(10);
                jugador.setEncarcelado(true);
                JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha sido enviado a la cárcel.");
                verificarFinDelJuego();
                break;
            case "Free Parking":
                jugador.sumarDinero(impuestosAcumulados);
                impuestosAcumulados = 0;
                break;
            case "Impuesto sobre el ingreso":
                int impuestoIngreso = 200;
                jugador.restarDinero(impuestoIngreso);
                impuestosAcumulados += impuestoIngreso;
                JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado " + impuestoIngreso + " de impuestos sobre el ingreso.");
                verificarFinDelJuego();
                break;
            case "Impuesto de Lujo":
                int impuestoLujo = 100;
                jugador.restarDinero(impuestoLujo);
                impuestosAcumulados += impuestoLujo;
                JOptionPane.showMessageDialog(null, jugador.getNombre() + " ha pagado " + impuestoLujo + " de impuesto de lujo.");
                verificarFinDelJuego();
                break;
            case "Retrocedes":
                moverJugadorRetroceso(jugador, 7);
                JOptionPane.showMessageDialog(null, jugador.getNombre() + " retrocede 7 casillas.");
                break;
            case "Avanzas":
                moverJugadorAvance(jugador, 3);
                JOptionPane.showMessageDialog(null, jugador.getNombre() + " avanza 3 casillas.");
            default:
                break;
        }
    }

    private void verificarFinDelJuego() {
        for (Jugador jugador : panelTablero.getJugadores()) {
            if (jugador.getDinero() <= 0) {
                panelTablero.finalizarJuego(jugador);
                break;
            }
        }
    }

    public String seleccionarPropiedad(Jugador vendedor) {
        List<Integer> propiedades = vendedor.getPropiedades();
        if (propiedades.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No tienes propiedades para vender.");
            return null;
        }

        String[] opciones = propiedades.stream()
                .map(numero -> todasLasCasillas.get(numero).getNombre())
                .toArray(String[]::new);

        return (String) JOptionPane.showInputDialog(
                this,
                "Selecciona la propiedad que deseas vender:",
                "Seleccionar Propiedad",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
    }

    public Jugador seleccionarComprador() {
        String[] opciones = panelTablero.jugadores.stream()
                .filter(jugador -> jugador != panelTablero.getJugadorActual())
                .map(Jugador::getNombre)
                .toArray(String[]::new);

        String seleccion = (String) JOptionPane.showInputDialog(
                this,
                "Selecciona el jugador comprador:",
                "Seleccionar Comprador",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion != null) {
            for (Jugador jugador : panelTablero.jugadores) {
                if (jugador.getNombre().equals(seleccion)) {
                    return jugador;
                }
            }
        }
        return null;
    }

    public int obtenerPrecioVenta() {
        String input = JOptionPane.showInputDialog(this, "Ingresa el precio de venta:");
        if (input != null) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Precio inválido. Inténtalo de nuevo.");
            }
        }
        return -1;
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
}
