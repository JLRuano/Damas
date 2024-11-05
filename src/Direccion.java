package programacion.damas;

public enum Direccion {

    NORESTE ("noreste"), SURESTE ("sureste"), SUROESTE ("suroeste"), NOROESTE ("noroeste");

    private String cadenaAMostrar;

    private Direccion (String cadenaAMostrar)
    {
        this.cadenaAMostrar = cadenaAMostrar;
    }
}
