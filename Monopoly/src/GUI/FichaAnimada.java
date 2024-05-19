/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author keive
 */
public class FichaAnimada extends Thread {

    private Jugador jugador;
    private int movimiento;
    private Tablero tablero;
    private int delay;
    private OnFinishListener onFinishListener;

    public FichaAnimada(Jugador jugador, int movimiento, Tablero tablero, int delay) {
        this.jugador = jugador;
        this.movimiento = movimiento;
        this.tablero = tablero;
        this.delay = delay;
    }

    @Override
    public void run() {
        int viejaPos = jugador.getPosicion();
        int nuevaPos = (viejaPos + movimiento) % 40; 

        for (int i = 1; i <= movimiento; i++) {
            int posicionIntermedia = (viejaPos + i) % 40;
            Casilla casilla = tablero.todasLasCasillas.get(posicionIntermedia);

            jugador.setX(casilla.getX() + casilla.getWidth() / 2 - 10);
            jugador.setY(casilla.getY() + casilla.getHeight() / 2 - 10);
            tablero.actualizarJugadores();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        jugador.setPosicion(nuevaPos);

        if (onFinishListener != null) {
            onFinishListener.onFinish();
        }
    }

    public void setOnFinishListener(OnFinishListener onFinishListener) {
        this.onFinishListener = onFinishListener;
    }

    public interface OnFinishListener {

        void onFinish();
    }
}
