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

}
