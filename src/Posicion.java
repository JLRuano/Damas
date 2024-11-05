package programacion.damas;

public class Posicion {

    //paso 1 crear atributos
    private int fila;
    private char columna;

    //paso 2 crear get y set

    //get de fila
    public int getFila() {
        return fila;
    }

    //set de fila
    public void setFila(int fila) {
        if (fila <1 || fila >8) {
            throw new IllegalArgumentException ("la fila tiene que estar entre 1 y 8");
        }
        this.fila = fila;
    }

    //get de columna
    public char getColumna() {
        return columna;
    }

    //set de columna
    public void setColumna(char columna) {
        if (columna < "a" || columna > "h") {
            throw new IllegalArgumentException ("la columna debe estar entre "a" y "h"");
        }
        this.columna = columna;
    }
}
