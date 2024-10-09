/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private Notificador notificador;

    public Usuario(String nombre, String identificacion, Notificador notificador) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.notificador = notificador;
    }
    
    public void generarCorreo() {
        Correo correo = new Correo("Asunto", "Contenido del correo.");
        getNotificador().enviar(correo, this);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the notificador
     */
    public Notificador getNotificador() {
        return notificador;
    }

    /**
     * @param notificador the notificador to set
     */
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
    
}
