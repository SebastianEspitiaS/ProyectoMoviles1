package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.UsuarioValidacion;

public class Usuario {

    private Integer id;
    private String documento;
    private String nombre;
    private String correo;
    private Integer ubicacion;

    private Util util = new Util();
    private UsuarioValidacion validacion = new UsuarioValidacion();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombre, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.generarId();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento)  {
            this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
      try {
        this.validacion.validarNombre(nombre);
        this.nombre = nombre;
      }catch (Exception error){
          System.out.println("\u001B[37m" + error.getMessage() +  "\u001B[0m");
      }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            this.validacion.validarCorreo(correo);
            this.correo = correo;
        }catch (Exception error){
            System.out.println("\u001B[37m" + error.getMessage() +  "\u001B[0m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
       try {
           this.validacion.validarUbicacion(ubicacion);
           this.ubicacion = ubicacion;
       }catch (Exception error){
           System.out.println("\u001B[37m" + error.getMessage() +  "\u001B[0m");
       }
    }


    //1.Registrarse en plataforma
    // public abstract Boolean registrar();


}




