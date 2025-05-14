import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    public static void menu() {



        do {
            System.out.println("Elige una opción: ");
            System.out.println("1. Crear coche");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Mostrar velocidad");
            System.out.println("5. Salir");
            Scanner scanner = new Scanner(System.in);

            int opcion = scanner.nextInt();



            switch (opcion) {
                case 1:
                    System.out.println("Introduce el modelo del coche: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la matrícula del coche: ");
                    String matricula = scanner.nextLine();
                    Model miModel = new Model();
                    miModel.crearCoche(modelo, matricula);
                    break;
                case 2:
                    System.out.println("Introduce la matrícula del coche: ");
                    String matricula2 = scanner.nextLine();
                    System.out.println("Introduce la velocidad a aumentar: ");
                    int velocidadAumentar = scanner.nextInt();
                    Model miModel2 = new Model();
                    miModel2.aumentarVelocidad(matricula2, velocidadAumentar);
                    break;
                case 3:
                    System.out.println("Introduce la matrícula del coche: ");
                    String matricula3 = scanner.nextLine();
                    System.out.println("Introduce la velocidad a disminuir: ");
                    int velocidadDisminuir = scanner.nextInt();
                    Model miModel3 = new Model();
                    miModel3.disminuirVelocidad(matricula3, velocidadDisminuir);
                    break;
                case 4:
                    System.out.println("Introduce la matrícula del coche: ");
                    String matricula4 = scanner.nextLine();
                    Model miModel4 = new Model();
                    miModel4.MostrarVelocidad(matricula4);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;


            }

        } while (true);

    }
}
