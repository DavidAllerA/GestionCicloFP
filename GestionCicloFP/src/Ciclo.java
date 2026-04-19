/**
 * @author david
 */
import java.util.ArrayList;

public class Ciclo {
    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    /**
     * Constructor
     * @param nombreCiclo
     */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }
    /**
     * Metodo qque nos permite añadir estudiantes a lista de estudiantes
     * @param e
     */
    public void agregarEstudiante(Estudiante e) { 
        listaEstudiantes.add(e); 
    }
    
    /**
     * Metodo que nos devuelve ciclo y los datos de los estudiantes del ciclo
     * @return
     */
    public String getDatosCiclo() {  
        StringBuilder datos = new StringBuilder("Ciclo: " + nombreCiclo + "\nEstudiantes:\n");
        for (Estudiante e : listaEstudiantes) {
        	datos.append(e.datosEstudiante()).append("\n");
        }
        return datos.toString();
    }
    /**
     * Metodo que devuekve el nombre del ciclo
     * @return
     */
    public String getNombreCiclo() {
    	return this.nombreCiclo;
    }
    /**
     * Metodo para modificar el nombre del ciclo
     * @param nuevoNombreCiclo
     */
    public void setNombreCiclo(String nuevoNombreCiclo) {
    	this.nombreCiclo = nuevoNombreCiclo;
    }
}
