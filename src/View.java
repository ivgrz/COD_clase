/**
 * Clase encargada de la interacción con el usuario
 * y la presentación de datos
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     *
     *
     * @return true si se ha mostrado correctamente
     */
    public static void menu(){
        do {
            System.out.println("1. Crear coche");
            System.out.println("0. Salir");

            int opcion = 1;
            switch (opcion){
                case 1:
                    String modelo = "";
                    String matricula = "";
                    Controller.crearCoche(modelo, matricula);
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (true);
    }

    public static boolean muestraVelocidad(String s, int velocidad) {
        System.out.println(s + ": " + velocidad + "km/h");
        return true;
    }


}
