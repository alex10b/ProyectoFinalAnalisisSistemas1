package modelo_curso;

/**
 *
 * @author L
 */
public class ModeloCurso {
    int Curso;
    String Nombre_Curso;
    String horario;
    String Nombre_catedratico;

    public ModeloCurso(int Curso, String Nombre_Curso, String horario, String Nombre_catedratico) {
        this.Curso = Curso;
        this.Nombre_Curso = Nombre_Curso;
        this.horario = horario;
        this.Nombre_catedratico = Nombre_catedratico;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }

    public String getNombre_Curso() {
        return Nombre_Curso;
    }

    public void setNombre_Curso(String Nombre_Curso) {
        this.Nombre_Curso = Nombre_Curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombre_catedratico() {
        return Nombre_catedratico;
    }

    public void setNombre_catedratico(String Nombre_catedratico) {
        this.Nombre_catedratico = Nombre_catedratico;
    }
    
      
    
    
    
    
}

