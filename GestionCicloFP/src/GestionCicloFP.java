/**
 * @author david
 */
/**
 * Desde aqui se puede matricular y añadir alumnos y ciclo
 */
import java.util.ArrayList;

public class GestionCicloFP {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(); 
    private ArrayList<Ciclo> listaCiclos = new ArrayList<>();
    private Busqueda busqueda = new Busqueda();
    /**
     * Metodo que permite agregar un estudiante
     * @param nombre
     * @param id
     * @param edad
     */
    public void agregarEstudiante(String nombre, int id, int edad) {  
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }
    /**
     * Metodo que permite crear un ciclo
     * @param nombreCiclo
     */
    public void agregarCiclo(String nombreCiclo) { 
    	listaCiclos.add(new Ciclo(nombreCiclo));
    }
    /**
     * Metodo que metricula a un estudiante en un ciclo   
     * @param idEstudiante
     * @param nombreCiclo
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) { 
        Estudiante est = busqueda.buscarEstudiante(listaEstudiantes, idEstudiante);
        Ciclo ciclo = busqueda.buscarCiclo(listaCiclos, nombreCiclo);
        if (est != null && ciclo != null) {
            ciclo.agregarEstudiante(est);
        }
    }
    /**
     * Metodo que muestra los ciclos con sus respectivos datos
     */
    public void mostrarCiclos() { 
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.getDatosCiclo());
        }
    }

}

