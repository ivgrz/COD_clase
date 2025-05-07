/**
 * Controller.java
 *
 * @author Ivan Gutierrez
 * @version 1.0
 */

import java.lang.module.ModuleDescriptor;


public class Controller {
    public static void main(String[] args) {
        // Instanciamos la vista y el modelo
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
        } ;
     int comprobacion = 0;

        comprobacion = miModel.aumentarVelocidad("SBC 1234", 20);
        comprobacion = miModel.disminuirVelocidad("SBC 1234", 10);

        if (comprobacion != -1) {
        System.out.println(miModel.getVelocidad("SBC 1234"));

        } else {
        System.out.println("Error");
        }
    }

    public static void inicio() {
    }
    public static Coche crearCoche(String modelo, String matricula) {
        return new Coche(modelo, matricula);
    }
}