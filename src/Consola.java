package programacion.damas;

public class Consola {

    //paso 1 crea la clase de utilidades Consola
    //paso 2 crea el constructor
    private Consola() {}

    //paso 3 crea el metodo mostrarMenu
    public static void mostrarMenu(){
        System.out.println("menu de opciones");
        System.out.println("1. crear dama por defecto");
        System.out.println("2. crear dama eligiendo el color");
        System.out.println("3. mover");
        System.out.println("4. salir");
    }

    //paso 4 crea el metodo elegirOpcionMenu
    publiv static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.print("elige una opcion del menu dando un numero entre el 1 y el 4: ");
            opcion = scanner.nextInt();
        } while (opcion <1 || opcion > 4);
        return opcion;
    }

    //paso 5 crea el metodo elegirOpcion
    public static Color elegirOpcion() {
        int opcion;
        do {
            System.out.println("elige una opcion entre:");
            System.out.println("1. blanco");
            System.out.println("2. negro");
            opcion = scanner.nextInt();
        } while (opcion <1 || opcion > 2);
        return (opcion == 1) ? Color.BLANCO : Color.NEGRO;
    }




}
