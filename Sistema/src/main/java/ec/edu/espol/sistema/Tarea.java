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

public class Tarea {
    private Date fechaDePublicacion;

    // Getters y setters

    public Tarea(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
    
}
