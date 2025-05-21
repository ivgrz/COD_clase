import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;

public class Controller {
    // Instanciamos la vista y el modelo
    View miView = new View();
    Model miModel = new Model();

    public Controller() {
        this.miModel = new Model();
        this.miView = new View();
    }
    public static void main(String[] args) {
        View miView = new View();
        Model miModel = new Model();

        // Crear tres coches
        miModel.crearCoche("LaFerrari", "SBC 1234");
        miModel.crearCoche("Alpine", "HYU 4567");
        miModel.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModel.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        }
        ;
 }
        /**
         * Elimina un coche del parking por su matrícula.
         * @param matricula Matrícula del coche a eliminar.
         */
        public void eliminarCoche (String matricula){
            Coche coche = miModel.getCoche(matricula);
            if (coche != null) {
                Model.parking.remove(coche);
                System.out.println("Coche eliminado correctamente.");
            } else {
                System.out.println("Coche no encontrado.");
            }
        }


        /**
         * Muestra los detalles de un coche por su matrícula.
         * @param matricula Matrícula del coche a mostrar.
         */
        public void mostrarDetallesCoche (String matricula){
            Coche coche = miModel.getCoche(matricula);
            if (coche != null) {
                System.out.println(coche.toString());
            } else {
                System.out.println("Coche no encontrado.");
            }
        }

        /**
         * Resetea la velocidad de un coche a 0.
         * @param matricula Matrícula del coche a resetear.
         */
        public void resetearVelocidad (String matricula){
            Coche coche = miModel.getCoche(matricula);
            if (coche != null) {
                coche.velocidad = 0;
                System.out.println("Velocidad reseteada a 0.");
            } else {
                System.out.println("Coche no encontrado.");
            }


        }
    public void aumentarVelocidad(String matricula, int incremento) {
        Coche coche = miModel.getCoche(matricula);
        if (coche != null) {
            miModel.cambiarVelocidad(matricula, coche.velocidad + incremento);
            System.out.println("Velocidad aumentada correctamente.");
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public void disminuirVelocidad(String matricula, int decremento) {
        Coche coche = miModel.getCoche(matricula);
        if (coche != null) {
            miModel.cambiarVelocidad(matricula, coche.velocidad - decremento);
            System.out.println("Velocidad disminuida correctamente.");
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

}