package programacion.damas;

public class MainApp {

    //paso 1 crea el atributo de clase dama
    private static Dama dama;


    //paso 7 crear metodo main
    public static void main(String[] args) {
    int opcion;
    do {
        Consola.mostrarMenu();
        opcion = Consola.elegirOpcionMenu();
        ejecutarOpcion(opcion);
    }while (opcion != 4);
    }
}


    //paso 2 crea el metodo ejecutarOpcion
    private static void ejecutarOpcion (int opcion) {
        switch (opcion) {
            case 1:
                crearDamaDefecto;
                break;
            case 2:
                ;
                break;
            case 3:
                ;
                break;
            case 4:
                ;
                break;

        }

        //paso 3 crear metodo crearDamaDefecto
        private static void crearDamaDefecto() {
            dama = new Dama();
        }

        //paso 4 crear metodo crearDamaColor
        private static void crearDamaColor() {
            Color color = Consola.elegirOpcion();
            dama = new Dama(color);
        }

        //paso 5 crear metodo mover
        private static void mover() {
            if (dama == null) {
                System.out.println("antes tienes que crear una dama");
                return;
            }

            Consola.mostrarMenuDirecciones();
            Direccion direccion = Consola.ElegirDireccion();
            int pasos = dama.isEsDamaEspecial() ? Consola.ElegirPasos() : 1;

            //copiado
            try {
                dama.mover(direccion, pasos);
            } catch (OperationNotSupportedException e) {
                System.out.println(e.getMessage());
            }

            // paso 6 crear metodo mostrarDama
        private static void mostrarDama() {
                if (dama != null) {
                    System.out.println(dama);
                } else {
                    System.out.println("no hay dama creada");
                }
            }

    }


}
