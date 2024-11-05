package programacion.damas;

public enum Direccion {

    //paso 1 crea un enumerado
    NORESTE ("noreste"), SURESTE ("sureste"), SUROESTE ("suroeste"), NOROESTE ("noroeste");

    //paso 2 crea el atributo
    private String cadenaAMostrar;

    //paso 3 crea el constructor
    private Direccion (String cadenaAMostrar)
    {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    //paso 4 crea el metodo
    @java.lang.Override
    public java.lang.String toString() {
        return "Direccion{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}
