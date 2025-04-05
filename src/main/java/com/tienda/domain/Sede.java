package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name = "FIDE_SEDE_TB")
@Data
public class Sede implements Serializable {

    @Id
    @Column(name = "ID_SEDE")
    private int idSede;

    @Column(name = "NOMBRE_SEDE")
    private String nombreSede;

    public Sede(int id) {
        this.idSede = id;
    }

}
