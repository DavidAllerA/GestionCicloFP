/**
 * @author david
 */
import java.util.ArrayList;

public class Busqueda {
	/**
	 * Metodo buscarEstudiante que sirve para buscar a un estdiante
	 * @param listaEstudiantes
	 * @param idEstudiante
	 * @return
	 */
	public Estudiante buscarEstudiante(ArrayList<Estudiante> listaEstudiantes, int idEstudiante) {
    	for (Estudiante e : listaEstudiantes) { 
            if (e.getIdEstudiante() == idEstudiante) {
                return e;    
            }
        }
    	return null;
    }
    /**
     * Metodo buscarCiclo que sirve para buscar un ciclo
     * @param listaCiclos
     * @param nombreCiclo
     * @return
     */
	public Ciclo buscarCiclo(ArrayList<Ciclo> listaCiclos, String nombreCiclo) {
    	for (Ciclo c : listaCiclos) { 
            if (c.getNombreCiclo().equals(nombreCiclo)) {
                return c;  
            }
        }
    	return null;
    }
}
