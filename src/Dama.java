package programacion.damas;

public class Dama {
    //paso 1 crear atributos
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;


    //paso 3 crear constructor
    public Dama (Color color, Posicion posicion) {
        this.color = color.BLANCO;
        this.posicion = crearPosicionInicial;
        this.esDamaEspecial = false;
    }

    //paso 4 constructor color
    public Dama (Color color) {
        setColor(color);
        this.posicion = crearPosicionInicial();
        this.esDamaEspecial = false;
    }

    //paso 2 crear los get y set

    //get de color
    public Color getColor() {
        return color;
    }
    //set de color
    private void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException ("el color no es valido");
        }
        this.color = color;
    }

    //get de posicion
    public Posicion getPosicion() {
        return posicion;
    }
    //set de posicion
    private void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException ("la posicion no es valida");
        }
        this.posicion = posicion;
    }


    //paso 5 metodo mover
    public void mover (Direccion direccion, int pasos)
    //paso 5.1 la direccion no puede ser nula
        throws OperationNotSupportedException {
        if (direccion == null) {
            throw IllegalArgumentException("la direccion no puede ser nula");
        }
        //paso 5.1.1 si la dama aun no es especial
        if (!esDamaEspecial && pasos>1) {
            throw IllegalArgumentException("si la dama no es especial no puede moverse mas de un paso");
        }
        //paso 5.2 casillas que se mueve la dama
        if (pasos <1) {
            throw IllegalArgumentException("el numero de pasos no puede ser menor que 1");
        }

        //movimientos
        int nuevaFila = posicion.getFila();
        char nuevaColumna = posicion.getColumna();

        switch (direccion) {
            case NORESTE:
                nuevaFila += pasos;
                nuevaColumna += pasos;
                break;
            case SURESTE:
                nuevaFila -= pasos;
                nuevaColumna += pasos;
                break;
            case SUROESTE:
                nuevaFila -= pasos;
                nuevaColumna -= pasos;
                break;
            case NOROESTE:
                nuevaFila += pasos;
                nuevaColumna -= pasos;
                break;

        }
        //5.4 si no se puede realizar un movimiento
        if (nuevaFila <1 !! nuevaFila >8 || nuevaColumna < "a" || nuevaColumna > "h"){
            throw new OperationNotSupportedException("el movimiento sale del tablero");
        }

        //paso 5.3 si la dama llega al extremo del tablero
        if ((color == Color.BLANCO && nuevaFila == 8) || (Color.NEGRO && nuevaFila == 1)) {
            esDamaEspecial = true;
        }
    }


    //paso 4.1 metodo crearPosicionInicial

    private Posicion crearPosicionInicial() {
        int fila = 0;
        char columna;

        //copiado
        if (color == Color.BLANCO) {
            fila = (int) (Math.random() * 3) + 1; // Filas 1, 2, o 3
        } else if (color == Color.NEGRO) {
            fila = (int) (Math.random() * 3) + 6; // Filas 6, 7, o 8
        }

        do {
            columna = (char) ('a' + (int) (Math.random() * 8)); // Columnas 'a' a 'h'
        } while (!esCasillaNegra(fila, columna));

        return new Posicion(fila, columna);
    }



    //paso 6 crea el metodo toString
    @java.lang.Override
    public java.lang.String toString() {
        return "Dama{" +
                "color=" + color +
                ", posicion=" + posicion +
                ", esDamaEspecial=" + esDamaEspecial +
                '}';
    }
}
