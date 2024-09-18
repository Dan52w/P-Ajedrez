package juego;

public class Pieza {
    protected String nombre;
    protected String posicionInicial;
    protected String posicionFinal;
    protected boolean derrotado;
    protected String color;

    public Pieza(String nombre, String posicionInicial, String color) {
        this.nombre = nombre;
        this.posicionInicial = posicionInicial;
        this.color = color;
        derrotado = false;
    }

    public boolean mover() {return Boolean.parseBoolean(null);}

    public boolean derretodo() {return Boolean.parseBoolean(null);}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicionInicial() {
        return posicionInicial;
    }

    public void setPosicionInicial(String posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    public String getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(String posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public boolean isDerrotado() {
        return derrotado;
    }

    public void setDerrotado(boolean derrotado) {
        this.derrotado = derrotado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
