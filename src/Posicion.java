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
        if (posicion == null) {
            throw new IllegalArgumentException ("no se puede dar una posicion nula");
        }
        this.fila = posicion.fila;
        this.columna = posicion.columna;
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


    //paso 5 crea los metodos equals y hashCode


    //hashCode
    public int hashCode() {
        return Objects.hash(super.hashCode(), fila, columna);
    }
    //equals
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Posicion posicion = (Posicion) object;
        return fila == posicion.fila && columna == posicion.columna;
    }

    //paso 6 crea el metodo toString
    @java.lang.Override
    public java.lang.String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
