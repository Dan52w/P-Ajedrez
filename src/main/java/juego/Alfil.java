package juego;

import javax.swing.*;

public class Alfil extends Pieza{
    private String tipo;

    public Alfil(String nombre, String posicionInicial, String color, String tipo) {
        super(nombre, posicionInicial, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
