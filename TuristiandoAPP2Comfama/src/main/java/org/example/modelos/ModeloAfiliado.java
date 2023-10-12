package org.example.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Afiliados")

public class ModeloAfiliado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String documento;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String contraseña;

    @Column(nullable = false)
    private Double valorMensualidad;

    @Column(nullable = true)
    private String cedulaInvitado;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Double getValorMensualidad() {
        return this.valorMensualidad;
    }

    public void setValorMensualidad(Double valorMensualidad) {
        this.valorMensualidad = valorMensualidad;
    }

    public String getCedulaInvitado() {
        return this.cedulaInvitado;
    }

    public void setCedulaInvitado(String cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }

    @Override
    public String toString() {
        return "{" +
            "\n id= " + getId() + "\n" +
            ", documento= " + getDocumento() + "\n" +
            ", nombre= " + getNombre() + "\n" +
            ", correo= " + getCorreo() + "\n" +
            ", contraseña= " + getContraseña() + "\n" +
            ", valorMensualidad= " + getValorMensualidad() + "\n" +
            ", cedulaInvitado= " + getCedulaInvitado() + "\n" +
            "}";
    }

}
