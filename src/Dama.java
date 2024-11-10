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




}
