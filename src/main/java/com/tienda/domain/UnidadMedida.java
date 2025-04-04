
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "FIDE_UNIDAD_MEDIDA_TB")
public class UnidadMedida implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_UNIDAD_MEDIDA")
    private int idUnidadMedida;

    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
}
