package tablero;

import juego.*;

public class Casilla {
    private String nombre;
    private Pieza pieza;
    private int numero;
    private String color;
    private Boolean ocupada;

    public Casilla(String nombre, Pieza pieza, int numero, String color) {
        this.nombre = nombre;
        this.pieza = pieza;
        this.numero = numero;
        this.color = color;
        ocupar();
    }

    public void ocupar() {
        if (pieza != null) {
            this.ocupada = true;
        }else {
            this.ocupada = false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }
}
