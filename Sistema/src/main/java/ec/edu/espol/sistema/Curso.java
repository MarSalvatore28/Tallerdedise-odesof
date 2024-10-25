/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sistema;

/**
 *
 * @author marsa
 */
import java.util.List;
import java.util.logging.Logger;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private List<ActividadSumativa> actividadesSumativas;
    private Profesor responsable;

    // Getters y setters

    public Curso(String id, String nombre, boolean estadoDisponible, List<Estudiante> estudiantesInscritos, List<Estudiante> estudiantesEnEsperaDeInscripcion, List<ActividadSumativa> actividadesSumativas, Profesor responsable) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.actividadesSumativas = actividadesSumativas;
        this.responsable = responsable;
    }
    private static final Logger LOG = Logger.getLogger(Curso.class.getName());

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public Profesor getResponsable() {
        return responsable;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }
    
    
}

