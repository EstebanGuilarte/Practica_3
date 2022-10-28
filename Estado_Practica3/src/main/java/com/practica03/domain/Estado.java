package com.practica03.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long idEstado;
     private String nombreEstado;
     private String nombreCapital;
     private String cantidadPoblacion;
     private String cantidadCostas;

    public Estado(String nombreEstado, String nombreCapital, String cantidadPoblacion, String cantidadCostas) {
        this.nombreEstado = nombreEstado;
        this.nombreCapital = nombreCapital;
        this.cantidadPoblacion = cantidadPoblacion;
        this.cantidadCostas = cantidadCostas;
    }

    public Estado() {
    }
}
