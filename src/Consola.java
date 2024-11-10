package programacion.damas;

public class Consola {

    //paso 1 crea la clase de utilidades Consola
    //paso 2 crea el constructor
    private Consola() {}

    // crea el metodo mostrarMenu
    public static void mostrarMenu(){
        System.out.println("menu de opciones");
        System.out.println("1. crear dama por defecto");
        System.out.println("2. crear dama eligiendo el color");
        System.out.println("3. mover");
        System.out.println("4. salir");
    }


}
