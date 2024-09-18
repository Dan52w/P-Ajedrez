package tablero;

import juego.*;

public class Tablero {
    private Casilla[][] tablero;
    Boolean color = true;

    public Tablero() {
        this.tablero = new Casilla[8][8];
    }

    public void newtablero() {
        String nom;
        String col = "Negro";
        Pieza p;
        int i = 0;
        int k = i;
        char let[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                nom = ""+let[j] + i;
                if(i == k){
                    col = altenarColor(color);
                }else{
                    k = i;
                }
                p = aggPieza(i,let[j]);
                tablero[i][j] = new Casilla(nom, p,i,col);
            }
        }
    }

    public String altenarColor(Boolean color) {
        String col;
        if (color) {
            col = "Negro";
            this.color = false;
        }else{
            col = "Blanco";
            this.color = true;
        }
        return col;
    }

    public Pieza aggPieza(int i, char letra){
        Pieza pz = new Pieza("-", "-", "-");
        if((i>1) && (i<6)){
            return pz;
        } else {
            String posicion;
            posicion = ""+letra + i;
            if(i == 1 || i == 6){
                Peon peon;
                if(i == 1){
                    peon = new Peon("P"+posicion,posicion, "Blanco");
                }else {
                    peon = new Peon("P"+posicion,posicion, "Negro");
                }
                return peon;
            } else if (((i == 0)||(i == 7)) && ((letra == 'A') || (letra == 'H'))) {
                Torre torre;
                if(i == 0 || i == 7){
                    torre = new Torre("T"+posicion,posicion, "Blanco");
                }else {
                    torre = new Torre("T"+posicion,posicion, "Negro");
                }
                return torre;
            } else if (((i == 0)||(i == 7)) && ((letra == 'B') || (letra == 'G'))) {
                Caballo caballo;
                if(i == 0 || i == 7){
                    caballo = new Caballo("C"+posicion,posicion, "Blanco");
                }else {
                    caballo = new Caballo("C"+posicion,posicion, "Negro");
                }
                return caballo;
            }
        }
        return pz;
    }

    public void imprimir(){
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print("[ "+ tablero[i][j].getPieza().getNombre()+" ] ");
            }
            System.out.println();
        }
    }
}
