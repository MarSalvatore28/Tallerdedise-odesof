/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.softwareumlcode;

/**
 *
 * @author marsa
 */
import java.util.Date;
import java.util.List;

public class Incidente {
    private int id;
    private Date fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private Date fechaCerrado;
    private String tipo;

    // Getters y setters

    public Incidente(int id, Date fechaReportado, String estado, String titulo, String descripcion, List<String> logActualizaciones, Date fechaCerrado, String tipo) {
        this.id = id;
        this.fechaReportado = fechaReportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logActualizaciones = logActualizaciones;
        this.fechaCerrado = fechaCerrado;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public Date getFechaReportado() {
        return fechaReportado;
    }

    public String getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getLogActualizaciones() {
        return logActualizaciones;
    }

    public Date getFechaCerrado() {
        return fechaCerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaReportado(Date fechaReportado) {
        this.fechaReportado = fechaReportado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLogActualizaciones(List<String> logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }

    public void setFechaCerrado(Date fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
