/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sistema;

/**
 *
 * @author marsa
 */
import java.util.Date;
import java.util.logging.Logger;

public class ActividadSumativa {
    private String titulo;
    private Date fechaDeEntrega;
    private float puntajeMaximo;
    private String contenido;
    private float calificacion;
    private String id;

    // Getters y setters

    public ActividadSumativa(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }
    private static final Logger LOG = Logger.getLogger(ActividadSumativa.class.getName());

    public String getTitulo() {
        return titulo;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String getId() {
        return id;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
