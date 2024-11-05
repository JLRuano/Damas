package programacion.damas;

public enum Color {

    //paso 1 crea los literales

    BLANCO ("blanco"), NEGRO ("negro");

    //paso 2 crea el atributo
    private String cadenaAMostrar;

    // paso 3 crea el constructor
   private Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }


    //paso 4 crear el metodo toString
    @java.lang.Override
    public java.lang.String toString() {
        return "Color{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}
