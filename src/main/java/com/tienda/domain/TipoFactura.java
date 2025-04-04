
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "FIDE_TIPO_FACTURA_TB")
public class TipoFactura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_TIPO_FACTURA")
    private int idTipoFactura;

    @Column(name = "NOMBRE")
    private String nombre;
}