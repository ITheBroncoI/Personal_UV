package com.example.libreriaquijote.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Builder
public class LibroDTO {
        private int id;
        private int id_sucursal;
        private int id_genero;
        private int id_editorial;
        private String nombre;
        private Date fecha_publicacion;
        private float precio;
        private LocalDateTime createOn;
        private LocalDateTime updateOn;
}
