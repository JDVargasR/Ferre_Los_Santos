package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "FIDE_PRODUCTO_TB")
public class Producto implements Serializable {

   @Id
    @Column(name = "ID_PRODUCTO")
    private int idProducto;

    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "ID_UNIDAD_MEDIDA")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;
}
