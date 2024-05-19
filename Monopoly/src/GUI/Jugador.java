package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;

public class Jugador {

    private String nombre;
    private int numeroJugador;
    private Color color;
    private int x;
    private int y;
    JLabel lblNumeroJugador;
    private int posicion;
    private ArrayList<int[]> locacionesJugadores = new ArrayList<>();

    private int casillaActual = 1;
    private ArrayList<Integer> propiedades = new ArrayList<>();
    private int dinero = 3200;

    public Jugador(String nombre, int numeroJugador, Color color, int x, int y) {
        this.color = color;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.posicion = posicion;
        this.numeroJugador = numeroJugador;
        inicializarLocacionesJugador();
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getPropiedades() {
        return propiedades;
    }

    public int getDinero() {
        return dinero;
    }

    public void restarDinero(int cantidad) {
        if (cantidad > dinero) {
            System.out.println("¡El jugador " + numeroJugador + " se ha quedado en bancarrota!");
        } else {
            dinero -= cantidad;
        }
    }

    public void sumarDinero(int cantidad) {
        dinero += cantidad;
        System.out.println("¡Día de pago para el jugador " + getNumeroJugador() + "! Has ganado $200.");
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public boolean tienePropiedadEnCasilla(int numeroCasilla) {
        return propiedades.contains(numeroCasilla);
    }

    public void comprarPropiedadEnCasilla(int numeroCasilla) {
        if (registroPropiedad.containsKey(numeroCasilla)) {
            System.out.println("Esta propiedad ya ha sido comprada por alguien. No puedes comprarla aquí.");
        } else {
            propiedades.add(this.getCasillaActual());
            registroPropiedad.put(numeroCasilla, this.getNumeroJugador());
        }
    }

    public void mover(int totalDados) {
        if (casillaActual + totalDados > 39) {
            sumarDinero(200);
        }
        int casillaObjetivo = (casillaActual + totalDados) % 40;
        casillaActual = casillaObjetivo;

        int xLocacion = locacionesJugadores.get(0)[casillaObjetivo];
        int yLocacion = locacionesJugadores.get(1)[casillaObjetivo];
        this.setX(xLocacion);
        this.setY(yLocacion);

        if (registroPropiedad.containsKey(this.getCasillaActual())) {
            //MonopolyMain.consolaInformacion.setText("Esta propiedad pertenece al jugador " + registroPropiedad.get(this.getCasillaActual()));
        }
    }

    private void inicializarLocacionesJugador() {
        int[] xLocacionesJugador = new int[40];
        int[] yLocacionesJugador = new int[40];

        for (int i = 0; i < 10; i++) {
            xLocacionesJugador[i] = 31 + i * 70;
            yLocacionesJugador[i] = 733;
        }
        for (int i = 10; i < 20; i++) {
            xLocacionesJugador[i] = 733;
            yLocacionesJugador[i] = 733 - (i - 10) * 70;
        }
        for (int i = 20; i < 30; i++) {
            xLocacionesJugador[i] = 733 - (i - 20) * 70;
            yLocacionesJugador[i] = 33;
        }
        for (int i = 30; i < 40; i++) {
            xLocacionesJugador[i] = 33;
            yLocacionesJugador[i] = 33 + (i - 30) * 70;
        }

        locacionesJugadores.add(xLocacionesJugador);
        locacionesJugadores.add(yLocacionesJugador);
    }

    static HashMap<Integer, Integer> registroPropiedad = new HashMap<>();
}
