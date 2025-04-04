
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "FIDE_INVENTARIO_TB")
public class Inventario implements Serializable {

    @Id
    @Column(name = "ID_INVENTARIO")
    private int idInventario;

    @Column(name = "CANTIDAD_DISPONIBLE")
    private int cantidadDisponible;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_SEDE")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;

    public Inventario() {
    }
}