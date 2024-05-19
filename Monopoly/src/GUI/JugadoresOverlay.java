package GUI;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class JugadoresOverlay extends JPanel {

    private PanelTablero_Monopoly panelTablero;
    private Tablero tablero;

    public JugadoresOverlay(PanelTablero_Monopoly panelTablero, Tablero tablero) {
        this.panelTablero = panelTablero;
        this.tablero = tablero;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarJugadores(g);
    }

    private void dibujarJugadores(Graphics g) {
        List<Jugador> jugadores = panelTablero.getJugadores();
        for (Jugador jugador : jugadores) {
            int x = jugador.getX();
            int y = jugador.getY();
            g.setColor(jugador.getColor());
            g.fillOval(x, y, 20, 20);
        }
    }
}
