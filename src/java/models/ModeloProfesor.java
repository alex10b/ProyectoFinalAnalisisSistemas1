/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Diana
 */
public class ModeloProfesor {

  

   public ModeloProfesor(String Carnet_profesor, String Nombres, String Apellidos, String Carrera) {
      this.Carnet_profesor = Carnet_profesor;
      this.Nombres = Nombres;
      this.Apellidos = Apellidos;
      this.Carrera = Carrera; 

    }
   
      public ModeloProfesor() {
      this.Carnet_profesor = null;
      this.Nombres = null;
      this.Apellidos = null;
      this.Carrera = null; 
    }

    /**
     * @return the Carnet_profesor
     */
    public String getCarnet_profesor() {
        return Carnet_profesor;
    }

    /**
     * @param Carnet_profesor the Carnet_profesor to set
     */
    public void setCarnet_profesor(String Carnet_profesor) {
        this.Carnet_profesor = Carnet_profesor;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
  
private String Carnet_profesor;
private String Nombres;
private String Apellidos;
private String Carrera; 
    
}
