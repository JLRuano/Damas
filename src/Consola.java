package programacion.damas;

import java.util.Scanner;
public class Consola {

    private static final Scanner scanner = new Scanner(System.in);
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

    //paso 6 crea el metodo mostrarMenuDirecciones
    public static void mostrarMenuDirecciones() {}
    System.out.println("direcciones");
    System.out.println("1. noreste");
    System.out.println("2. sureste");
    System.out.println("3. suroeste");
    System.out.println("4. noroeste");
}

    //paso 7 crea el metodo elegirDireccion
    public static Direccion elegirDireccion() {
        int opcion;
        do {
            System.out.println("elige una direccion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion >4);
        switch (opcion) {
            case 1:
                return Direccion.NORESTE;
            case 2:
                return direccion.SURESTE;
            case 3:
                return Direccion.SUROESTE:
            case 4:
                return Direccion:NOROESTE:
            default:
                throw new IllegalArgumentException("direccion no disponible");
        }

        //paso 8 crear metodo elegirPasos
        public static int elegirPasos() {
            int pasos;
            do {
                System.out.print("elige el numero de casillas: ");
                pasos = scanner.nextInt();
            }while (pasos <1);
            return pasos;
        }

    }
