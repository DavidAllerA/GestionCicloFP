/**
 * @author david
 */
public class Estudiante {
    private String nombreEstudiante;  
    private int idEstudiante;         
    private int edadEstudiante;       
   /**
    * Constructor
    * @param nombreEstudiantes
    * @param idEstudiante
    * @param edadEstudiante
    */
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
       
    }
    /**
     * Metodo que nos devuelve los datos del estudiante
     * @return
     */
    public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }
    /**
     * Metodo que devuelve el id del estudiante
     * @return
     */
    public int getIdEstudiante() {
    	return this.idEstudiante;
    }
    /**
     * Metodo que devuelve el nombre del estudiante
     * @return
     */
    public String getNombreEstudiante() {
    	return this.nombreEstudiante;
    }
    /**
     * Metodo que devuelve la edad del estudiante
     * @return
     */
    public int getEdadEstudiante() {
    	return this.edadEstudiante;
    }
    /**
     * Metodo para cambiar el id del estudiante
     * @param nuevoIdEstudiante
     */
    public void setIdEstudiante(int nuevoIdEstudiante) {
    	this.idEstudiante = nuevoIdEstudiante;
    }
    /**
     * Metodo para cambiar la edad del estudiante
     * @param nuevoEdadEstudiante
     */
    public void setEdadEstudiante(int nuevoEdadEstudiante) {
    	this.edadEstudiante = nuevoEdadEstudiante;
    }
    /**
     * Metodo para cambiar el nombre del estudiante
     * @param nuevoNombreEstudiante
     */
    public void setNombreEstudiante(String nuevoNombreEstudiante) {
    	this.nombreEstudiante = nuevoNombreEstudiante;
    }
    
}
