package programacion.damas;

public class Posicion {

    //paso 1 crear atributos
    private int fila;
    private char columna;


    //paso 3 constructor fila y columna

    public Posicion (int fila, char columna) {
            setFila(fila);
            setColumna(columna);
    }

    //paso 5 constructor copia
    public Posicion (Posicion posicion) {
        this.fila = fila;
        this.columna = columna;
    }



    //paso 2 crear get y set


    //set de fila
    private void setFila(int fila) {
        if (fila <1 || fila >8) {
            throw new IllegalArgumentException ("la fila tiene que estar entre 1 y 8");
        }
        this.fila = fila;
    }

    //get de fila
    public int getFila() {
        return fila;
    }


    //set de columna
    private void setColumna(char columna) {
        if (columna < "a" || columna > "h") {
            throw new IllegalArgumentException ("la columna debe estar entre "a" y "h"");
        }
        this.columna = columna;
    }


    //get de columna
    public char getColumna() {
        return columna;
    }


}
