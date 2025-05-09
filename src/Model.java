import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 * y la lógica del programa
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     *
     * @param modelo    del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche según matrícula
     *
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula) {
        Coche aux = null;
        // recorre el array buscando por matrícula
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     *
     * @param matricula
     * @param v         nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     *
     * @param matricula
     * @return
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    public int aumentarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad += v;
            return coche.velocidad;

        }
        return -1;
    }
        public int disminuirVelocidad ( String matricula, Integer v){
            Coche coche = getCoche(matricula);
            if (coche != null) {
                coche.velocidad -= v;
                return coche.velocidad;
            }
            return -1;
        }


}
