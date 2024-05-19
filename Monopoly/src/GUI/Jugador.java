package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Jugador {

    private String nombre;
    private int numeroJugador;
    private Color color;
    private int x;
    private int y;
    private int posicion;
    private ArrayList<int[]> locacionesJugadores = new ArrayList<>();
    private int casillaActual = 1;
    private ArrayList<Integer> propiedades = new ArrayList<>();
    private int dinero = 3200;
    private PanelTablero_Monopoly panelTablero;

    public Jugador(String nombre, int numeroJugador, Color color, int x, int y) {
        this.color = color;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.posicion = posicion;
        this.numeroJugador = numeroJugador;
        this.panelTablero = panelTablero;
    }

    public void setPanelTablero(PanelTablero_Monopoly panelTablero) {
        this.panelTablero = panelTablero;
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
        System.out.println("Dia de pago para el jugador " + getNumeroJugador() + "! Has ganado $200.");
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

    public void comprarPropiedadEnCasilla(int numeroCasilla, int precio) {
        if (registroPropiedad.containsKey(numeroCasilla)) {
            JOptionPane.showMessageDialog(panelTablero, "Esta propiedad ya ha sido comprada por alguien. No puedes comprarla aquí.");
        } else {
            if (dinero >= precio) {
                propiedades.add(numeroCasilla);
                registroPropiedad.put(numeroCasilla, this.getNumeroJugador());
                restarDinero(precio);
                JOptionPane.showMessageDialog(panelTablero, "Propiedad comprada satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(panelTablero, "No tienes suficiente dinero para comprar esta propiedad.");
            }
        }
    }

    public void pagarRentaEnCasilla(int numeroCasilla, int precioAlquiler) {
        if (registroPropiedad.containsKey(numeroCasilla)) {
            int propietarioNumero = registroPropiedad.get(numeroCasilla);
            if (propietarioNumero != this.numeroJugador) {
                Jugador propietario = panelTablero.obtenerJugadorPorNumero(propietarioNumero);
                this.restarDinero(precioAlquiler);
                propietario.sumarDinero(precioAlquiler);
                JOptionPane.showMessageDialog(panelTablero, "Jugador " + this.getNombre() + " pago $" + precioAlquiler + " de renta a " + propietario.getNombre());
            }
        } 
    }

    static HashMap<Integer, Integer> registroPropiedad = new HashMap<>();
}
