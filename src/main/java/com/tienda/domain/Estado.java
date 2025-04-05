package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name = "FIDE_ESTADO_TB")
@Data
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_ESTADO")
    private int idEstado;

    @Column(name = "ACTIVO")
    private boolean activo;

    public Estado(int id) {
        this.idEstado = id;
    }
}
